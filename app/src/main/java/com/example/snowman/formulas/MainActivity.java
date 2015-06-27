package com.example.snowman.formulas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] items = getResources().getStringArray(R.array.list_items);

        //this is good
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);
        ListView myListview = (ListView) findViewById(R.id.SnowListView);
        myListview.setAdapter(myAdapter);

        myListview.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String item = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this," item: " + item + " position: " + position,Toast.LENGTH_LONG).show();
                        switch (position){
                            case 0 :
                                Toast.makeText(MainActivity.this, "Starting BMI Calculator", Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(MainActivity.this, BMIClass.class);
                                startActivity(intent);
                                break;
                            case 1 :
                                Intent intent2 = new Intent(MainActivity.this, QuadraticClass.class);
                                startActivity(intent2);
                                break;
                        }

                    }
                }
        );
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

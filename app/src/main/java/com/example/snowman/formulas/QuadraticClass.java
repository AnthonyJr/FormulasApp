package com.example.snowman.formulas;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class QuadraticClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadratic_class);
    }

    public void onButtonClick1(View view){
        double a;
        double b;
        double c;
        double top;
        double bottom;
        double ans;
        EditText EditTextA = (EditText)findViewById(R.id.editTextA);
        EditText EditTextB = (EditText)findViewById(R.id.editTextB);
        EditText EditTextC = (EditText)findViewById(R.id.editTextC);
        TextView AnsPos = (TextView)findViewById(R.id.textViewQuadAnsPos);
        TextView AnsNeg = (TextView)findViewById(R.id.textViewQuadAnsNeg);
        a = Double.parseDouble(EditTextA.getText().toString());
        b = Double.parseDouble(EditTextB.getText().toString());
        c = Double.parseDouble(EditTextC.getText().toString());

        top = (-1 * b) + Math.pow((b*b) - 4 *a* c,1/2);
        bottom = 2*a;
        ans = top/bottom;
        Log.d("QuadClass", Double.toString(ans));
        AnsPos.setText(Double.toString(ans));

        top = (-1 * b) - Math.pow((b*b) - 4* a* c,1/2);
        ans = top/bottom;
        AnsNeg.setText(Double.toString(ans));






    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quadratic_class, menu);
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

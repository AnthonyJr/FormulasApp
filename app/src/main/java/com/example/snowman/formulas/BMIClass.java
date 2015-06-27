package com.example.snowman.formulas;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class BMIClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiclass);
    }

    public void onButtonClick(View view){
        EditText editTextFeet = (EditText)findViewById(R.id.editTextFeet);
        EditText editTextInches = (EditText)findViewById(R.id.editTextInches);
        EditText editTextWeight = (EditText)findViewById(R.id.editTextWeight);
        TextView YourBMI = (TextView)findViewById(R.id.YourBMI); // your bmi is....
        TextView textViewBMI = (TextView)findViewById(R.id.textViewBMI);
        TextView editTextExtraInfo = (TextView)findViewById(R.id.editTextExtraInfo);
        float step1;
        float step2;
        float step3;
        float bmi;
        float feet;
        float inches;
        float weight;

        feet = Float.parseFloat(editTextFeet.getText().toString());
        inches = Float.parseFloat(editTextInches.getText().toString());
        weight = Float.parseFloat(editTextWeight.getText().toString());

        step1 = weight * 703;
        step2 = (feet * 12) + inches;
        step2 = step2 * step2;
        step3 = step1/step2;
        bmi = step3;

        YourBMI.setText("Your BMI is");
        textViewBMI.setText(Float.toString(bmi));
        if (bmi < 18.5){
            textViewBMI.setText("Underweight");
            editTextExtraInfo.setText("Contrary to what you might see on TV, being underweight is also a problem" +
                    ", here is a link where you can learn more: " +
                    "http://familydoctor.org/familydoctor/en/prevention-wellness/food-nu" +
                    "trition/healthy-food-choices/healthy-ways-to-gain-weight-if-youre-underweight.html");
        } else if ((bmi >= 18.5) && (bmi <= 24.9)){
            textViewBMI.setText("Normal");
            editTextExtraInfo.setText(" Just because you are at a normal weight, doesnt mean you shouldnt stay active!" +
                    "follow the link for more details!: http://www.webmd.com/fitness-exercise/no-gym-required-how-to-get-fit-at-home");
        } else if ((bmi >= 25) || (bmi <= 29.9)){
            textViewBMI.setText("Overweight");
            editTextExtraInfo.setText("Being overweight puts you at risk for many different health issues and diseases, learn what you can do about them with" +
                    "this link: http://www.niddk.nih.gov/health-information/health-topics/weight-control/health_ris" +
                    "ks_being_overweight/Pages/health-risks-being-overweight.aspx#l");
        } else if (bmi >= 30.0){
            textViewBMI.setText("Obese");
            editTextExtraInfo.setText("Obese isnt good: http://www.webmd.com/diet/obesity/obesity-health-risks");
        }







    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bmiclass, menu);
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

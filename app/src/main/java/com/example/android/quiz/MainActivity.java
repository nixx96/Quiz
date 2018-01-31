package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /*
    *
    * method call for submit button
    *
    * */
    public void submit(View view) {

        int count = 0;                    //correct answers count

        /*
        *
        * logic written by simple use if/else statements
        *
        * */
        RadioButton radioButton1 = findViewById(R.id.radioButton5);

        if (radioButton1.isChecked()) {
            count++;
        }
        RadioButton radioButton2 = findViewById(R.id.radioButton4);

        if (radioButton2.isChecked()) {
            count++;
        }

        RadioButton radioButton3 = findViewById(R.id.radioButton10);

        if (radioButton3.isChecked()) {
            count++;
        }

        RadioButton radioButton4 = findViewById(R.id.radioButton16);

        if (radioButton4.isChecked()) {
            count++;
        }

        RadioButton radioButton5 = findViewById(R.id.radioButton18);

        if (radioButton5.isChecked()) {
            count++;
        }
        CheckBox checkBox3 = findViewById(R.id.checkBox);
        CheckBox checkBox1 = findViewById(R.id.checkBox2);
        CheckBox checkBox2 = findViewById(R.id.checkBox3);
        CheckBox checkBox4 = findViewById(R.id.checkBox4);


        if (checkBox1.isChecked() && checkBox2.isChecked() && !checkBox3.isChecked() && !checkBox4.isChecked())
            count++;

        CheckBox checkBox5 = findViewById(R.id.checkBox5);
        CheckBox checkBox6 = findViewById(R.id.checkBox6);
        CheckBox checkBox7 = findViewById(R.id.checkBox7);
        CheckBox checkBox8 = findViewById(R.id.checkBox8);

        if (!checkBox5.isChecked() && checkBox6.isChecked() && !checkBox7.isChecked() && checkBox8.isChecked())
            count++;

        EditText editText = findViewById(R.id.EditText1);
        String text1 = String.valueOf(editText.getText());

        if (text1.contentEquals("operating systems") || text1.contentEquals("os") || text1.contentEquals("OPERATING SYSTEMS") || text1.contentEquals("OS"))
            count++;

        EditText editText1 = findViewById(R.id.EditText2);
        String text2 = String.valueOf(editText1.getText());

        if (text2.contentEquals("cheetah") || text2.contentEquals("CHEETAH"))
            count++;

        EditText editText2 = findViewById(R.id.EditText3);
        String text3 = String.valueOf(editText2.getText());

        String scount = String.valueOf(count);
        String text = text3 + ", your score is " + scount;              //formatting the toast text
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();


    }


}


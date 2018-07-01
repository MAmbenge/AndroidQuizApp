package com.example.android.quizapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Initialize the score to zero
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Submit Button is clicked is clicked.
     */
    public void submitAns(View view) {

        EditText queOneField = findViewById(R.id.que_one);
        String ansOne = queOneField.getText().toString();

        CheckBox checkBoxOne = findViewById(R.id.que_two_checkbox_one);
        boolean hasAnsOne = checkBoxOne.isChecked();

        CheckBox checkBoxTwo = findViewById(R.id.que_two_checkbox_two);
        boolean hasAnsTwo = checkBoxTwo.isChecked();

        CheckBox checkBoxThree = findViewById(R.id.que_two_checkbox_three);
        boolean hasAnsThree = checkBoxThree.isChecked();

        RadioButton buttonOne = findViewById(R.id.que_three_radio_one);
        boolean hasAnsFive = buttonOne.isChecked();

        RadioButton buttonThree = findViewById(R.id.que_three_radio_three);
        boolean hasAnsSeven = buttonThree.isChecked();

        EditText queTwoField = findViewById(R.id.que_five);
        String ansTwo = queTwoField.getText().toString();


        String queOneAns = "D";

        if (queOneAns.equals(ansOne)) {
            score = 20;
        } else {
            score = 0;
        }

        if (hasAnsOne && hasAnsTwo && hasAnsThree) {
            Context context = getApplicationContext();
            CharSequence text = "Please select only two answers in Que 2";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        } else {
            if (hasAnsOne && hasAnsTwo) {
                score = score + 20;
            } else if (hasAnsOne) {
                score = score + 10;
            } else if (hasAnsTwo) {
                score = score + 10;
            }
        }

        if (!hasAnsOne && !hasAnsTwo && !hasAnsThree) {
            Context context = getApplicationContext();
            CharSequence text = "Please double check and answer all questions";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }


        if (hasAnsFive) {
            score = score + 20;
        } else {
            Context context = getApplicationContext();
            CharSequence text = "Please double check and answer all questions";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

        if (hasAnsSeven) {
            score = score + 20;
        } else {
            Context context = getApplicationContext();
            CharSequence text = "Please double check and answer all questions";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

        String queOneTwo = "A";
        if (queOneTwo.equals(ansTwo)) {
            score = score + 20;
        } else {
            Context context = getApplicationContext();
            CharSequence text = "Please double check and answer all questions";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }


        if (ansOne.matches("") && ansTwo.matches("")) {
            Context context = getApplicationContext();
            CharSequence text = "Please double check and answer all questions";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

        Context context = getApplicationContext();
        CharSequence text = "Your score is: " + score + " out of 100";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}

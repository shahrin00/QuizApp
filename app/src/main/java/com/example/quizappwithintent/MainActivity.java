package com.example.quizappwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    int marks=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg=findViewById(R.id.radioGroup);
    }

    public void nextBTN(View view) {

        if(rg.getCheckedRadioButtonId()==R.id.radioBTN1)
            marks+=10;
        else marks+=0;

        Intent myintent= new Intent(this,SecondActivity.class);
        myintent.putExtra("firstqsmarks",marks);
        startActivity(myintent);







    }
}
package com.example.quizappwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class SecondActivity extends AppCompatActivity {
    RadioGroup rg;
    int marks=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        rg=findViewById(R.id.radioGroup);

        Intent myintent= getIntent();
        marks= myintent.getIntExtra("firstqsmarks",0);

    }

    public void nextBTN(View view) {
        if(rg.getCheckedRadioButtonId()==R.id.radioBTN3)
            marks+=10;
        else marks+=0;

        Intent myintent= new Intent(this,FinalActivity.class);
        myintent.putExtra("finalmarks",marks);
        startActivity(myintent);

    }
}
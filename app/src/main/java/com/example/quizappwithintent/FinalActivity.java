package com.example.quizappwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {
    TextView marksTV;
    int marks=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        marksTV=findViewById(R.id.marksTV);
        Intent myintent= getIntent();
        marks= myintent.getIntExtra("finalmarks",0);
        marksTV.setText(""+marks+" / 20");
    }

    public void TryAgin(View view) {
        Intent myintent= new Intent(this,MainActivity.class);
        startActivity(myintent);
    }
}
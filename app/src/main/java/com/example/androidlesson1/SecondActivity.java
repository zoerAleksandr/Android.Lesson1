package com.example.androidlesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btn_back = findViewById(R.id.btn_second_back);
        Button btn_calendar = findViewById(R.id.btn_second_calendar);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBack = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intentBack);
            }
        });

        btn_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCalendar = new Intent(SecondActivity.this, CalendarActivity.class);
                startActivity(intentCalendar);
            }
        });
    }
}
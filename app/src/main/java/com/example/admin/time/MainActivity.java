package com.example.admin.time;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TimePicker timePicker;
    Button changetime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);
        timePicker =findViewById(R.id.timepicker);
        timePicker.setIs24HourView(true);
        changetime = (Button)findViewById(R.id.button);
        textView.setText(getCurrentTime());
        changetime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(getCurrentTime());


            }
        });


    }
    public String getCurrentTime(){
        String currentTime="Current Time: "+timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
        return currentTime;
    }
}

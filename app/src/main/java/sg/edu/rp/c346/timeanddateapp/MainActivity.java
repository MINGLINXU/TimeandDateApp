package sg.edu.rp.c346.timeanddateapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button displayDate;
    Button displayTime;
    TextView tvDisplay;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        displayDate = findViewById(R.id.buttonDisplayDate);
        displayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.buttonReset);


        displayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText("Time is: "+tp.getCurrentHour()+":"+tp.getCurrentMinute());
            }
        });

        displayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText("Dte is "+dp.getDayOfMonth()+"/"+dp.getMonth()+"/"+dp.getYear());
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setCurrentHour(12);
                tp.setCurrentMinute(00);
                dp.updateDate(2019, 01,01);
                tvDisplay.setText("Time is: "+tp.getCurrentHour()+":"+tp.getCurrentMinute()+" And Date is "+dp.getDayOfMonth()+"/"+dp.getMonth()+"/"+dp.getYear());
                if(tp.getCurrentMinute()<10){

                }
            }
        });


    }





}
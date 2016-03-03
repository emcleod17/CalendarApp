package com.example.emcleod.calendarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CalendarView calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeCalendar();
    }

    public void initializeCalendar() {
        calendar = (CalendarView) findViewById(R.id.calendarView);

        calendar.setShowWeekNumber(false);
        calendar.setFirstDayOfWeek(1);
        calendar.setUnfocusedMonthDateColor(getResources().getColor(R.color.transparent));
        calendar.setSelectedWeekBackgroundColor(getResources().getColor(R.color.colorPrimary));
        calendar.setWeekSeparatorLineColor(getResources().getColor(R.color.transparent));
        calendar.setSelectedDateVerticalBar(R.color.colorAccent);

        calendar.setOnDateChangeListener(new OnDateChangeListener() {
                    //show the selected date as a toast
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int day) {
                Toast.makeText(getApplicationContext(), day + "/" + month + "/" + year, Toast.LENGTH_LONG).show();
            }
        });
    }
}

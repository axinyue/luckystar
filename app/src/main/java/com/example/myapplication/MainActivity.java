package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonOk = findViewById(R.id.select_date);
        buttonOk.setOnClickListener(new MyClickListener());
        textView = findViewById(R.id.textView);
    }



    class MyClickListener implements View.OnClickListener{
        //Date date =new Date(System.currentTimeMillis());
        @Override
        public void onClick(View v) {
            Log.e("id: ",String.valueOf(v.getId()));
            Log.e("id2: ",String.valueOf(R.id.select_date));

            if(v.getId()==R.id.select_date){
                DatePickerDialog pickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        Log.e("date",""+String.valueOf(year)+"-"+String.valueOf(month+1)+"-"+String.valueOf(dayOfMonth));

                        textView.setText( Constellation.gettext(new MyDate(year,month+1,dayOfMonth),year));

                    }
                },Calendar.getInstance().get(Calendar.YEAR),Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
                pickerDialog.show();
            }
        }
    }
}

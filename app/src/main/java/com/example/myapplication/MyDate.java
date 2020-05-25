package com.example.myapplication;

import java.util.Calendar;
import java.util.Date;

class MyDate{
    long millis;


    public MyDate(int year, int month, int day){

        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month,day,0,0,0);
        millis = calendar.getTimeInMillis()/1000;

    }

    public long getMillis() {
        return millis;
    }

    public static boolean isRange(ConstellationDate myDate2, MyDate myDate){
        return myDate2.isRange(myDate);
    }

}



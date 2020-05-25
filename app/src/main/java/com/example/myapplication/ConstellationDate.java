package com.example.myapplication;

public class ConstellationDate{
    MyDate minDate;
    MyDate maxDate;

    public ConstellationDate(MyDate minDate,MyDate maxDate){
        this.minDate = minDate;
        this.maxDate = maxDate;
    }

    public boolean isRange(MyDate myDate){
        if(myDate.getMillis()>=minDate.getMillis() && myDate.getMillis()<=maxDate.getMillis()){
            return true;
        }
        return false;
    }
}
package com.example.myapplication;

import android.util.Log;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testOne(){
       String s = Constellation.gettext(new MyDate(2020,5,21),2020);
        System.out.println(s);
    }

    @Test
    public void test(){
//        assertEquals(MyDate.isRange(Constellation.ONE.getDate(),new MyDate(1,20)),true);
//        assertEquals(MyDate.isRange(Constellation.ONE.getDate(),new MyDate(1,30)),true);
//        assertEquals(MyDate.isRange(Constellation.ONE.getDate(),new MyDate(2,1)),true);
//        assertEquals(MyDate.isRange(Constellation.ONE.getDate(),new MyDate(2,18)),true);
//        assertEquals(MyDate.isRange(Constellation.ONE.getDate(),new MyDate(2,19)),false);

    }
    @Test
    public void test3(){
        Calendar calendar1=  Calendar.getInstance();
        calendar1.set(2020,5,21,0,0,0);

        Calendar calendar2=  Calendar.getInstance();
        calendar2.set(2020,4,20,0,0,0);

        Calendar calendar3=  Calendar.getInstance();
        calendar3.set(2020,5,21,0,0,0);
        System.out.println(calendar1.getTimeInMillis());
        System.out.println(calendar3.getTimeInMillis());
        assertEquals(calendar1.equals(calendar3),false);

//        assertEquals(calendar1.before(calendar2),false);
//        assertEquals(calendar1.after(calendar3),false);

    }

    @Test
    public void test2(){
        //assertEquals(MyDate.isRange(Constellation.values(2020)[0].getDate(),new MyDate(2020,1,1)),true);
    Calendar ca = Calendar.getInstance();
    ca.set(2018,1,20,0,0,0);
        ca.set(2018,1,20,6,0,31);

        long t = ca.getTimeInMillis()/1000;
        System.out.println(t);
    }
}
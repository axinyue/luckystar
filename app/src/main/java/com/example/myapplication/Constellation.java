package com.example.myapplication;

public class Constellation {

    ConstellationDate date;
    String text;
    Constellation(ConstellationDate date,String text){
        this.date = date;
        this.text = text;
    }

    public static String gettext(MyDate myDate,int year){
        for(Constellation c: Constellation.values(year)){
            if (c.date.isRange(myDate)){
                return c.text;
            }
        }
        return "";
    }

    public ConstellationDate getDate(){
        return date;
    }

    public static Constellation [] values(int year){
        Constellation [] all = {
        new Constellation(new ConstellationDate(new MyDate(year,1,20),new MyDate(year,2,18)),
                "水瓶座：睿智、独立、叛逆下的灵动"),
                new Constellation(new ConstellationDate(new MyDate(year,2,19),
                                new MyDate(year,3,20)),
                        "双鱼座"),

                new Constellation(new ConstellationDate(new MyDate(year,3,21),
                                new MyDate(year,4,19)),
                        "白羊座"),
                new Constellation(new ConstellationDate(new MyDate(year,4,20),new MyDate(year,5,20)),
                        "金牛座"),
                new Constellation(new ConstellationDate(new MyDate(year,5,21),new MyDate(year,6,21)),
                        "双子座"),
                new Constellation(new ConstellationDate(new MyDate(year,6,22),new MyDate(year,7,22)),
                        "巨蟹座"),
                new Constellation(new ConstellationDate(new MyDate(year,7,23),new MyDate(year,8,22)),
                        "狮子座"),
                new Constellation(new ConstellationDate(new MyDate(year,8,23),new MyDate(year,9,22)),
                        "处女座"),
                new Constellation(new ConstellationDate(new MyDate(year,9,23),new MyDate(year,10,23)),
                        "天秤座"),
                new Constellation(new ConstellationDate(new MyDate(year,10,24),new MyDate(year,11,22)),
                        "天蝎座"),
                new Constellation(new ConstellationDate(new MyDate(year,11,23),new MyDate(year,12,21)),
                        "射手座"),
                new Constellation(new ConstellationDate(new MyDate(year,12,22),new MyDate(year+1,1,19)),
                        "魔羯座")};
        return all;
    }
}

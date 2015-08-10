package DataBase;

import java.sql.Date;


public class Help {
    public static Date getDate(int year,int month,int day){
        return new Date(year-1900,month-1,day);
    }
    public static int getYear(Date date){
        return date.getYear()+1900;
    }
    public static int getMonth(Date date){
        return date.getMonth()+1;
    }
    public static int getDay(Date date){
        return date.getDay();
    }
}

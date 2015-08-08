package DataBase;

import java.sql.Date;


public class Help {
    public static Date getDate(int year,int month,int day){
        return new Date(year-1900,month-1,day);
    }
}

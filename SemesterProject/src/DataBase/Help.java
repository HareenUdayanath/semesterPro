package DataBase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.sql.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


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
        return date.getDate();
    }
    public static void writeIPandPort(String ip,String port){
        String text = ip+"\n"+port;
        BufferedWriter output = null;
        try {
            File file = new File("example.itcope");
            output = new BufferedWriter(new FileWriter(file));
            output.write(text);            
        } catch ( IOException e ) {
            //e.printStackTrace();
        } finally {
            if ( output != null ) try {
                output.close();                
            } catch (IOException ex) {
                //Logger.getLogger(Help.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static String [] readIPandPort(){
        BufferedReader br = null;
        String []ipAndPort = new String[2];
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader("example.itcope"));
            int i = 0;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
                ipAndPort[i++] = sCurrentLine;
            }

        } catch (IOException e) {                
        
        }catch(Exception ex){
        } finally {
                try {
                    if (br != null)br.close();
                } catch (IOException ex) {
                    //ex.printStackTrace();
                }
        }
        return ipAndPort;
    }
}

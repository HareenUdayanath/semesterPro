package PlayerRecords;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataBase {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet use = null;
    String url = "jdbc:derby:First;create=true";
    String user = "";
    String password = "";
    
    
    public DataBase(){
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection(url, user, password);
            con.createStatement().execute("create Table Players(Name VARCHAR(200),Wins INT, Losses INT,Ties INT,PRIMARY KEY(Name))");
            con.close();
        } catch (ClassNotFoundException ex) {
            //.getLogger(LocalDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            //Logger.getLogger(LocalDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch(Exception e){}
             
    }
     
    public boolean addPalyer(Player player){
        boolean result = false; 
        try{

            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("INSERT INTO Players VALUES(?,?,?,?,?)");               
            pst.setString(1,player.getName());
            pst.setInt(2,player.getWins());
            pst.setInt(3,player.getLosses());
            pst.setInt(4,player.getTies());          
            pst.executeUpdate();
            con.close();
            result = true;
            
        }catch(SQLException ex){
            //System.out.println("ddasdasdasd");
        } catch (ClassNotFoundException ex) {               
            //Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);  
        }
        return result;
    }
    public boolean deletePlayer(String name){
        boolean result = false;
        try{
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("DELETE FROM Players WHERE Players.Name = ?");
            pst.setString(1,name);               
            pst.executeUpdate();
            con.close();
            result = true;
        }catch(SQLException se){}
        return result;
    }
    public void loadPlayer(ArrayList<Player> palyerList){
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM Players");              
            use = pst.executeQuery();                
            palyerList.clear();                
            while(use.next()){                   
                Player player = new Player(use.getString(1));               
                player.setWins(use.getInt(2));
                player.setLosses(use.getInt(3));
                player.setTies(use.getInt(4));                
                palyerList.add(player);
            }        
            con.close();
        }catch(SQLException ex){
            System.out.println("ssss");
        } catch (ClassNotFoundException ex) {
            
        }
    }
    
    public boolean isPlayerIn(String name){
        boolean result = false; 
        try{

            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM Players");                 
            use = pst.executeQuery();
            while(use.next()){
                if(use.getString(1).equals(name))
                    result = true;            }
            con.close();           
        }catch(SQLException ex){
            result = true;
            //System.out.println("ddasdasdasd");
        } catch (ClassNotFoundException ex) {               
            result = true;
            //Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);  
        }
        return result;
    }
        
}

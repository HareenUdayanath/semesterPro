/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PlayerRecords;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Asus
 */
public class MyTableModel extends AbstractTableModel {
    
    private static ArrayList<Player> playerList;
    DataBase db;
    
    public MyTableModel(){
        db = new DataBase();
        playerList = new ArrayList<Player>();
        db.loadPlayer(playerList);
    }   
    
    private static final String [] columnNames = new String [] {
         "Player Name", "Wins", "Losses", "Ties"
    };
    
    private static final Class[] types = new Class [] {
        java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class,java.lang.Integer.class
    };
    
    private static final boolean[] canEdit = new boolean [] {
        false, false, false, false
    };
    
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return MyTableModel.canEdit [columnIndex];
    }    
    
    public String getColumnName(int col) {
        return MyTableModel.columnNames[col];        
    }

    @Override
    public int getRowCount() {
        return MyTableModel.playerList.size();
    }

    @Override
    public int getColumnCount() {
        return MyTableModel.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:return MyTableModel.playerList.get(rowIndex).getName();
            case 1:return MyTableModel.playerList.get(rowIndex).getWins();
            case 2:return MyTableModel.playerList.get(rowIndex).getLosses();
            case 3:return MyTableModel.playerList.get(rowIndex).getTies();
            default:return "Error";
        }
    }
    
    public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
    }
    /*public void setValueAt(Object value, int row, int col) {   
       try{
        data[row][col] = Integer.valueOf(String.valueOf(value));
       }catch(Exception ex){}
    }  */  
    
}

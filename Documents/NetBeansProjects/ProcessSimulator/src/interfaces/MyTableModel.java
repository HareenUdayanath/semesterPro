/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Asus
 */
public class MyTableModel extends AbstractTableModel {
    private int rows;
    
    public MyTableModel(int rows){
        this.rows = rows;
    }
    private Object [][]data = new Object [][] {
                {"A", null, null},
                {"B", null, null},
                {"C", null, null},
                {"D", null, null},
                {"E", null, null},
                {"F", null, null},
                {"G", null, null},
                {"H", null, null},
                {"I", null, null},
                {"J", null, null},
                {"K", null, null},
                {"L", null, null},
                {"M", null, null},
                {"O", null, null},
                {"P", null, null},
                {"Q", null, null}
    };
    private String [] columnNames = new String [] {
         "Process", "Arrival Time", "Service Time"
    };
    
    Class[] types = new Class [] {
        java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
    };
    
    boolean[] canEdit = new boolean [] {
        false, true, true
    };
    
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }    
    
    public String getColumnName(int col) {
        return columnNames[col];        
    }

    @Override
    public int getRowCount() {
        return this.rows;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
    
    /*public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
    }*/
    public void setValueAt(Object value, int row, int col) {   
       try{
        data[row][col] = Integer.valueOf(String.valueOf(value));
       }catch(Exception ex){}
    }    
    
}

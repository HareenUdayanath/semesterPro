/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.reception;

import DataBase.DBOperations;
import Domain.Patient;
import Domain.Room;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Irfad Hussain
 */
public class RoomTableModel extends AbstractTableModel{

    private String[] COLUMN_NAMES = {"Room Number","Patient Name","Admit Date"};
    private ArrayList<Room> rooms;

    public RoomTableModel(){
        try {
            this.rooms = DBOperations.getInstace().getAddmitedRooms();
            if (this.rooms == null){
                this.rooms = new ArrayList<Room>();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sorry, an error occured while loading rooms", "Error", JOptionPane.ERROR_MESSAGE);
            this.rooms = new ArrayList<Room>();
        }
    }
    
    @Override
    public int getRowCount() {
        return rooms.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return rooms.get(rowIndex).getRoomNo();
            case 1:
                Patient p = null;
                try {
                    p = DBOperations.getInstace().getPatient(rooms.get(rowIndex).getPID());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Sorry, an error occured while fetching information", "Error", JOptionPane.ERROR_MESSAGE);
                }
                return p.getFullName();
            case 2:
                return "";
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }
    
    @Override
    public  boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
    
    public void setValues(ArrayList<Room> rooms){
        this.rooms = rooms;
        fireTableStructureChanged();
    }
    
}

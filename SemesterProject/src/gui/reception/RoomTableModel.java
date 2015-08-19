
package gui.reception;

import DataBase.ConnectionTimeOutException;
import DataBase.DBOperations;
import Domain.Patient;
import Domain.Room;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/*
 * @author Irfad Hussain
 */
public class RoomTableModel extends AbstractTableModel{

    private String[] COLUMN_NAMES = {"Room Number","Patient ID","Patient Name","Admit Date"};
    private ArrayList<Room> rooms;

    public RoomTableModel(){
        try {
            this.rooms = DBOperations.getInstace().getAddmitedRooms();
            if (this.rooms == null){
                this.rooms = new ArrayList<Room>();
            }
            if (rooms.size()==0){
                JOptionPane.showMessageDialog(null, "No admitted rooms to display.", "", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Sorry, an error occured while loading rooms", "Error", JOptionPane.ERROR_MESSAGE);
            this.rooms = new ArrayList<Room>();
        } catch (ConnectionTimeOutException ex) {
            JOptionPane.showMessageDialog(null, "Cannot load rooms. Connection Timed out. Please try again.", "Time out", JOptionPane.WARNING_MESSAGE);
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
                return rooms.get(rowIndex).getPID();
            case 2:
                Patient p = null;
                try {
                    p = DBOperations.getInstace().getPatient(rooms.get(rowIndex).getPID());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Sorry, an error occured while fetching information", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (ConnectionTimeOutException ex) {
                    JOptionPane.showMessageDialog(null, "Cannot fetch information. Connection Timed out. Please try again.", "Time out", JOptionPane.WARNING_MESSAGE);
                }
                return p.getFullName();
            case 3:
                return rooms.get(rowIndex).getDate().toString();
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
        if (rooms.size() == 0) {
            JOptionPane.showMessageDialog(null, "No admitted rooms to display.", "", JOptionPane.INFORMATION_MESSAGE);
        }
        fireTableStructureChanged();
    }
    
    public Room getRoomAt(int rowIndex){
        return rooms.get(rowIndex);
    }
    
    public void setRooms (ArrayList<Room> rooms){
        this.rooms = rooms;
        fireTableStructureChanged();
    }
    
    public boolean isPatientadmitted(int PID){
        for (Room r : rooms){
            if (r.getPID()==PID)
                return true;
        }
        return false;
    }
    
}

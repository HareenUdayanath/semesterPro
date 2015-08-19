
package gui.reception;

import DataBase.ConnectionTimeOutException;
import DataBase.DBOperations;
import Domain.Doctor;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 *
 * @author Irfad Hussain
 */
public class DoctorDetailsModel extends DetailsTableModel{

    private ArrayList<Doctor> values = new ArrayList<Doctor>();
    
    public DoctorDetailsModel(){
        super(new String[]{"Employee ID","Name","Availability"});
        new Thread(){
            public void run(){
                try {
                    values = DBOperations.getInstace().loadDoctors();    // load avilable doctors at begining
                    fireTableStructureChanged();
                    if (values.size()==0){
                        JOptionPane.showMessageDialog(null, "Doctor List Empty!", null, JOptionPane.INFORMATION_MESSAGE);
                    }
                    System.out.println("loaded");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Sorry, an error occured while loading Doctors!", "Error", JOptionPane.ERROR_MESSAGE);
                    values = new ArrayList<Doctor>();
                } catch (ConnectionTimeOutException ex) {
                    JOptionPane.showMessageDialog(null, "Cannot load doctor list. Connection Timed out. Please try again.", "Time out", JOptionPane.WARNING_MESSAGE);
                    values = new ArrayList<Doctor>();
                }
            }
        }.start();
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return values.get(rowIndex).getEID();
            case 1:
                return values.get(rowIndex).getName();
            case 2:
                if (values.get(rowIndex).isAvailablity()){
                    return "Available";
                }else{
                    return "Not Available";
                }
            default:
                return "";
        }
    }

    public void setValues(ArrayList<Doctor> values){
        this.values = values;
        fireTableStructureChanged();
    }
    
    @Override
    public void search(String name, boolean searchByName) throws SQLException,ConnectionTimeOutException {
        setValues(DBOperations.getInstace().searchDoctors(name));
        if (values.size()==0){
            JOptionPane.showMessageDialog(null, "No match found!", null, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public int getRowCount() {
        return values.size();
    }
    
}

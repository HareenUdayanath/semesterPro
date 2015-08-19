
package gui.reception;

import DataBase.ConnectionTimeOutException;
import DataBase.DBOperations;
import Domain.Patient;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * @author Irfad Hussain
 */
public class PatientDetailsModel extends DetailsTableModel {
    
    private ArrayList<Patient> values;
    
    public PatientDetailsModel(){
        /* With time there could be thousands of patients entered in database. Loading all of them would be inefficient. So initialize an
           empty arrayList to avoid null pointer exception*/
        super(new String[]{"Patient ID","First Name","Last Name","NIC"});
        values = new ArrayList<Patient>();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return values.get(rowIndex).getPID();
            case 1:
                return values.get(rowIndex).getFirstName();
            case 2:
                return values.get(rowIndex).getLastName();
            case 3:
                return values.get(rowIndex).getNIC();
            default:
                return "";
        }
    }

    public void setValues(ArrayList<Patient> values){
        this.values = values;
        fireTableStructureChanged();
    }

    @Override
    public void search(String key,boolean searchByName) throws SQLException,ConnectionTimeOutException {
        if (searchByName){
            setValues(DBOperations.getInstace().searchPatients(key));
        }else{
            setValues(DBOperations.getInstace().searchPatientsByNIC(key));
        }
        if (values.size()==0){
            JOptionPane.showMessageDialog(null, "No match found!", null, JOptionPane.INFORMATION_MESSAGE);
        }
        if (values.size()==0){
            JOptionPane.showMessageDialog(null, "No match found!", null, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public int getRowCount() {
        return values.size();
    }
    
    public Patient getPatientAt(int rowIndex){
        return values.get(rowIndex);
    }
    
}

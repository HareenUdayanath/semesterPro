/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.reception;

import DataBase.DBOperations;
import Domain.Patient;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Irfad Hussain
 */
public class PatientDetailsModel extends AbstractTableModel {
    
    private final String[] COLUMN_NAMES = {"Employee ID","First Name","Last Name","NIC"};
    private ArrayList<Patient> values;
    
    public PatientDetailsModel(){
        /* With time there could be thousands of patients entered in database. Loading all of them would be inefficient. So initialize an
           empty arrayList to avoid null pointer exception*/
        values = new ArrayList<Patient>();
    }

    @Override
    public int getRowCount() {
        return values.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
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
    
    @Override
    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }
    
    public void setValues(ArrayList<Patient> values){
        this.values = values;
        fireTableStructureChanged();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.reception;

import DataBase.DBOperations;
import Domain.Doctor;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Irfad Hussain
 */
public class DoctorDetailsModel extends AbstractTableModel{

    private final String[] COLUMN_NAMES = {"Employee ID","Name","Availability"};
    private ArrayList<Doctor> values;
    
    public DoctorDetailsModel(){
        //new DBOperations().loadDoctors(values);
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
                return values.get(rowIndex).getEID();
            case 1:
                return values.get(rowIndex).getName();
            case 2:
                return values.get(rowIndex).getNIC();
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }
    
}

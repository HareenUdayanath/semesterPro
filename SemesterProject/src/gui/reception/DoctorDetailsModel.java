/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.reception;

import DataBase.DBOperations;
import Domain.Doctor;
import java.util.ArrayList;

/**
 *
 * @author Irfad Hussain
 */
public class DoctorDetailsModel extends DetailsTableModel{

    private ArrayList<Doctor> values;
    
    public DoctorDetailsModel(){
        super(new String[]{"Employee ID","Name","Availability"});
        values = DBOperations.getInstace().loadDoctors();    // load avilable doctors at begining
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

    public void setValues(ArrayList<Doctor> values){
        this.values = values;
        fireTableStructureChanged();
    }
    
    @Override
    public void search(String name, String NIC) {
        setValues(DBOperations.getInstace().searchDoctors(name));
    }

    @Override
    public int getRowCount() {
        return values.size();
    }
    
}

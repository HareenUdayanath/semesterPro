/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.reception;

import DataBase.DBOperations;
import Domain.Doctor;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Irfad Hussain
 */
public class DoctorDetailsModel extends DetailsTableModel{

    private ArrayList<Doctor> values;
    
    public DoctorDetailsModel() throws SQLException{
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
    public void search(String name, boolean searchByName) throws SQLException {
        setValues(DBOperations.getInstace().searchDoctors(name));
    }

    @Override
    public int getRowCount() {
        return values.size();
    }
    
}

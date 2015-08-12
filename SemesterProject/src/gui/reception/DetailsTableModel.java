/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.reception;

import Domain.Doctor;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Irfad Hussain
 */
public abstract class DetailsTableModel extends AbstractTableModel{
    
    private final String[] COLUMN_NAMES;
    private ArrayList<Doctor> values;

    public DetailsTableModel(String[] columnNames){
        this.COLUMN_NAMES = columnNames;
    }
    
    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

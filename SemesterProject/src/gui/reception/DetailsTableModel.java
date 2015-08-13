/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.reception;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Irfad Hussain
 */
public abstract class DetailsTableModel extends AbstractTableModel{
    
    private final String[] COLUMN_NAMES;

    public DetailsTableModel(String[] columnNames){
        this.COLUMN_NAMES = columnNames;
    }
    
    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }
    
    public abstract void search(String key, boolean searchByName);
    
}

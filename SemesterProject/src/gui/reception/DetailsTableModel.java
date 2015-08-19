
package gui.reception;

import DataBase.ConnectionTimeOutException;
import Domain.Patient;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;

/*
 * @author Irfad Hussain
 */
public abstract class DetailsTableModel extends AbstractTableModel{
    
    /* This is the super type for stratergy behavioural pattern */
    
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
    
    public abstract void search(String key, boolean searchByName)throws SQLException,ConnectionTimeOutException;
    
}

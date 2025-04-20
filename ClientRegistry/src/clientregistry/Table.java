package clientregistry;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fabri
 */
public class Table {
    
    private DefaultTableModel table = new DefaultTableModel();
    
    public void initCustomComponents(JTable jTable) {
    table.addColumn("Name");
    table.addColumn("Phone");
    table.addColumn("Email");
   
    jTable.setModel(table);
    }
    
    public void addRow(Object[] row) {
        table.addRow(row);
    }
}
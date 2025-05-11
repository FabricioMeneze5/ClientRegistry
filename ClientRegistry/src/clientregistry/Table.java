package clientregistry;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fabri
 */
public class Table {
    
    private DefaultTableModel table = new DefaultTableModel() {
        public boolean isCellEditable(int row, int column) {
            return false; // Nenhuma célula pode ser editada
        }
    };
    
    public void initCustomComponents(JTable jTable) {
    table.addColumn("CPF");
    table.addColumn("Name");
    table.addColumn("Phone");
    table.addColumn("Email");
   
    jTable.setModel(table);
    
    jTable.getColumnModel().getColumn(0).setMinWidth(0);
    jTable.getColumnModel().getColumn(0).setMaxWidth(0);
    jTable.getColumnModel().getColumn(0).setWidth(0);
    }
    
    public void addRow(Object[] row) {
        table.addRow(row);
    }
}
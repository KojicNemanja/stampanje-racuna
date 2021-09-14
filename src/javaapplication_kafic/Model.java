
package javaapplication_kafic;

import javax.swing.table.AbstractTableModel;

public class Model  extends AbstractTableModel{
    private Object[][] red;
    private String[] kolona;

    public Model() {
        this.red = new Object[0][0];
        this.kolona = new String[0];
    }

    public Model(Object[][] red, String[] kolona) {
        this.red = red;
        this.kolona = kolona;
    }
    
    @Override
    public int getRowCount() {
        return red.length;
    }

    @Override
    public int getColumnCount() {
        return kolona.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return red[rowIndex][columnIndex];
    }
    
    @Override
    public String getColumnName(int brojKolone) {
        return kolona[brojKolone]; 
    }

    
    
    
    
}

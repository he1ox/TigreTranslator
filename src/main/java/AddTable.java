import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Map;

public class AddTable {

    // Agregar tabla de tokens
    public void addTableTokens(JPanel panel, Map<String,String> datos, String Colunm1, String Colunm2){
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn(Colunm1);
        tableModel.addColumn(Colunm2);

        JTable tableTokens = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tableTokens);

        scrollPane.setBounds(10, 310, 380, 280);


        panel.add(scrollPane);

        for (Map.Entry<String, String> entry : datos.entrySet()) {
            String token = entry.getKey();
            String information = entry.getValue();
            tableModel.addRow(new Object[]{token, information});
        }

    }

    // Agregar tabla de Errores
    public void addTableErrors(JPanel panel, Map<String,String> datos, String Colunm1, String Colunm2){
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn(Colunm1);
        tableModel.addColumn(Colunm2);

        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        scrollPane.setBounds(400, 310, 380, 280);
        panel.add(scrollPane);

        for (Map.Entry<String, String> entry : datos.entrySet()) {
            String token = entry.getKey();
            String information = entry.getValue();
            tableModel.addRow(new Object[]{token, information});
        }

    }

}

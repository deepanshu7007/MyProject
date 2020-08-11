/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Master.SubGroup.Presist;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deepa
 */
public class AddPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPanel
     */
    public AddPanel(DefaultTableModel tableModel) {
        initComponents();
        setSize(830,440);
        JTable GroupTable = new JTable(tableModel) {
         public boolean editCellAt(int row, int column, java.util.EventObject e) {
            return false;
        }
      };
      GroupTable.setFocusable(false);
      GroupTable.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent me) {
            if (me.getClickCount() == 2) {     // to detect doble click events
               JTable target = (JTable)me.getSource();
               int row = target.getSelectedRow(); // select a row
                // select a column
              GroupField.setText(GroupTable.getValueAt(row, 0).toString()); // get the value of a row and column.
            }
         }
      });
      JScrollPane jScrollPane2=new JScrollPane();
      jScrollPane2.setViewportView(GroupTable);

        add(jScrollPane2);
        jScrollPane2.setBounds(360, 99, 452, 328);
        
    }
public void AddAction(ActionListener evt)
{
    AddButton.setActionCommand("ADD");
    AddButton.addActionListener(evt);
}
 /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PriorityField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AliasField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        AddButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        GroupField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Name");
        add(jLabel1);
        jLabel1.setBounds(20, 100, 60, 40);
        add(NameField);
        NameField.setBounds(97, 99, 210, 40);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Alias");
        add(jLabel2);
        jLabel2.setBounds(20, 180, 43, 25);
        add(PriorityField);
        PriorityField.setBounds(100, 230, 210, 40);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setText("Priority");
        add(jLabel3);
        jLabel3.setBounds(12, 242, 80, 25);
        add(AliasField);
        AliasField.setBounds(97, 166, 210, 40);
        add(jSeparator1);
        jSeparator1.setBounds(0, 82, 829, 10);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel4.setText("Add Sub Group");
        add(jLabel4);
        jLabel4.setBounds(12, 13, 817, 62);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2);
        jSeparator2.setBounds(340, 77, 13, 360);

        AddButton.setText("ADD");
        add(AddButton);
        AddButton.setBounds(97, 370, 201, 57);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5.setText("Group");
        add(jLabel5);
        jLabel5.setBounds(12, 311, 60, 25);

        GroupField.setEnabled(false);
        add(GroupField);
        GroupField.setBounds(100, 300, 210, 40);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    public javax.swing.JTextField AliasField;
    public javax.swing.JTextField GroupField;
    public javax.swing.JTextField NameField;
    public javax.swing.JTextField PriorityField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
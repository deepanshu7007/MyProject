package FrontPages;
import java.awt.event.ActionListener;

public class FrontView extends javax.swing.JFrame {

    public FrontView() {
        initComponents();
    }
       void groupMasterAct(ActionListener evt)
       {
           
           GroupMaster.setActionCommand("GROUP");
           GroupMaster.addActionListener(evt);
       }
       void subMasterAct(ActionListener evt)
       {
           SGroupMaster.setActionCommand("SUBGROUP");
            SGroupMaster.addActionListener(evt);
       }
       
       
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        MenuBar = new javax.swing.JMenuBar();
        Master = new javax.swing.JMenu();
        GroupMaster = new javax.swing.JMenuItem();
        SGroupMaster = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Accounting Software");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1132, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );

        Master.setText("Master");

        GroupMaster.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        GroupMaster.setText("Group-Master");
        GroupMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupMasterActionPerformed(evt);
            }
        });
        Master.add(GroupMaster);

        SGroupMaster.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, 0));
        SGroupMaster.setText("Sub-Group Master");
        Master.add(SGroupMaster);

        jMenu1.setText("Account Master");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Supplier");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Customer");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Account");
        jMenu1.add(jMenuItem3);

        Master.add(jMenu1);

        MenuBar.add(Master);

        jMenu2.setText("Inventory");
        MenuBar.add(jMenu2);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GroupMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupMasterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GroupMasterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem GroupMaster;
    private javax.swing.JMenu Master;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem SGroupMaster;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    public javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HeadMaster;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GroupMasterPanel extends JPanel
{
    private JButton BackButton;
    private JButton AddButton;
    private JButton ModifyButton;
    private JButton RemoveButton;
    
    DefaultTableModel tableModel;
    public GroupMasterPanel(DefaultTableModel tableModel)
    {
        this.tableModel=tableModel;
    JTable jt=new JTable(tableModel);    
    JScrollPane sp=new JScrollPane();
    sp.setViewportView(jt);
    System.out.println(Toolkit.getDefaultToolkit().getScreenSize().width);
    System.out.println(Toolkit.getDefaultToolkit().getScreenSize().height);
    sp.setBounds(100,25,1700,Toolkit.getDefaultToolkit().getScreenSize().height/3);
    add(sp); 
    setLayout(null);
    setBackground(Color.CYAN);
    setSize(Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
     BackButton = new JButton("BACK");
    AddButton = new JButton("ADD");
    ModifyButton = new JButton("MODIFY");
    RemoveButton = new JButton("REMOVE");
    BackButton.setBounds(400,500,100,100);
    AddButton.setBounds(200,500,100,100);
    ModifyButton.setBounds(600,500,100,100);
    RemoveButton.setBounds(800,500,100,100);
//    B.addActionListener(new ActionListener() {
//
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                removeAll();
//                 repaint();
//                add(panel);             
//             }
//         });
    add(BackButton);
//    C.addActionListener(new ActionListener() {
//
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                new EnterDataFrame();
//             }
//         });
    add(AddButton);
    add(ModifyButton);
    add(RemoveButton);
    }
    public void bButtonAction(ActionListener evt)
    {
        System.out.println(Thread.currentThread());
        
        BackButton.addActionListener(evt);
    }
    public void cButtonAction(ActionListener evt)
    {
         System.out.println(Thread.currentThread());
//        System.out.println("Hello World2");
        AddButton.addActionListener(evt);
    }
}

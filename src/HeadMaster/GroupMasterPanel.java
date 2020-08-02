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
    private JButton B;
    private JButton C;
    public GroupMasterPanel()
    {
         String data[][]={ {"101","Amit","670000"},    
                          {"102","Jai","780000"},    
                          {"101","Sachin","700000"}
         };    
    String column[]={"ID","NAME","SALARY"};     
    DefaultTableModel tableModel = new DefaultTableModel(data,column);
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
     B = new JButton("Back");
    C = new JButton("ADD");
    B.setBounds(400,500,100,100);
    C.setBounds(200,500,100,100);
//    B.addActionListener(new ActionListener() {
//
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                removeAll();
//                 repaint();
//                add(panel);             
//             }
//         });
    add(B);
//    C.addActionListener(new ActionListener() {
//
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                new EnterDataFrame();
//             }
//         });
    add(C);
    }
    public void bButtonAction(ActionListener evt)
    {
        System.out.println(Thread.currentThread());
        
        B.addActionListener(evt);
    }
    public void cButtonAction(ActionListener evt)
    {
         System.out.println(Thread.currentThread());
//        System.out.println("Hello World2");
        C.addActionListener(evt);
    }
}

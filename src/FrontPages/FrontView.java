package FrontPages;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
public class FrontView extends JFrame
{
     private JMenuItem groupMaster;
    private JMenuItem sgroupMaster;
    private JMenuItem headMaster;  
    public JPanel panel;
    public FrontView()
    {
        JMenuBar menubar = new JMenuBar();
        JMenu masterMenu = new JMenu("Masters");
        groupMaster= new JMenuItem("Group-Master");
        sgroupMaster = new JMenuItem("Subgroup-master");
        headMaster = new JMenuItem("Head-Master");
        panel = new JPanel();
        panel.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        panel.setBackground(Color.red);
        masterMenu.add(groupMaster);
        masterMenu.add(sgroupMaster);
        masterMenu.add(headMaster);
        menubar.add(masterMenu);
//        JButton b1 = new JButton("Group Master");
//        JButton b2 = new JButton("Sub Group Master");
//        JButton b3 = new JButton("Head Master");
//        b1.setBounds(0,0,100,100);
//        b2.setBounds(100,0,100,100);
//        b3.setBounds(200,0,100,100);
        System.out.println(Thread.getAllStackTraces().size());
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setLayout(null);
//        panel.add(b1);
//        panel.add(b2);
//        panel.add(b3);
        add(panel);
        setJMenuBar(menubar);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void groupMasterAct(ActionListener listenForCalcButton)
    {
        groupMaster.addActionListener(listenForCalcButton);   
    }
    void subMasterAct(ActionListener listenForSmaster)
    {
        sgroupMaster.addActionListener(listenForSmaster);
    }
    void headMasterAct(ActionListener listenForSmaster)
    {
        headMaster.addActionListener(listenForSmaster);
    }
}

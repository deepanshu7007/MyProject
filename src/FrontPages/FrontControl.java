package FrontPages;
import Master.SubGrpMasterPanel;
import Master.MasterModel;
import Master.MasterControl;
import Master.GroupMasterPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
public class FrontControl {
    FrontView mv;
    MasterModel gmm;
    DefaultTableModel dtm;
    public FrontControl(FrontView mv)
    {
       gmm = new MasterModel();
       dtm = new DefaultTableModel(new Object[][]{},new String[]{"Name","Alias","Priority","Head"});
       this.mv = mv;
       this.mv.groupMasterAct(new GroupMasterAction());
       this.mv.subMasterAct(new SubMasterAction());
       this.mv.headMasterAct(new HeadMasterAction());
    }
    class GroupMasterAction implements ActionListener
    {
    public void actionPerformed(ActionEvent evt)
    {
        mv.getContentPane().removeAll();
        mv.repaint();
        GroupMasterPanel gmp = new GroupMasterPanel(dtm);
        MasterControl gmc = new MasterControl(gmp,mv,gmm);
//        gmp.bButtonAction(new bButtonAct());
//        gmp.cButtonAction(new cButtonAct());        
        mv.getContentPane().add(gmp);
        mv.invalidate();
        mv.validate();     
        mv.repaint();
//        mv.getContentPane().removeAll();
//        GroupMasterPanel gmp = new GroupMasterPanel();
//        mv.add(gmp);
    }
    }
    class SubMasterAction implements ActionListener
    {
    public void actionPerformed(ActionEvent evt)
    {
        System.out.println("Sub master pressed");
        mv.getContentPane().removeAll();
        mv.invalidate();
        mv.validate();         
        mv.repaint();
        SubGrpMasterPanel sgm=new SubGrpMasterPanel();
        mv.getContentPane().add(sgm);
        mv.invalidate();
        mv.validate();     
        mv.repaint();
//        mv.getContentPane().removeAll();
//        GroupMasterPanel gmp = new GroupMasterPanel();
//        mv.add(gmp);
    }
}
    class HeadMasterAction implements ActionListener
    {
    public void actionPerformed(ActionEvent evt)
    {
        System.out.println("Head Master pressed");  

    }
}
   
    
//    class bButtonAct implements ActionListener
//    {
//
//        @Override
//        public void actionPerformed(ActionEvent evt1) {
//            mv.getContentPane().remove(gmp);
//                mv.invalidate();
//                mv.validate();
//                mv.getContentPane().add(mv.panel);
//                mv.repaint();
//        }
//        
//    }
//    class cButtonAct implements ActionListener
//    {
//        @Override
//        public void actionPerformed(ActionEvent evt1)
//        {
//            new PresistDataFrame();
//        }
//    }
}



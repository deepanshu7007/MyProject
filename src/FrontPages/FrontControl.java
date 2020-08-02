package FrontPages;

import HeadMaster.GroupMasterPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import HeadMaster.GroupMasterControl;
public class FrontControl {
    FrontView mv;
    GroupMasterPanel gmp;
    public FrontControl(FrontView mv,GroupMasterPanel gmp)
    {
       this.gmp=gmp;
       this.mv = mv;
       this.mv.groupMasterAct(new groupMasterAction());
       this.mv.subMasterAct(new subMasterAction());
       this.mv.headMasterAct(new headMasterAction());
    }
    class groupMasterAction implements ActionListener
    {
    public void actionPerformed(ActionEvent evt)
    {
        mv.getContentPane().remove(mv.panel);
        
        
        gmp = new GroupMasterPanel();
        GroupMasterControl gmc = new GroupMasterControl(gmp,mv);
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
    class subMasterAction implements ActionListener
    {
    public void actionPerformed(ActionEvent evt)
    {
        System.out.println("Sub master pressed");
                
//        mv.getContentPane().removeAll();
//        GroupMasterPanel gmp = new GroupMasterPanel();
//        mv.add(gmp);
    }
}
    class headMasterAction implements ActionListener
    {
    public void actionPerformed(ActionEvent evt)
    {
        System.out.println("Head Master pressed");  
//        mv.getContentPane().removeAll();
//        GroupMasterPanel gmp = new GroupMasterPanel();
//        mv.add(gmp);
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



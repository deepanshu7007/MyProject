package HeadMaster;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import FrontPages.FrontView;
public class GroupMasterControl {
    FrontView fv;
    public GroupMasterControl(GroupMasterPanel gmp,FrontView fv)
    {
        this.fv=fv;
        gmp.bButtonAction(new backButtonAct());
        gmp.cButtonAction(new presistButtonAct());  
    }
    class backButtonAct implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            fv.getContentPane().removeAll();
            fv.invalidate();
                fv.validate();
                fv.getContentPane().add(fv.panel);
                fv.repaint();
        }
    }
    class presistButtonAct implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
         new PresistDataFrame();
        }
    
    }
}

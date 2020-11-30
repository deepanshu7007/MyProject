package Master.SubGroup;

import FrontPages.FrontModel;
import FrontPages.FrontView;
import Master.SubGroup.Presist.AddPanel;
import Master.SubGroup.Presist.SGPControl;
import Master.SubGroup.Presist.SGPFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubGroupControl {
        FrontView mv;
    FrontModel fm;
    public SubGroupControl(SubGroupPanel gp,FrontView mv,FrontModel fm)
    {
       this.fm = fm;
        this.mv=mv;
        gp.addAction(new SubGroupAction());
        gp.deleteAction(new SubGroupAction());
        gp.modifyAction(new SubGroupAction());
        gp.backAction(new SubGroupAction());
    }
    class SubGroupAction implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Entered here");
            if(e.getActionCommand()=="ADD")
            {
                AddPanel addPanel = new AddPanel(FrontModel.GroupTableModel);
                SGPFrame af = new SGPFrame();
                af.add(addPanel);
                SGPControl gc = new SGPControl(addPanel,fm);
                af.setVisible(true);
            }
            if(e.getActionCommand()=="DELETE")
            {
                
            }
            
            if(e.getActionCommand()=="MODIFY")
            {
                
            }
            
            if(e.getActionCommand()=="BACK")
            {
                mv.getContentPane().removeAll();
                mv.add(mv.panel);
                mv.repaint();
            } 
        }

        
    
    }
}


package Master.Group;
import FrontPages.FrontModel;
import FrontPages.FrontView;
import Master.Group.Presist.AddPanel;
import Master.Group.Presist.DeletePanel;
import Master.Group.Presist.GPControl;
import Master.Group.Presist.GPFrame;
import Master.Group.Presist.ModifyPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GroupControl {
    FrontView mv;
    FrontModel fm;
    public GroupControl(GroupPanel gp,FrontView mv,FrontModel fm)
    {
       this.fm = fm;
        this.mv=mv;
        gp.addAction(new GroupAction());
        gp.deleteAction(new GroupAction());
        gp.modifyAction(new GroupAction());
        gp.backAction(new GroupAction());
    }
    class GroupAction implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Entered here");
            if(e.getActionCommand()=="ADD")
            {
                AddPanel addPanel = new AddPanel();
                GPFrame af = new GPFrame(addPanel);
                GPControl gc = new GPControl(addPanel,fm);
                af.setVisible(true);
            }
            if(e.getActionCommand()=="DELETE")
            {
                new DeletePanel();
            }
            
            if(e.getActionCommand()=="MODIFY")
            {
                new ModifyPanel();
            }
            
            if(e.getActionCommand()=="BACK")
            {
                mv.getContentPane().removeAll();
                mv.repaint();
                mv.add(mv.panel);
                mv.repaint();
            }
            
        }
    
    }
}

package Master.Account;
import FrontPages.FrontModel;
import FrontPages.FrontView;
import Master.Account.Presist.APControl;
import Master.Account.Presist.Panels;
import Master.Group.GroupPanel;
import Master.Group.Presist.AddPanel;
import Master.Group.Presist.DeletePanel;
import Master.Group.Presist.GPControl;
import Master.Group.Presist.GPFrame;
import Master.Group.Presist.ModifyPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountControl {
     FrontView mv;
    FrontModel fm;
    public AccountControl(AccountPanel gp,FrontView mv,FrontModel fm)
    {
       this.fm = fm;
        this.mv=mv;
        gp.addAction(new AccountAction());
        gp.deleteAction(new AccountAction());
        gp.modifyAction(new AccountAction());
        gp.backAction(new AccountAction());
    }
    class AccountAction implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Entered here");
            if(e.getActionCommand()=="ADD")
            {
                Panels Panel = new Panels(FrontModel.SubGroupTableModel);
                APControl gc = new APControl(Panel,fm);
                Panel.setVisible(true);
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

package FrontPages;
import Master.Account.AccountControl;
import Master.Account.AccountPanel;
import Master.Group.GroupControl;
import Master.Group.GroupPanel;
import Master.SubGroup.SubGroupControl;
import Master.SubGroup.SubGroupPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FrontControl {
    FrontView mv;
    FrontModel fm;
    public FrontControl(FrontView mv,FrontModel fm)
    {
       this.fm = fm;
       this.mv = mv;
       this.mv.groupMasterAct(new MasterAction());
       this.mv.subMasterAct(new MasterAction());
       this.mv.accountPanelAct(new MasterAction());
    }
    class MasterAction implements ActionListener
    {
    public void actionPerformed(ActionEvent evt)
    {
        if("GROUP".equals(evt.getActionCommand()))
        {
        mv.getContentPane().removeAll();
        mv.repaint();
        GroupPanel gp = new GroupPanel(FrontModel.GroupTableModel);
        GroupControl gc = new GroupControl(gp,mv,fm);
        mv.add(gp); 
        mv.setVisible(true);
        mv.invalidate();
        mv.validate();     
        mv.repaint();
        }
        if("SUBGROUP".equals(evt.getActionCommand()))
        {
        mv.getContentPane().removeAll();
        mv.repaint();
        SubGroupPanel gp = new SubGroupPanel(FrontModel.SubGroupTableModel);
        SubGroupControl gc = new SubGroupControl(gp,mv,fm);
        mv.add(gp); 
        mv.setVisible(true);     
        mv.repaint();
        }
        if("ACCOUNT".equals(evt.getActionCommand()))
        {
        System.out.println("Hello world");
        mv.getContentPane().removeAll();
        mv.repaint();
        AccountPanel gp = new AccountPanel(FrontModel.AccountTableModel);
        AccountControl gc = new AccountControl(gp,mv,fm);
        mv.add(gp); 
        mv.setVisible(true);     
        mv.repaint();
        }
       }
    }
}



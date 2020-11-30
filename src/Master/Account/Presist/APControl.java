package Master.Account.Presist;

import FrontPages.FrontModel;
import Master.SubGroup.Presist.AddPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class APControl {
    Panels af;
    FrontModel fm;
    public APControl(Panels af,FrontModel fm)
            {
                this.fm = fm;
                this.af=af;
                this.af.addAction(new Act());
            }
    
    class Act implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand()=="ADD"){
            try{
            String name=af.NameField.getText();
            String head=af.SubGroupField.getText();
            String alias=af.AliasField.getText();
            int priority=Integer.parseInt(af.PriorityField.getText());
            
            System.out.println("ADD button Pressed");
            fm.addAccountGroupData(name, alias, priority,head);
                    }
            catch(NumberFormatException exp){
                JOptionPane.showMessageDialog(af,"Type Conversion error");
            }
                 
            }
            
        }
    }
}

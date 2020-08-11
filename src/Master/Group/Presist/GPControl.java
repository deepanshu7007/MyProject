package Master.Group.Presist;
import FrontPages.FrontModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class GPControl {
    AddPanel af;
    FrontModel fm;
    public GPControl(AddPanel af,FrontModel fm)
            {
                this.fm = fm;
                this.af=af;
                this.af.AddAction(new Act());
            }
    
    class Act implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand()=="ADD"){
            try{
            String name=af.NameField.getText();
            int head=af.HeadBox.getSelectedIndex();
            String alias=af.AliasField.getText();
            int priority=Integer.parseInt(af.PriorityField.getText());
            
            System.out.println("ADD button Pressed");
            fm.addGroupData(name, alias, priority, head);
                    }
            catch(NumberFormatException exp){
                JOptionPane.showMessageDialog(af,"Type Conversion error");
            }
                 
            }
            
        }
    }
}

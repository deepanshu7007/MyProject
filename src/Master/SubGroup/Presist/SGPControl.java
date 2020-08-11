/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Master.SubGroup.Presist;

import FrontPages.FrontModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author deepa
 */
public class SGPControl {
    AddPanel af;
    FrontModel fm;
    public SGPControl(AddPanel af,FrontModel fm)
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
            String head=af.GroupField.getText();
            String alias=af.AliasField.getText();
            int priority=Integer.parseInt(af.PriorityField.getText());
            
            System.out.println("ADD button Pressed");
            fm.addSubGroupData(name, alias, priority,head);
                    }
            catch(NumberFormatException exp){
                JOptionPane.showMessageDialog(af,"Type Conversion error");
            }
                 
            }
            
        }
    }
}

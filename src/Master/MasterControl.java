package Master;

import FrontPages.FrontView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

abstract class GroupMasterOperations{
    void AddOperation()
    {

    }
    void DeleteOperation()
    {

    }
    void ModifyOperation()
    {

    }
    void ViewOperation()
    {

    }
}
abstract class SubGrpMastOperations{
    void AddOperation()
    {

    }
    void DeleteOperation()
    {

    }
    void ModifyOperation()
    {

    }
    void ViewOperation()
    {

    }
}
abstract class HeadMastOperations{
    void AddOperation()
    {

    }
    void DeleteOperation()
    {

    }
    void ModifyOperation()
    {

    }
    void ViewOperation()
    {

    }
}

public class MasterControl {
    FrontView fv;
    PresistDataFrame pdf;
    DefaultTableModel dtm;
    MasterModel gmm;
    public MasterControl(GroupMasterPanel gmp,FrontView fv,MasterModel gmm)
    {
        this.gmm=gmm;
        this.fv=fv;
        dtm = gmp.tableModel;
        gmp.BackButtonAction(new BackButtonAct());
        gmp.AddButtonAction(new AddButtonAct()); 
        gmp.ModifyButtonAction(new ModifyButtonAct());
        gmp.DeleteButtonAction(new DeleteButtonAct());
    }
    class BackButtonAct implements ActionListener
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
    class AddButtonAct implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
         pdf = new PresistDataFrame(0);
         pdf.submitAction(new AddButtonListen());
        }
    
    }
    class ModifyButtonAct implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            pdf = new PresistDataFrame(1);
         pdf.submitAction(new AddButtonListen());
        }
    }
    class DeleteButtonAct implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
             pdf = new PresistDataFrame(2);
         pdf.submitAction(new AddButtonListen());
        }
    }
     class ViewButtonAct implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            pdf = new PresistDataFrame(1);
         pdf.submitAction(new AddButtonListen());
        }
    }
    
 ////////////////////////////////////Presist Data ADD BUTTON functionality//////////////////////////////
    class AddButtonListen implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Entered here");
            
            try
            {
                int priority=Integer.parseInt(pdf.getPriorityHead());
               gmm.pushGroupMaster(pdf.getNameHead(),pdf.getAliasHead(),priority,pdf.getComboHead()); 
               
               Vector v = new Vector();
            v.add(gmm.getGroupMaster().Name);
            v.add(gmm.getGroupMaster().Alias);
            v.add(gmm.getGroupMaster().priority);
            v.add(gmm.getGroupMaster().prevLink.name);
            dtm.addRow(v);
            dtm.fireTableDataChanged();
            }
            catch(NumberFormatException exp)
            {
                JOptionPane.showMessageDialog(fv, "Please enter valid data values");
                
            }
        }
    
    }
    ////////////////////////Presist Data ADD BUTTON functionality//////////////////////////////
}

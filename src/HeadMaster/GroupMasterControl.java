package HeadMaster;

import FrontPages.FrontView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class GroupMasterControl {
    FrontView fv;
    PresistDataFrame pdf;
    DefaultTableModel dtm;
    public GroupMasterControl(GroupMasterPanel gmp,FrontView fv)
    {
        dtm = gmp.tableModel;
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
         pdf = new PresistDataFrame();
         pdf.submitAction(new SubmitButtonListen());
        }
    
    }
    class SubmitButtonListen implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            Vector v = new Vector();
            v.add(pdf.getNameHead());
            v.add(pdf.getPriorityHead());
            v.add(pdf.getComboHead());
            v.add(pdf.getAliasHead());
            dtm.addRow(v);
            dtm.fireTableDataChanged();
        }
    
    }
}

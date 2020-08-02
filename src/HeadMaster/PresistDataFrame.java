package HeadMaster;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class PresistDataFrame extends JFrame
{
        private JTextField Name ;
        private JTextField Alias; 
        private JTextField Priority; 
        private JComboBox ComboBox;
    private JButton submitButton;
    PresistDataFrame()
    {
        setTitle("Enter Data");
        JLabel Nlabel = new JLabel("Name");
        JLabel Alabel = new JLabel("Alias");
        JLabel Plabel = new JLabel("Priority");
         Name = new JTextField(10);
         Alias = new JTextField(10);
         Priority = new JTextField(10);
        submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");
        ComboBox = new JComboBox(new Object[]{"ASSERTS","LIABILITY","INCOME","EXPENDITURE"});
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setBounds(500,200,600,600);
        add(Nlabel);
        add(Name);
        add(Alabel);
        add(Alias);
        add(Plabel);
        add(Priority);
        add(submitButton);
        add(cancelButton);
        add(ComboBox);
        setVisible(true);
        cancelButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    void submitAction(ActionListener evt)
    {
        submitButton.addActionListener(evt);
    }
    String getNameHead()
    {
        return Name.getText();
    }
    String getAliasHead(){return Alias.getText();}
    String getPriorityHead(){return Priority.getText();}
    String getComboHead(){return ComboBox.getSelectedItem().toString();}
}
package Master;
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
    private JButton cancelButton;
    PresistDataFrame(int i)
    {
        if(i==0)
        {
            AddButton();
        }
        if(i==1)
        {
            ModifyButton();
        }
        if(i==2)
        {
            DeleteButton();
        }
        this.cancelButton.addActionListener(new ActionListener() {

            
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    void submitAction(ActionListener evt)
    {
        submitButton.addActionListener(evt);
    }
    void setNameHead(String name){Name.setText(name);}
    void setAliasHead(String alias){Alias.setText(alias);}
    void setPriorityHead(int priority){Priority.setText(String.valueOf(priority));}
    void setComboHead(int selectedIndex){ComboBox.setSelectedIndex(selectedIndex);}
    String getNameHead(){return Name.getText();}
    String getAliasHead(){return Alias.getText();}
    String getPriorityHead(){return Priority.getText();}
    int getComboHead(){return ComboBox.getSelectedIndex();}
    void AddButton()
    {
        setTitle("Enter Data");
        JLabel Nlabel = new JLabel("Name");
        JLabel Alabel = new JLabel("Alias");
        JLabel Plabel = new JLabel("Priority");
         Name = new JTextField(10);
         Alias = new JTextField(10);
         Priority = new JTextField(10);
        submitButton = new JButton("Submit");
        cancelButton = new JButton("Cancel");
        ComboBox = new JComboBox(new Object[]{"ASSERTS","LIABILITY","INCOME","EXPENDITURE"});
        setLayout(new FlowLayout(FlowLayout.LEFT));
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
    }
    void ModifyButton()
    {
        setTitle("Modify Data");
        JLabel Nlabel = new JLabel("Name");
        JLabel Alabel = new JLabel("Alias");
        JLabel Plabel = new JLabel("Priority");
         Name = new JTextField(10);
         Alias = new JTextField(10);
         Priority = new JTextField(10);
        submitButton = new JButton("Submit");
        cancelButton = new JButton("Cancel");
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
    }
    void DeleteButton()
    {
        setTitle("Delete Item");
        JLabel Nlabel = new JLabel("Name");
        JLabel Alabel = new JLabel("Alias");
        JLabel Plabel = new JLabel("Priority");
         Name = new JTextField(10);
         Alias = new JTextField(10);
         Priority = new JTextField(10);
        submitButton = new JButton("Submit");
        cancelButton = new JButton("Cancel");
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
    }
}
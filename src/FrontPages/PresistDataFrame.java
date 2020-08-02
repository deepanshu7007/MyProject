package FrontPages;
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
    PresistDataFrame()
    {
        setTitle("Enter Data");
        JLabel Nlabel = new JLabel("Name");
        JLabel Alabel = new JLabel("Alias");
        JLabel Plabel = new JLabel("Priority");
        JTextField Name = new JTextField(10);
       JTextField Alias = new JTextField(10);
       JTextField Priority = new JTextField(10);
       JButton submitButton = new JButton("Submit");
       JButton cancelButton = new JButton("Cancel");
        JComboBox ComboBox = new JComboBox(new Object[]{"ASSERTS","LIABILITY","INCOME","EXPENDITURE"});
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
        submitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Submit button pressed");
            }
        });
        cancelButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
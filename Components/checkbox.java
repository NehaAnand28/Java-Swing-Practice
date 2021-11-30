import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.event.*;  

class checkbox {
    JFrame frame;
    JPanel panel;
    JCheckBox c1,c2,c3,c4;
    JLabel header_text;
    checkbox()
    {
        //Creating instance of JFrame
        frame = new JFrame();
        //Creating instance of JPanel
        panel = new JPanel();
        header_text = new JLabel();
        
        //creating checkboxes
        c1 = new JCheckBox("English");
        c2 = new JCheckBox("German");
        c3 = new JCheckBox("Spanish");
        c4 = new JCheckBox("French");

        

        panel.add(header_text);
        //adding checkboxes to panel
        panel.add(c1);
        panel.add(c2);
        panel.add(c3);
        panel.add(c4);
        //adding panel to frame
        frame.add(panel);

        //adding ItemListeners to each checkbox
        c1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                header_text.setText("You "+ (e.getStateChange() == 1? "checked ":"unchecked ") + "English");
            }
        });
        c2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                header_text.setText("You "+ (e.getStateChange() == 1? "checked ":"unchecked ") + "German");
            }
        });
        c3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                header_text.setText("You "+ (e.getStateChange() == 1? "checked ":"unchecked ") + "Spanish");
            }
        });
        c4.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                header_text.setText("You "+ (e.getStateChange() == 1? "checked ":"unchecked ") + "French");
            }
        });

        
       //layout set to BoxLayout
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        //This method sets the width and height of the frame
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    public static void main(String[] args)
    {
       new checkbox();
    }
}
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;  

class radiobutton implements ActionListener{
    JFrame frame;
    JPanel panel;
    JRadioButton r1,r2,r3,r4;
    ButtonGroup bg;
    JButton show;
    JLabel footer_text;
    radiobutton()
    {
        //Creating instance of JFrame
        frame = new JFrame();
        //Creating instance of JPanel
        panel = new JPanel();
        footer_text = new JLabel();
        
        //creating RadioButtons
        r1 = new JRadioButton("English");
        r2 = new JRadioButton("German");
        r3 = new JRadioButton("French");
        r4 = new JRadioButton("Spanish");

        //adding radiobuttons to buttongroup
        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);

        show = new JButton("Show");
        show.addActionListener(this);
        //adding radiobuttons to panel
        panel.add(r1);
        panel.add(r2);
        panel.add(r3);
        panel.add(r4);
        panel.add(show);
        panel.add(footer_text);

        //adding panel to frame
        frame.add(panel);

       //layout set to BoxLayout
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        //This method sets the width and height of the frame
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e)
    {
        String msg="";
        if(r1.isSelected())
        {
            msg = "You selected English";
        }
        else if(r2.isSelected())
        {
            msg = "You selected German";
        }
        else if(r3.isSelected())
        {
            msg = "You selected French";

        }
        else if(r4.isSelected())
        {
            msg = "You selected Spanish";

        }
        footer_text.setText(msg);
    }
    
    public static void main(String[] args)
    {
       new radiobutton();
    }
}
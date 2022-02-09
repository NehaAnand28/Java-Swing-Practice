import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class combobox extends JFrame{
    JPanel panel;
    JComboBox<String> box;
    JLabel header;
    JButton show;
    combobox(){
        //creating an instance of Panel
        panel = new JPanel();
        //sets the title of Frame
        setTitle("Combo Box example");
        // creates an instance of label
        header = new JLabel();

        //creates a combo box of languages
        String languages[] = {"English","French","German","Spanish","Greek"};
        box = new JComboBox<String>(languages);
        box.addItem("Portuguese");

        //a button to display selected language
        show = new JButton("Show");
        show.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String msg = "Language selected : " + box.getItemAt(box.getSelectedIndex());
                header.setText(msg);
            }
        });

        //adding components to panel
        panel.add(header);
        panel.add(box);
        panel.add(show);
        //panel added to frame
        add(panel);
        //layout set to flowlayout
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);    
    }

    public static void main(String[] args)
    {
        new combobox();
    }
}
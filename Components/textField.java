import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

class textField {

  public static void main(String[] args) {
    //Creating instance of JFrame
    JFrame frame = new JFrame("Jlabel");
    //Creating JLabel
    JLabel l1 = new JLabel("Name");
    JLabel l2 = new JLabel("Password");
    JLabel l3 = new JLabel("Address");

    //Creating JTextField
    JTextField name = new JTextField(10);
    l1.setLabelFor(name);

    //Creating JPasswordField
    JPasswordField password = new JPasswordField(10);
    l2.setLabelFor(password);

    //Creating JTextArea
    JTextArea address = new JTextArea();
    address.setRows(3);
    address.setColumns(10);
    l3.setLabelFor(address);

    /* This method specifies the location and size
     * of any component = > setBounds(x, y, width, height)
     * where x & y are cordinates from the top left
     * corner and remaining two parameters are the width
     * and height of the specific component.
     */
    l1.setBounds(100, 100, 50, 30);
    name.setBounds(200,100,100,30);

    l2.setBounds(100, 150, 70, 30);
    password.setBounds(200,150,100,30);

    l3.setBounds(100, 200, 50, 30);
    address.setBounds(200,200,150,100);

    /* changing appearance of the label
     * Font,text color,background color
     */
    l1.setFont(new Font("Arial", Font.ITALIC, 15));
    name.setFont(new Font("Arial", Font.ITALIC, 15));
    address.setFont(new Font("Calibri",Font.PLAIN,15));



    //adds the labels to the frame
    frame.add(l1);
    frame.add(name);
    frame.add(l2);
    frame.add(password);
    frame.add(l3);
    frame.add(address);

    /* layout set to null ->
     * as no layout managers used
     * in this example (like FlowLayout,BoxLayout.etc)
     */
    frame.setLayout(null);

    //sets the frame visibility to true
    frame.setVisible(true);

    //This method sets the width and height of the frame
    frame.setSize(400, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

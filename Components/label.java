import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

class label {

  public static void main(String[] args) {
    //Creating instance of JFrame
    JFrame frame = new JFrame("Jlabel");
    //Creating JLabel
    JLabel l = new JLabel("This is a basic Label");

    JLabel l1 = new JLabel();
    l1.setText("Label text set using setText method");

    JLabel l2 = new JLabel(new ImageIcon("alert-icon.png"));

    JLabel l3 = new JLabel(
      "label with icon and text",
      new ImageIcon("alert-icon.png"),
      SwingConstants.LEFT
    );

    /* This method specifies the location and size
     * of any component = > setBounds(x, y, width, height)
     * where x & y are cordinates from the top left
     * corner and remaining two parameters are the width
     * and height of the specific component.
     */
    l.setBounds(100, 100, 200, 30);
    l1.setBounds(100, 150, 220, 40);
    l2.setBounds(100, 200, 50, 50);
    l3.setBounds(100, 280, 220, 50);

    /* changing appearance of the label
     * Font,text color,background color
     */
    l.setFont(new Font("Arial", Font.ITALIC, 15));
    l1.setForeground(Color.BLUE);
    l3.setForeground(Color.RED);
    l3.setOpaque(true);
    l3.setBackground(Color.WHITE);


    //adds the labels to the frame
    frame.add(l);
    frame.add(l1);
    frame.add(l2);
    frame.add(l3);

    /* labels can be added to frame,panel,dialog and applet
     * can also specify layout manager while adding
     */

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

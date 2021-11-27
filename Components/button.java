import javax.swing.JButton;
import javax.swing.JFrame;

class button{
    public static void main(String[] args){
        //Creating instance of JFrame
        JFrame frame = new JFrame("Jbutton");
        //Creating JButton
        JButton b = new JButton("This is a Button");

        /* This method specifies the location and size
         * of any component = > setBounds(x, y, width, height)
         * where x & y are cordinates from the top left 
         * corner and remaining two parameters are the width
         * and height of the specific component.
         */
        b.setBounds(100,100,140,30);

        //adds the button to the frame
        frame.add(b);

        /* layout set to null -> 
         * as no layout managers used 
         * in this example (like FlowLayout,BoxLayout.etc)
         */
        frame.setLayout(null);

        //sets the frame visibility to true
        frame.setVisible(true);

        //This method sets the width and height of the frame
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JFrame;

class table{
    JFrame frame;
    JTable tb;

    table(){
        //Creating instance of JFrame
        frame = new JFrame("JTable");
        
        String rows[][] = { {"100","Torle","70000"},{"101","Phix","65000"},
        {"102","Lazyflower","60000"},{"103","Tom","55000"},{"104","Charlie","50000"},{"105","Tarzou","45000"},{"106","Mysterio","40000"}};

        String column[] = {"ID","NAME","POINTS"};

        //Initializing JTable
        tb = new JTable(rows,column);
        tb.setBounds(30, 40, 500, 300);  

        //Adding JTable to Scrollpane
        JScrollPane scroll = new JScrollPane(tb);

        //Adding ScrollPane to frame
        frame.add(scroll);

        /* ScrollPane doesn't work with Layout set to null 
        */
        // frame.setLayout(null);

        //sets the frame visibility to true
        frame.setVisible(true);

        //This method sets the width and height of the frame
        frame.setSize(500,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new table();
    }
}

 

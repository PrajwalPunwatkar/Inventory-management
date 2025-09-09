import javax.swing.*;

class buttonImpli {
    JFrame f;
    buttonImpli(){
        f= new JFrame("title");
        JButton jb = new JButton("abc");
        JCheckBox cb = new JCheckBox("text");
        cb.setSize(20,50);


        f.add(cb);
        f.setSize(1000,1000);
        jb.setBounds(20,10,200,100);
        jb.setSize(10,10);

        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
public class test1{
    public static void main(String[] args) {

        new buttonImpli();


    }

}

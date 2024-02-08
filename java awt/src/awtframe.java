import java.awt.*;
import java.awt.event.*;

public class awtframe {
    public awtframe(){
        Frame frame = new Frame("gui");
        frame.setSize (400,800);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });
    }

    public static void main(String[] args){
        awtframe obj1 = new awtframe();
        System.out.println("Hello World");
    }
}

package Java_API;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AwtQ2 implements WindowListener {
    public AwtQ2(){
        Frame frame = new Frame("hello first code");

        TextField textField = new TextField();
        textField.setBackground(Color.white);
        textField.setBounds(20,120,150,70);

        Label label =new Label("Java Programmer");
        label.setBackground(Color.cyan);
        label.setBounds(20,90,150,30);


        Button button= new Button("click me");
        button.setBackground(Color.red);
        button.setForeground(Color.white);
        button.setBounds(20,40,80,30);

        frame.add(button);
        frame.add(textField);
        frame.add(label);

         frame.setSize(350,250);
         frame.setLayout(null);
         frame.setVisible(true);

         // first way  window close
//         frame.addWindowListener(new WindowAdapter() {
//             @Override
//             public void windowClosed(WindowEvent e) {
//                 frame.dispose();
//             }
//         });

        // second way close for window
        frame.addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opend");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        Frame frame =(Frame) e.getSource();
        frame.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Close");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Conified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Active");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("deactive Window");
    }

    public static void main(String[] args) {
        AwtQ2 obj1 =new AwtQ2();
    }
}

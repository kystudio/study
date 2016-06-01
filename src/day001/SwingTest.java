package day001;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by kystudio on 2016/4/11.
 */
public class SwingTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");
        JButton button = new JButton("click me");

        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello,World!");
                System.out.println("Welcome!");
            }

        });

        frame.setSize(200, 200);
        frame.getContentPane().add(button);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Closing!");
                super.windowClosing(e);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Closd!");
                super.windowClosed(e);
            }
        });

        frame.setVisible(true);
    }
}

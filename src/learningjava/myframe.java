package learningjava;

import java.awt.event.ActionEvent;

import java.awt.FlowLayout;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Dimension;

import javax.swing.JTextField;

public class myframe extends JFrame implements ActionListener {

    myframe() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button = new JButton("Submit");
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 100));
        this.add(textField);
        this.add(button);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}

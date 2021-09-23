package learningjava;

import java.awt.Font;
import java.awt.event.ActionEvent;

import java.awt.FlowLayout;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Dimension;

import javax.swing.JTextField;

public class myframe2 extends JFrame implements ActionListener {

    JButton button2;
    JTextField text;

    myframe2() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setTitle("Enter your name");

        button2 = new JButton("Submit");
        button2.addActionListener(this);

        text = new JTextField();
        text.setPreferredSize(new Dimension(250, 100));
        text.setFont(new Font("MV Boli", Font.PLAIN, 30));

        this.add(text);
        this.add(button2);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button2) {
            JOptionPane.showMessageDialog(null, "Welcome " + text.getText());
        }

    }

}

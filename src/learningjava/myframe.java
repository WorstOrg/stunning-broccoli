package learningjava;

import java.awt.Font;
import java.awt.event.ActionEvent;

import java.awt.FlowLayout;

import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.border.Border;

public class myframe extends JFrame implements ActionListener {

    Border border = BorderFactory.createLineBorder(Color.GREEN, 3);

    JLabel botmsg = new JLabel();
    JButton button;
    JButton button2;
    JTextField textFeild;
    JTextField text2;

    myframe() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setTitle("Enter your name");

        button = new JButton("Submit");
        button.addActionListener(this);

        botmsg.setText("This will be your name");
        botmsg.setHorizontalAlignment(JLabel.LEFT);
        botmsg.setVerticalAlignment(JLabel.BOTTOM);
        botmsg.setForeground(Color.WHITE);
        botmsg.setFont(new Font("MV Boli", Font.PLAIN, 35));

        textFeild = new JTextField();
        textFeild.setPreferredSize(new Dimension(250, 100));
        textFeild.setFont(new Font("MV Boli", Font.PLAIN, 30));

        this.setSize(1200, 800);
        this.add(textFeild);
        this.add(button);
        this.add(botmsg);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            botmsg.setText(textFeild.getText());
        }
    }

}

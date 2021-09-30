package learningjava;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class name extends JFrame implements ActionListener {

    Border border = BorderFactory.createLineBorder(Color.GREEN, 1);

    JLabel umsg = new JLabel();
    JLabel botmsg = new JLabel();
    JLabel title = new JLabel();
    JButton button;
    JButton button2;
    JTextField textFeild;

    name() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Enter your name");

        title.setText("You are entering your name");
        title.setBounds(350, 50, 500, 40);
        title.setFont(new Font("MV Boli", Font.PLAIN, 35));
        title.setForeground(Color.WHITE);

        button = new JButton("Submit");
        button.addActionListener(this);
        button.setBounds(500, 200, 100, 55);

        button2 = new JButton("Next Question");
        button2.addActionListener(this);
        button2.setBounds(500, 700, 200, 55);

        umsg.setForeground(Color.WHITE);
        umsg.setFont(new Font("MV Boli", Font.PLAIN, 35));
        umsg.setBorder(border);
        umsg.setBounds(630, 330, 500, 100);

        botmsg.setForeground(Color.WHITE);
        botmsg.setFont(new Font("MV Boli", Font.PLAIN, 35));
        botmsg.setBorder(border);
        botmsg.setBounds(10, 500, 500, 100);

        textFeild = new JTextField();
        textFeild.setPreferredSize(new Dimension(250, 100));
        textFeild.setFont(new Font("MV Boli", Font.PLAIN, 30));
        textFeild.setBounds(450, 150, 200, 40);

        this.setSize(1200, 800);
        this.add(textFeild);
        this.add(button);
        this.add(umsg);
        this.add(botmsg);
        this.add(button2);
        this.add(title);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            umsg.setText(textFeild.getText());
            botmsg.setText("Welcome! " + textFeild.getText());
        }
        if (e.getSource() == button2) {
            new hobby();

        }

    }

}
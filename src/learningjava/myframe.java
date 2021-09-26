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

public class myframe extends JFrame implements ActionListener {

    Border border = BorderFactory.createLineBorder(Color.GREEN, 3);

    JLabel botmsg = new JLabel();
    JButton button;
    JButton button2;
    JTextField textFeild;
    JTextField text2;

    myframe() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Enter your name");

        button = new JButton("Submit");
        button.addActionListener(this);
        button.setBounds(500, 200, 100, 55);

        botmsg.setText("This will be your name");
        botmsg.setForeground(Color.WHITE);
        botmsg.setFont(new Font("MV Boli", Font.PLAIN, 35));

        botmsg.setBounds(30, 330, 500, 100);

        textFeild = new JTextField();
        textFeild.setPreferredSize(new Dimension(250, 100));
        textFeild.setFont(new Font("MV Boli", Font.PLAIN, 30));
        textFeild.setBounds(450, 150, 200, 40);

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

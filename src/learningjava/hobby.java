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

@SuppressWarnings("unused")

public class hobby extends JFrame implements ActionListener {
    Border border = BorderFactory.createLineBorder(Color.GREEN, 1);
    JButton button;
    JTextField textFeild;
    JLabel umsg = new JLabel();
    JLabel botmsg = new JLabel();
    JLabel title = new JLabel();

    hobby() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Enter hobby");

        title.setText("You are entering your hobby");
        title.setBounds(350, 50, 500, 40);
        title.setFont(new Font("MV Boli", Font.PLAIN, 35));
        title.setForeground(Color.WHITE);

        button = new JButton("Submit");
        button.addActionListener(this);
        button.setBounds(500, 200, 100, 55);

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
        this.setVisible(true);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.add(button);
        this.add(umsg);
        this.add(botmsg);
        this.add(textFeild);
        this.add(title);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            umsg.setText(textFeild.getText());
            botmsg.setText("I like " + textFeild.getText() + " too!");
        }
    }
}

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

public class myframe extends JFrame implements ActionListener {

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

        textFeild = new JTextField();
        textFeild.setPreferredSize(new Dimension(250, 100));
        textFeild.setFont(new Font("MV Boli", Font.PLAIN, 30));

        this.add(textFeild);
        this.add(button);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(null, "Welcome " + textFeild.getText());
        }
    }

}

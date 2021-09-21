package learningjava;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;

@SuppressWarnings("unused")

public class Main {

	// when u come back after 1 and half month and see no comments be like...
	// read the documentation!!! + trying as best to add coments so sry.
	public static void main(String[] args) {

		ImageIcon image = new ImageIcon("cool.png");

		Border border = BorderFactory.createLineBorder(Color.PINK, 3);

		JLabel label = new JLabel();
		label.setText("Bro, are you bored?");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("MV Boli", Font.PLAIN, 50));
		label.setIconTextGap(50);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setIcon(image);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);

		JFrame mainframe = new JFrame();
		mainframe.setTitle("TestFrame");
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.setSize(700, 700);
		mainframe.setVisible(true);
		mainframe.getContentPane().setBackground(Color.DARK_GRAY);
		mainframe.add(label);

	}
}

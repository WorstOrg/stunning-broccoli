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

		ImageIcon image = new ImageIcon("cool.png"); // setting a image so that a label can use it as an image

		Border border = BorderFactory.createLineBorder(Color.GREEN, 3); // a border line cuz idk

		JLabel label = new JLabel(); // creating a label a label is text + img or only text
		label.setText("You bored broh?"); // sets text to the string in the "these marks"
		label.setForeground(Color.WHITE); // sets font colour
		label.setFont(new Font("MV Boli", Font.PLAIN, 50)); // changes font
		label.setIconTextGap(50); // gives gap between image and text negative numbers are closer.
		label.setHorizontalTextPosition(JLabel.CENTER); // sets text position of horizantal
		label.setVerticalTextPosition(JLabel.TOP); // sets text position of vertical
		label.setIcon(image); // setting a image from a variable. (we declared this early on.)
		label.setBorder(border); // setting a border from a variable. (we declared this early on.)
		label.setVerticalAlignment(JLabel.CENTER); // set whole label position of vertical this is used for images.
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

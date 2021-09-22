package learningjava;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;

@SuppressWarnings("unused")

public class Main {
	public static void main(String[] args) {

		ImageIcon image = new ImageIcon("cool.png"); // setting a image so that a label can use it as an image

		Border border = BorderFactory.createLineBorder(Color.GREEN, 3); // a border line cuz idk

		JPanel panel = new JPanel();

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
		label.setHorizontalAlignment(JLabel.CENTER); // set whole label position of horizantal this is used for images.
		label.setBackground(Color.GREEN); // background color of label only
		label.setBounds(0, 0, 635, 635); // bounds of label
		label.setOpaque(true); // gotta set this shit for background color

		JFrame mainframe = new JFrame(); // creating a frame or screen of the app
		mainframe.setTitle("TestFrame"); // title of the frane
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // if you do not set this to exit on close it will
		// remain a background proccess
		mainframe.setSize(1200, 800); // size(resolution) of the app/frame
		mainframe.setVisible(true); // setting its visibility to true otherwise will not show.
		mainframe.getContentPane().setBackground(Color.DARK_GRAY); // setting background colour of screen of app/frame
		mainframe.add(label); // adding a label
		mainframe.setLayout(null); // setting the bounds/layout

	}
}

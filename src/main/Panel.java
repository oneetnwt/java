package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Panel extends JPanel {
	private KeyboardInput key;

	public Panel() {
		key = new KeyboardInput();
		setPreferredSize(Manager.SIZE);
		setFocusable(true); // Allow the panel to receive focus for key events
		addKeyListener(key); // Register key listener
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		if (key.a) { // if a is true
			g2.setColor(Color.CYAN); // set the color to cyan
			g2.fillOval(50, 0, 400, 400); // Drawing a circle

			g2.setColor(Color.BLACK); // setting the color to black for the text
			Font font = new Font("Poppins", Font.PLAIN, 24); // setting the font styles
			g2.setFont(font); // setting the font

			g2.drawString("CIRCLE", 200, 450); // displaying a text circle at the bottom of the oval
		} else { // if a is false or nothing is true
			int[] triangleX = { 250, 0, 500 }; // X coordinates
			int[] triangleY = { 0, 400, 400 }; // Y coordinates
			// 250 and 0, 0 and 400, 500 and 400

			g2.setColor(Color.PINK); // set the color to pink
			g2.fillPolygon(triangleX, triangleY, 3); // setting the 3 coordinates according to the array, with 3 points

			g2.setColor(Color.BLACK); // setting the color to black for the text
			Font font = new Font("Poppins", Font.PLAIN, 24);
			g2.setFont(font); // setting the font

			g2.drawString("TRIANGLE", 200, 450); // writing a string TRIANGLE at the bottom of the triangle

		}

		g2.dispose(); // used to free up resources
	}
}

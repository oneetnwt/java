package main;

import javax.swing.JFrame;

public class Window {
//	Creating a private instance of JFrame
	private JFrame frame;

	public Window(Panel p) {
//		Initializing the JFrame instance
		frame = new JFrame();

		frame.setSize(Manager.SIZE); // Seting the frame to the SIZE initilized in Manager file
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Setting the default close operation so that the program
																// will terminate if you press the X button in the
																// window
		frame.setResizable(false); // Setting the resizable to false so that i cannot be resized
		frame.setLocationRelativeTo(null); // Setting the location to null so that it will open the window at the center
											// of the screen
		frame.add(p); // Used to add the component to the frame.
		frame.pack(); // Used to display the components added to the frame; Automatically sizes the
						// frame to fit its components snugly.
		frame.setVisible(true); // Setting the visiblity to true so the window will appear
	}
}

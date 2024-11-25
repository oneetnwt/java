package main;

import java.awt.Dimension;

public class Manager {
	// Constants for window size
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
	public static final Dimension SIZE = new Dimension(WIDTH, HEIGHT);

	private Window window; // This will manage the window's creation
	private Panel panel; // This is where the drawing happens (like the canvas)
	private KeyboardInput key; // This handles keyboard inputs

	private boolean isRunning = true; // A flag to control the main loop

	public Manager() {
		panel = new Panel(); // Create a new panel (drawing area)
		window = new Window(panel); // Create a window and pass the panel to it
		panel.requestFocus(); // Make sure the panel is ready to receive keyboard input
		key = new KeyboardInput(); // Set up keyboard input handling

		mainManager(); // Start the main loop (this will run indefinitely until isRunning is false)
	}

	// This method is used to trigger the drawing (repaint the panel)
	public void draw() {
		panel.repaint(); // Calls the paintComponent method of the panel to redraw
	}

	// The main loop that keeps the program running
	public void mainManager() {
		while (isRunning) { // Keep running while isRunning is true
			draw(); // Keep drawing the panel (this will call repaint constantly)
		}
	}
}

package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInput implements KeyListener {
	public boolean a = false;

	@Override
	public void keyPressed(KeyEvent e) {
//		if A key is pressed, the a value will be true
		if (e.getKeyCode() == KeyEvent.VK_A) {
			a = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
//		if A key is released, the a value will be false
		if (e.getKeyCode() == KeyEvent.VK_A) {
			a = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Optional: Handle key typed events if necessary
	}
}

package programita;

import java.awt.Color;

import javax.swing.JFrame;

import GUI.MyFrame;

public class Threads extends Thread {
	@Override
	public void run() {
		
		
		int timer = (new Variables().getTimer());
		boolean loop = (new Variables().getRGB());
		try {
			
			while (loop) {
				for (int i = 0; i <= 255; i++) {
					frame.getContentPane().setBackground(new Color(255, i, 0));
					Thread.sleep(timer);
				}
				for (int i = 0; i <= 255; i++) {
					frame.getContentPane().setBackground(new Color(255 - i, 255, 0));
					Thread.sleep(timer);
				}
				for (int i = 0; i <= 255; i++) {
					frame.getContentPane().setBackground(new Color(0, 255, i));
					Thread.sleep(timer);
				}
				for (int i = 0; i <= 255; i++) {
					frame.getContentPane().setBackground(new Color(0, 255 - i, 255));
					Thread.sleep(timer);
				}
				for (int i = 0; i <= 255; i++) {
					frame.getContentPane().setBackground(new Color(i, 0, 255));
					Thread.sleep(timer);
				}
				for (int i = 0; i <= 255; i++) {
					frame.getContentPane().setBackground(new Color(255, 0, 255 - i));
					Thread.sleep(timer);
				}

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

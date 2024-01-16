package programita;

import java.awt.Color;
import java.awt.Component;

import GUI.MyFrame;

public class Threads extends Thread {

	private MyFrame frame;
	private int option;
	private Component comp;

	public Threads(MyFrame frame) {
		this.frame = frame;
		this.option = 1;
	}

	public Threads(MyFrame frame, int option) {
		this.frame = frame;
		this.option = option;
	}

	public Threads(MyFrame frame, int option, Component comp) {
		this.frame = frame;
		this.option = option;
		this.comp = comp;
	}

	@Override
	public void run() {
		switch (option) {
		case 1:
			rainbow();
			break;
		case 2:
			
			break;
		}

	}



	private void rainbow() {
		int timer = 1;
		boolean loop = true;
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
		} catch (

		InterruptedException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

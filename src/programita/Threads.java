package programita;

import java.awt.Color;

import javax.swing.JFrame;

public class Threads extends Thread {

	public void rainbow(JFrame frame, boolean loop) {
	while(loop)
	{
	        try
			{				
				for (int i = 0; i <= 255; i++) {
					frame.getContentPane().setBackground(new Color(255, i, 0));
					Thread.sleep(1);
				}
				for (int i = 0; i <= 255; i++) {
					frame.getContentPane().setBackground(new Color(255 - i, 255, 0));
					Thread.sleep(1);
				}
				for (int i = 0; i <= 255; i++) {
					frame.getContentPane().setBackground(new Color(0, 255, i));
					Thread.sleep(1);
				}
				for (int i = 0; i <= 255; i++) {
					frame.getContentPane().setBackground(new Color(0, 255 - i, 255));
					Thread.sleep(1);
				}
				for (int i = 0; i <= 255; i++) {
					frame.getContentPane().setBackground(new Color(i, 0, 255));
					Thread.sleep(1);
				}
				for (int i = 0; i <= 255; i++) {
					frame.getContentPane().setBackground(new Color(255, 0, 255-i));
					Thread.sleep(1);
				}
				
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

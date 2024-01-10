package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;

import programita.Threads;

public class MyFrame extends JFrame{
	public MyFrame()
	{
		getContentPane().setBackground(new Color(0,0,0));
		
		closeByTimer();
		(new Threads()).start();
		icon("icon.png");
		this.setTitle("Bondiola");
		this.setSize(256, 256);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	
	private void closeByTimer() {
		Timer timer = new Timer(15000, (ActionEvent e) ->
		{
	        this.dispose(); 
	    });
		timer.start();
	}
	
	private void icon(String URL) {
		this.setIconImage((new ImageIcon(URL)).getImage());
	}
}
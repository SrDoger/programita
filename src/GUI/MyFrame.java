package GUI;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;

import programita.Threads;

public class MyFrame extends JFrame {
	
	private String title = "Default";
	private String icon = "icon.png";
	private String backgroundColor = "rainbow"; // black, rainbow, white
	private short height = 512;
	private short width = 512;
	
	public MyFrame() {
		switchBackgroundColor(backgroundColor);
		appIcon(icon);
		setTitle(title);
		setSize(width, height);
		closeByTimer(10);
	}
	
	public void MFLabels(List<MyLabel> listML)
	{
		
		for(MyLabel element : listML)
			add(element);	
	}
	
	public void frameStart() {
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setLayout(null);
		setVisible(true);
	}
	private void closeByTimer(int seconds) {
		Timer timer = new Timer(seconds * 1000, (ActionEvent e) ->
		{
	        this.dispose(); 
	    });
		timer.start();
	}
	
	private void appIcon(String URL) {
		this.setIconImage((new ImageIcon(URL)).getImage());
	}

	private void switchBackgroundColor(String option) {
		switch(option)
		{
		case "black":
			getContentPane().setBackground(Color.BLACK);
			break;
		case "white":
			getContentPane().setBackground(Color.white);
			break;
		case "rainbow":
			(new Threads(this)).start(); // rainbow background
			break;
		default:
			getContentPane().setBackground(Color.BLACK);
			break;
			
		
			}
		}
	}
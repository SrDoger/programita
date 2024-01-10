package programita;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

import java.awt.event.ActionEvent;


public class GUI {
	public GUI(Variables var) {
		JFrame frame = new JFrame();
		JButton button = new JButton();
		JLabel text = new JLabel("mondongo");
		JPanel panel= new JPanel();
		closeByTimer(frame);
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(text);
		
		frame.setTitle("Play Terraria <3");
		
		
		icon(frame, "icon.png");
		frame.getContentPane().setBackground(new Color(0,0,0));
		frame.setSize(256, 256);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		Threads changeColor = new Threads();
		changeColor.rainbow(frame,true);
		
		// frame.pack(); change size depends of the content
	}
	
	
	private void closeByTimer(JFrame frame) {
		Timer timer = new Timer(15000, (ActionEvent e) ->
		{
            frame.dispose(); 
        });
		timer.start();
	}
	
	
	private void icon(JFrame frame, String URL) {
		frame.setIconImage((new ImageIcon(URL)).getImage());
	}
	
}

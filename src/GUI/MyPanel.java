package GUI;

import javax.swing.*;

public class MyPanel {
	public MyPanel() {

		JPanel panel = new JPanel();

		// panel.setLayout(new GridLayout(0,1));
		panel.add(new JButton("Torta Frita"));
		panel.add(new JLabel("Mondongo"));

		// frame.pack(); // change size depends of the content
	}

}

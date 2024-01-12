package GUI;

import java.awt.Color;

import javax.swing.*;

public class MyLabel extends JLabel{

	public MyLabel(int x, int y, int width, int height, Color color, Color border)
	{
		setBackground(color);
		setOpaque(true);
		setText("Pan con queso");
		//setBorder(BorderFactory.createLineBorder(border, 0));		
		setVerticalAlignment(CENTER);
		setHorizontalAlignment(CENTER);
		setBounds(x,y,width,height);
		
		
	}

}

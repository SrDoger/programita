package GUI;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class MyLabel extends JLabel{
	public MyLabel()
	{
		setLayout(new FlowLayout());
		setSize(512,512);
	}
	public MyLabel(int x, int y, int width, int height, Color color, Color border)
	{
		setBackground(color);
		setOpaque(true);
		setText("Pan con queso");
		//setBorder(BorderFactory.createLineBorder(border, 0));		
		setVerticalAlignment(TOP);
		setHorizontalAlignment(CENTER);
		setBounds(x,y,width,height);
		
		
	}

}

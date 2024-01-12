package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyButton extends JButton implements ActionListener{

		MyFrame MF;
	public MyButton(int x, int y, int width, int height, String texto, MyFrame MF) {
		this.MF = MF;
		setBounds(x,y,width,height);
		setText(texto);
		setVerticalAlignment(CENTER);
		setHorizontalAlignment(CENTER);
		addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.MF.dispose();
	}
	

}

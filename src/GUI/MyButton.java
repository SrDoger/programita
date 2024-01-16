package GUI;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

public class MyButton extends JButton {

	private MainFrame MF;

	public MyButton(String texto, MainFrame MF) {
		this.MF = MF;
		setSize(75, 20);
		setText(texto);
		setVerticalAlignment(CENTER);
		setHorizontalAlignment(CENTER);
		
	}

	public MyButton(int x, int y, int width, int height, String texto, MainFrame MF) {
		this.MF = MF;
		setBounds(x, y, width, height);
		setText(texto);
		setVerticalAlignment(CENTER);
		setHorizontalAlignment(CENTER);
	}

	private void CaseEvent(int option, List<Component> removeFrame) {
		switch (option) {
		case 0:
			this.MF.frame.dispose();
			break;
		case 1:
			this.MF.closeFrame(removeFrame);
			break;
		default:
			System.out.println("tutifruti");
		}
	}

	public void eventID(int event, List<Component> removeFrame) {
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CaseEvent(event, removeFrame);
			}
		});
	}

}

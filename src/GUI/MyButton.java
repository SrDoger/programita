package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyButton extends JButton {

	private MyFrame MF;

	public MyButton(String texto, MyFrame MF,int action) {
		this.MF = MF;
		setSize(75,20);
		setText(texto);
		setVerticalAlignment(CENTER);
		setHorizontalAlignment(CENTER);
		eventID(action);
	}

	public MyButton(int x, int y, int width, int height, String texto, MyFrame MF) {
		this.MF = MF;
		setBounds(x, y, width, height);
		setText(texto);
		setVerticalAlignment(CENTER);
		setHorizontalAlignment(CENTER);
	}

	private void CaseEvent(int option) {
		switch (option) {
		case 0: {
			this.MF.dispose();
			break;
		}
		default:
			System.out.println("tutifruti");
		}
	}

	public void eventID(int event) {
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CaseEvent(event);

			}
		});
	}

}

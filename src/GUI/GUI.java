package GUI;


import java.awt.Component;
import java.awt.GridLayout;
import java.util.List;



public class GUI {
	public GUI() {

		MyFrame frame = new MyFrame();
		MainFrame mf = new MainFrame(frame);
		List<Component> components = mf.menu();
		
		
		frame.setLayout(new GridLayout(6, 1, 10, 10));
		frame.setSize(512,512);
		
		
		
		
		
		frame.frameStart();
	}
}




/*
 * MyLabel L1 = new MyLabel(0, 0, 255, 255, Color.WHITE, Color.BLACK); //MyLabel
 * L2 = new MyLabel(255, 0, 255, 255, Color.BLACK, Color.WHITE);
 * 
 * List<MyLabel> listML = new ArrayList<>(); //List<MyButton> listMB = new
 * ArrayList<>(); listML.add(L1); //listML.add(L2); //listMB.add(B1);
 * 
 * 
 * frame.setLayout(new FlowLayout()); MyButton B1 = new MyButton(155, 200, 200,
 * 50, "exit", frame); B1.eventID(0);
 * 
 * /*for(int i = 0; i <= 10; i++) frame.add(new MyButton(70 * i, 10, 70, 25,
 * Integer.toString(i), frame));
 * 
 * 
 * 
 * frame.add(B1);
 * 
 * frame.MFLabels(listML);
 */

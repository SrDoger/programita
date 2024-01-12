package GUI;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class GUI {
	public GUI()
	{
		MyLabel L1 = new MyLabel(0, 0, 255, 255, Color.WHITE, Color.BLACK);
		MyLabel L2 = new MyLabel(255, 0, 255, 255, Color.BLACK, Color.WHITE);
		
		List<MyLabel> listML = new ArrayList<>();
		//List<MyButton> listMB = new ArrayList<>();
		listML.add(L1);
		listML.add(L2);
		//listMB.add(B1);
		
		MyFrame frame = new MyFrame();
		
		MyButton B1 = new MyButton(155, 200, 200, 50, "exit", frame);
		frame.add(B1);
		frame.frameStart();
		frame.MFLabels(listML);
	}
}

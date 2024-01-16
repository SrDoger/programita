package GUI;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import programita.Threads;

public class MainFrame
{
	MyFrame frame;
	
	public MainFrame(MyFrame frame)
	{
		this.frame = frame;
	}

	public List<Component> menu()
	{
		MyButton play = new MyButton("play", this);
		MyButton option = new MyButton("option", this);
		MyButton exit = new MyButton("exit", this);
		
		
	
		List<Component> comps = new ArrayList<>();
				
		comps.add(play);
		comps.add(option);
		comps.add(exit);
		
		for(Component c : comps)
			frame.add(c);
		play.eventID(2, null);
		option.eventID(1, comps);
		exit.eventID(0, null);
		return comps;
	}

	public void userOptions() {
		// TODO Auto-generated method stub

	}
	
	public void closeFrame(List<Component> comp)
	{
		for(Component c : comp)
			frame.remove(c);
	}
}

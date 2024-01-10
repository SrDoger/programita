package programita;

public class Variables {
	private boolean rgb;
	private int timer;

	public Variables() {
		this.rgb = true;
		this.setTimer(1);
	}

	public boolean getRGB() {
		return this.rgb;
	}

	public void setRGB(boolean rgb) {
		this.rgb = rgb;
	}

	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}

}

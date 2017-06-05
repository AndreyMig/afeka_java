package enignes;

public class AnMiEngine {

	private int speed = 0;

	public void speedUp() {
		speed++;
	}

	public void slowDown() {
		speed--;
	}

	@Override
	public String toString() {
		return "current speed: " + speed;
	}

}

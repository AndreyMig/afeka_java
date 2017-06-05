package enignes;

public class AnMiEngine {

	private int speed = 0;

	public void speedUp(){
		speed++;
	}
	
	public void slowDown(){
		speed--;
	}

	
	public String toString() {
		return "Current speed: " + speed;
	}
	
	
	
	
}

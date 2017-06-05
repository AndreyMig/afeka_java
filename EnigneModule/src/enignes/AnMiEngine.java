package enignes;

public class AnMiEngine {

	private int speed = 0;
	
	
	public void incSpeed(){
		
		speed = speed*2;
		
	}
	
	public void decSpeed(){
		
		speed = speed/2;
		
	}
	
	
	@Override
	public String toString() {
		return "current speed: " + speed;
	}
	
}

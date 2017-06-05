
public class RoBaEngine {
	
	private int speed = 0;

	public void speedup(int speedUp) {
		speed += speedUp;
	}
	
	public void speeddown(int speedDown){
		speed -= speedDown ;
	}
	
	@@Override
	public  String toString (){
		return "the speed is " + speed ;
	}
}

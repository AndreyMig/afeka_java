package enignes;

public class LiKaEngine {
	
	private int speed;
	
	public LiKaEngine (int speed){
		this.speed=speed;
	}
	
	public void enhanceSpeed(){
		this.speed++;
	}
	public void minusSpeed(){
		this.speed-=2;
	}
	public String toString(){
		return ("current speed" + speed);
	}
	
	
	

}

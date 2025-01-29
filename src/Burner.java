
public class Burner {

	private final static int TIME_DURATION = 2;

	private int timer;
	private Settings mySetting;
	
	private Temperature myTemperature;
	
	Temperature getTemperature() {
		return myTemperature;
	}
	
	public enum Temperature{BLAZING, HOT, COLD, WARM;};
	
	public Burner(){
		super();
		mySetting = Settings.OFF;
		myTemperature = Temperature.COLD;
	}
	
	public void plusButton() {
		switch(mySetting){
			case OFF:
				mySetting = Settings.LOW;
				break;
				
			case LOW:
				mySetting = Settings.MEDIUM;
				break;
				
			case MEDIUM:
				
				
				
			
			default:
				
				break;
			
		}
		
		
		
		
	}
	
	public void minusButton() {
		
	}
	
	public void updateTemperature() {
		
	}
	
	
}

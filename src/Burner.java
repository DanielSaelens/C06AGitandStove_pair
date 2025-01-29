
public class Burner {

	private final static int TIME_DURATION = 2;

	private int timer;
	private Settings mySetting;
	
	private Temperature myTemperature;
	
	public Temperature getTemperature() {
		return myTemperature;
	}
	
	public enum Temperature{COLD, WARM, HOT, BLAZING};
	
	public Burner(){
		super();
		mySetting = Settings.OFF;
		myTemperature = Temperature.COLD;
		this.timer = 0;
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
				mySetting = Settings.HIGH;
				break;		
								
			default:
				
				break;
			
		}		
	}
	
	public void minusButton() {
		switch(mySetting){
		case HIGH:
			this.mySetting = Settings.MEDIUM;
			break;
			
		case MEDIUM:
			this.mySetting = Settings.LOW;
			break;
			
		case LOW:
			this.mySetting = Settings.OFF;
			break;		
							
		default:
			break;
		}
	}
	
	public void updateTemperature() {
		
		if(timer == 0) {
			this.timer = TIME_DURATION;
						
			switch(mySetting) {
				case HIGH:
					if(myTemperature != Temperature.BLAZING) {
						this.myTemperature = Burner.Temperature.BLAZING; 
					}
					break;
					
				case MEDIUM:
					if(myTemperature != Temperature.HOT) {
						this.myTemperature = Burner.Temperature.HOT;
					}

					break;
					
				case LOW:
					if(myTemperature != Temperature.WARM) {
						this.myTemperature = Burner.Temperature.WARM;
					}
					break;		
							
				case OFF:
					if(myTemperature != Temperature.COLD) {
						this.myTemperature = Burner.Temperature.COLD;

						break;
					}
				default:
					break;
			
			}
		}
		else {
			this.timer--;
		}
		
		
	}
	
	public void display() {
		
		switch(myTemperature) {
			case COLD:
				System.out.println("[" + mySetting.toString() + "].....cooool");
				break;
				
			case WARM:
				System.out.println("[" + mySetting.toString() + "]....warm");
				break;
				
			case HOT:
				System.out.println("[" + mySetting.toString() + "].... CAREFUL");
				break;
				
			case BLAZING:
				 System.out.println("[" + mySetting.toString() + "].... VERY HOT! DON'T TOUCH");
				 break;
				
			default:
				break;
	}
	
}
}

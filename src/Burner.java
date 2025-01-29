
public class Burner {

	private final static int TIME_DURATION = 2;

	private int timer;
	private Settings mySetting;
	
	private Temperature myTemperature;
	
	Temperature getTemperature() {
		return myTemperature;
	}
	
	public enum Temperature{COLD, WARM, HOT, BLAZING;};
	
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
					if(myTemperature.ordinal() < Temperature.BLAZING.ordinal()) {
						int ord = 1 + myTemperature.ordinal();
						this.myTemperature = Burner.Temperature.values()[ord]; 
					}
					break;
					
				case MEDIUM:
					if(myTemperature.ordinal() < Temperature.HOT.ordinal()) {
						int ord = 1 + myTemperature.ordinal();
						this.myTemperature = Burner.Temperature.values()[ord];
					}
					break;
					
				case LOW:
					if(myTemperature.ordinal() < Temperature.WARM.ordinal()) {
						int ord = 1 + myTemperature.ordinal();
						this.myTemperature = Burner.Temperature.values()[ord]; 
					}
					break;		
									
				default:
					break;
			
			}
		}
		else {
			this.timer--;
		}
		
		
	}
	
	public void display() {
		
		switch(mySetting) {
			case OFF:
				System.out.println("[" + mySetting.toString() + "].....cooool");
				break;
				
			case LOW:
				System.out.println("[" + mySetting.toString() + "]....warm");
				break;
				
			case MEDIUM:
				System.out.println("[" + mySetting.toString() + "].... CAREFUL");
				break;
				
				case HIGH:
				 System.out.println("[" + mySetting.toString() + "].... VERY HOT! DON'T TOUCH");
					break;
				
			default:
				break;
	}
	
}
}

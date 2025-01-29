

public enum Settings {
	
	OFF ("---"), LOW ("--+"), MEDIUM("-++"), HIGH ("+++");
	
	private String value;
	
	Settings(String value){
		this.value = value;
	}
	
	public String toString(){
		return value;
		
	}

}

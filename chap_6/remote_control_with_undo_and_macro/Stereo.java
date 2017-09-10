public class Stereo{
	private String location;
	private double volume;
	
	public Stereo(String location){
		this.location = location;
	};

	public void on(){
		System.out.println(location + " Stereo is on.");
	}

	public void off(){
		System.out.println(location + " Stereo is off.");
	}

	public void setCD(){
		System.out.println(location + " Stereo is playing CD.");		
	}

	public void setDvd(){
		System.out.println(location + " Stereo is playing DVD.");		
	}

	public void setRadio(){
		System.out.println(location + " Stereo is playing Radio.");		
	}

	public void setVolume(int volume){
		this.volume = volume;
		System.out.println(location + " Stereo volume set to " + volume);		
	}

}
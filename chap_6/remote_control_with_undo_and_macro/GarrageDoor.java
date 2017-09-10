public class GarrageDoor{
	private String location;

	public GarrageDoor(String location){
		this.location = location;
	}
	public void up(){
		System.out.println("Garrage Door is Open");
	}
	public void down(){
		System.out.println("Garrage Door is Closed");
	}
	public void stop(){
		System.out.println("Garrage Door is stopped");
	}
	public void lightOn(){
		System.out.println("Garrage Door's light is on");
	}
	public void lightOff(){
		System.out.println("Garrage Door's light is off");
	}
}
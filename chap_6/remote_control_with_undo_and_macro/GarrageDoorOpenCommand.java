public class GarrageDoorOpenCommand implements Command{
	private GarrageDoor garrageDoor;
	public GarrageDoorOpenCommand(GarrageDoor garrageDoor){
		this.garrageDoor = garrageDoor;
	}
	public void execute(){
		garrageDoor.up();
	}
	public void undo(){
		garrageDoor.down();
	}
} 
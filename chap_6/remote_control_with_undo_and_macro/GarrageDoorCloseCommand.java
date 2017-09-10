public class GarrageDoorCloseCommand implements Command{
	private GarrageDoor garrageDoor;
	public GarrageDoorCloseCommand(GarrageDoor garrageDoor){
		this.garrageDoor = garrageDoor;
	}
	public void execute(){
		garrageDoor.down();
	}
	public void undo(){
		garrageDoor.up();
	}
} 
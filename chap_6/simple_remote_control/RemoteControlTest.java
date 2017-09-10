public class RemoteControlTest{
	public static void main(String [] args){
		SimpleRemoteControl remote  = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarrageDoor garrageDoor = new GarrageDoor();
		GarrageDoorOpenCommand garrageOpen = new GarrageDoorOpenCommand(garrageDoor);

		remote.setCommand(lightOn);
		remote.buttonWasPressed();

		remote.setCommand(garrageOpen);
		remote.buttonWasPressed();
	}
}
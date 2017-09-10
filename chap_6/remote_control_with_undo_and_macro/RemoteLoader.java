public class RemoteLoader{
	public static void main(String [] args){
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		GarrageDoor garrageDoor = new GarrageDoor("");
		Stereo stereo = new Stereo("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
	
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);


		System.out.println("\n ==== PART I ====\n");

		System.out.println(remoteControl);

		remoteControl.onButtonWasPressed(0);
		remoteControl.offButtonWasPressed(0);
		remoteControl.onButtonWasPressed(1);
		remoteControl.offButtonWasPressed(1);
		remoteControl.onButtonWasPressed(2);
		remoteControl.offButtonWasPressed(2);
		remoteControl.onButtonWasPressed(3);
		remoteControl.offButtonWasPressed(3);

		// with undo
		System.out.println("\n ==== PART II ====\n");

		remoteControl.onButtonWasPressed(0);
		remoteControl.offButtonWasPressed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPressed();

		remoteControl.offButtonWasPressed(0);
		remoteControl.onButtonWasPressed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPressed();		

		System.out.println("\n ==== PART III ====\n");

		Command [] partyOn = {livingRoomLightOn, stereoOnWithCD, kitchenLightOn};
		Command [] partyOff = {livingRoomLightOff, stereoOff, kitchenLightOff};
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		remoteControl.setCommand(5, partyOnMacro, partyOffMacro);

		System.out.println(remoteControl);
		System.out.println("--- Pusing Macro On");
		remoteControl.onButtonWasPressed(5);
		System.out.println("--- Pusing Macro Off");
		remoteControl.offButtonWasPressed(5);
		System.out.println("--- undo");
		remoteControl.undoButtonWasPressed();



	}
}




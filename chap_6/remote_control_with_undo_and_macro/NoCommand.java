public class NoCommand implements Command{
	public NoCommand(){}
	public void execute(){
		System.out.println("no command");
	}
	public void undo(){
		System.out.println("no command (undo)");	
	}
}
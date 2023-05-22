
public class CommandMain {

	public static void main(String[] args) {
		CommandThread CThread=new CommandThread(args);
		CThread.start();

	}

}

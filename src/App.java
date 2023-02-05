
public class App {

	public static void main(String[] args) {
		Logger asterisk = new AsteriskLogger();
		asterisk.Log("This is the info.");
		asterisk.Error("This is my error.");
		
		System.out.println();

		Logger spaced = new SpacedLogger();
		spaced.Log("This is the info.");
		spaced.Error("This is my error.");
	}

}


public class AsteriskLogger implements Logger{

	public void Log(String info) {
		System.out.println("***" + info + "***");
	}

	public void Error(String error) {
		System.out.println();
		for(int i=0; i<error.length()+13; i++)
			System.out.print("*");
		System.out.println("\n***Error: "+ error + "***");
		for(int i=0; i<error.length()+13; i++)
			System.out.print("*");
		System.out.println();
	}

}

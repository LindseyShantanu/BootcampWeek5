
public class SpacedLogger implements Logger{

	public void Log(String info) {
		for(int i=0; i<info.length();i++) {
			System.out.print(info.charAt(i)+" ");
		}
		System.out.println();
	}

	public void Error(String error) {
		System.out.print("ERROR:");
		for(int i=0; i<error.length();i++) {
			System.out.print(error.charAt(i)+" ");
		}
		System.out.println();
	}



}

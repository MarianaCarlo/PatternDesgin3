package exercise_Without_Bridge;

public class Client {

	public static void main(String[] args) {
		Linux linux1 = new Linux7x64();
		linux1.usarSO();
		
		Windows windows = new Windows7x86();
		windows.usarSO();
		
		MacOs macos = new MacOs7x64();
		macos.usarSO();
		

	}

}

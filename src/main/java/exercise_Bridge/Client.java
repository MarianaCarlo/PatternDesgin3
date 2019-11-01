package exercise_Bridge;

public class Client {

	public static void main(String[] args) {
		ArquitecturaX64 arquitecturaX64 = new ArquitecturaX64();
		Linux linux = new Linux(arquitecturaX64);
		
		linux.usarSO();
		
		ArquitecturaX86 arquitecturaX86 = new ArquitecturaX86();
		MacOs macos = new MacOs(arquitecturaX86);
		
		macos.usarSO();

	}

}

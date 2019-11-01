package example_Visitor;

public class Client {

	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante();
		Director director = new Director();

		Matriculacion visitor = new Matriculacion();

		System.out.println("Result A: " + estudiante.accept(visitor));
		System.out.println("Result B: " + director.accept(visitor));

		PagarMatricula matricula = new PagarMatricula();

		System.out.println("Pagar: " + estudiante.accept(matricula));
		System.out.println("Pagar: " + director.accept(matricula));

	}

}

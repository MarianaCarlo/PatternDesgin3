package example_Adapter;

public class Client {

	public static void main(String[] args) {
		
		Estudiante estudiante = new Estudiante();
		Director director = new Director();
		Secretaria secretaria = new Secretaria();
		Docente docente = new Docente();
		Seguridad seguridad = new Seguridad();
				

		AdaptadorDocente adapterDocente = new AdaptadorDocente(docente);
		AdaptadorSeguridad adapterSeguridad = new AdaptadorSeguridad(seguridad);
		
		estudiante.setEdad(50);
		director.setEdad(45);
		secretaria.setEdad(40);
		docente.setNacimiento(1990);
		seguridad.setNacimiento(1940);
		
		IPersona[] todos = {estudiante,director,secretaria,adapterDocente,adapterSeguridad};
		for (IPersona personas : todos) {
			System.out.println("Edad: " + personas.getEdad());
		}
		int[] ejem = {estudiante.getEdad(),director.getEdad()};
		int oo = 0;
		for (int i = 0; i < ejem.length; i++) {
			oo +=ejem[i];
			
		}
		System.out.println("total: "+oo);

	}

}

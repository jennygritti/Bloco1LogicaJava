package IntroPoo;

public class PacienteTeste {
	public static void main(String[]args) {
		Paciente p1 = new Paciente ();
		Paciente p2 = new Paciente ();
		Paciente p3 = new Paciente ();
		
		p1.ler("Julia", "Dor de cabeça", 3);
		p2.ler("Samira", "Enjoo", 2);
		p3.ler("Filipa", "Pressão Baixa", 1);
		
		p1.mostrar();
		p2.mostrar();
		p3.mostrar();
	}

}

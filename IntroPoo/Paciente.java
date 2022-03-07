package IntroPoo;

public class Paciente {
	String nome;
	String sintoma;
	int nivel;
	
	public void ler (String nome, String sintoma, int nivel) {
		this.nome = nome;
		this.sintoma = sintoma;
		this.nivel = nivel;
	}
	
	public void mostrar() {
		System.out.println("-------------------------");
		System.out.println("Nome: "+nome);
		System.out.println("Sintomas: "+sintoma);
		System.out.println("GRAU DE URGENCIA");
		System.out.println("1 Alto | 2 Médio | 3 Baixo");
		System.out.println("Grau de urgencia: "+nivel);
	}

	

}

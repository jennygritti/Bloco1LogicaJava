package IntroPoo;

public class Funcionario {
	
	String nome;
	String funcao;
	double salario;
	
	public void ler (String nome, String funcao, double salario) {
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
	}
	
	public void mostrar() {
		System.out.println("-------------------------");
		System.out.println("Nome: "+nome);
		System.out.println("Funcao: "+funcao);
		System.out.println("Salario: "+salario);
	}

}

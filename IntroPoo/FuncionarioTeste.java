package IntroPoo;

public class FuncionarioTeste {
	public static void main(String[]args) {
		Funcionario f1 = new Funcionario ();
		Funcionario f2 = new Funcionario ();
		Funcionario f3 = new Funcionario ();
		
		f1.ler("Alberta", "Dev. Junior", 4000);
		f2.ler("Joana", "Dev. Senior", 8000);
		f3.ler("Sami", "Gerente de Projeto", 6000);
		
		f1.mostrar();
		f2.mostrar();
		f3.mostrar();
	}
	
	

}

package IntroPoo;

public class Cliente {
	
	//Atributos
	
	String nome;
	int idade;
	
	public Cliente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//Método
	public void cadastro()
	{
		if(this.idade<18)
			System.out.println("Não é possível cadastrar, pois cliente menor de 18 anos");
		else
			System.out.println("Cliente Cadastrado");
	}
	

}

package IntroPoo;

public class ClienteTeste {
	public static void main(String[]args) {
		Cliente c1 = new Cliente("Luis Fernando", 18);
		Cliente c2 = new Cliente("Maria", 16);
		
		c1.cadastro();
		System.out.println("Nome do cliente: "+ c1.nome + " e Idade: " +c1.idade);
		
		c2.cadastro();
		System.out.println("Nome do cliente: "+ c2.nome + " e Idade: " +c2.idade);
		
	}

}

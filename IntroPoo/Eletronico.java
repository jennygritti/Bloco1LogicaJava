package IntroPoo;

public class Eletronico {
	
	String nome;
	double preco;
	int estoque;
	
	public Eletronico (String nome, int estoque, double preco) {
		this.nome = nome;
		this.estoque = estoque;
		this.preco = preco;
	}
		
	public void prodEstoque() {
		if(this.estoque <= 0) {
			System.out.println("Produto indisponível");
		}else{
			System.out.println("Produto disponível");
		}
	}
}

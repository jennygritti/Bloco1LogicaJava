package IntroPoo;

public class EletronicoTeste {
	public static void main(String[]args) {
		Eletronico e1 = new Eletronico("Capa de Celular", 2, 18);
		Eletronico e2 = new Eletronico("Ring Light", 0, 200);
		Eletronico e3 = new Eletronico("Carregador portátil", 4, 110);
		
		System.out.println("Produto: " + e1.nome + "\tValor: " + e1.preco);
		e1.prodEstoque();
		System.out.println("Quantidade em estoque: " + e1.estoque);
		
		System.out.println("\nProduto: " + e2.nome + "\tValor: " + e2.preco);
		e2.prodEstoque();
		System.out.println("Quantidade em estoque: " + e2.estoque);
		
		System.out.println("\nProduto: " + e3.nome + "\tValor: " + e3.preco);
		e3.prodEstoque();
		System.out.println("Quantidade em estoque: " + e3.estoque);
			
	}
}

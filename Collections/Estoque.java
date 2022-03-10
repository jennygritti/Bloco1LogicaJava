package Collections;

public class Estoque {
	
		private String produtos;
		private int quantidade;
		
		public Estoque(String x, int y) {
			this.produtos=x;
			this.quantidade=y;
		}

		public String getProdutos() {
			return produtos;
		}

		public void setProdutos(String produtos) {
			this.produtos = produtos;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public String toString() {
			return "ITEM: "+this.produtos+", QUANTIDADE: "+this.quantidade;
		}
}

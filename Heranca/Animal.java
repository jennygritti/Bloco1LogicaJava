package Heranca;

public class Animal {
	
	//Atributo
	
		private String tipo;	
		private String nome;
		private int idade;
		
		public void emitirSom () {
			System.out.println("Som do animal");
		}
		
		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		


}

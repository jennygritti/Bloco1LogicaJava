package Collections;

import java.util.ArrayList;

public class EstoqueTeste {

	public static void main(String[] args) {
		
		Estoque e1 = new Estoque("Jaqueta",3);
		Estoque e2 = new Estoque("Vestido",5);
		Estoque e3 = new Estoque("Cinto",2);
		
		ArrayList<Estoque> estoque = new ArrayList<>();
		
		estoque.add(e1);
		estoque.add(e2);
		estoque.add(e2);
		System.out.println(estoque);
		
		estoque.remove(2);
		System.out.println(estoque);

	}

}

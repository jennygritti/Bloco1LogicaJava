package IntroPoo;

public class AviaoTeste {
	public static void main(String[]args) {
		Aviao a1 = new Aviao ();
		Aviao a2 = new Aviao ();
		
		a1.companhia="Gol";
		a1.vel=160;
		a1.acelerar(10);
		a1.decolagem();
		
		System.out.println("Velocidade: " + a1.vel + "km/h");
		
		a2.companhia="Airline";
		a2.vel=160;
		a2.acelerar(-60);
		a2.decolagem();
		
		System.out.println("Velocidade: " + a2.vel + "km/h");
	}
}

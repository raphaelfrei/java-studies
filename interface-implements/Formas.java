package uscs4;

public class Formas {
	
	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado(10);
		Circulo circulo = new Circulo(10);
		
		System.out.println("A area do quadrado e: " + quadrado.area() + "\n" + 
							" O comprimento e: " + quadrado.comprimento());
		
		System.out.println("A area do circulo e: " + circulo.area() + "\n" + 
				" O circulo e: " + circulo.comprimento());
		
	}
}

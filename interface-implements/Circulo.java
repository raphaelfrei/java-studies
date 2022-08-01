package uscs4;

public class Circulo implements FormaGeometrica {

	final static double pi = 3.1415;
	
	private double raio = 0;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double area() {
		return raio * raio * pi;
	}

	public double comprimento() {
		return 2 * pi * raio;
	}
	
}

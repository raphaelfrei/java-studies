package uscs4;

public class Quadrado implements FormaGeometrica {

	final static double pi = 3.1415;
	
	private double lado = 0;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double area() {
		return lado * lado;
	}

	public double comprimento() {
		return lado * 4;
	}

}

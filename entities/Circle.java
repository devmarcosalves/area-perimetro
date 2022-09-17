package entities;

public class Circle {
public double raio;
	
	public double area() {
		return 3.14 * (raio*raio);
	}
	public double perimetro() {
		return 2 * 3.14 * raio;
	}
}
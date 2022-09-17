package entities;

public class Triangle {
	public double altura;
	public double base;
	public double lado1;
	public double lado2;
	public double lado3;
	
	public double area() {
		return (altura * base) / 2;
	}
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}
}
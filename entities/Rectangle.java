package entities;

public class Rectangle {
	public double base;
    public double altura;
    
    public double area() {
        return base * altura;
    }
    public double perimetro() {
    	return 2 * (base * altura);
    }
}
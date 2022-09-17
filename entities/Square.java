package entities;

public class Square {
public double lado;
    
    public double area() {  
        return lado * lado;
    }
    public double perimetro() {
    	return lado * 4;
    }   
}
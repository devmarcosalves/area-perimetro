package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;
import entities.Circle;
import entities.Square;
import entities.Triangle;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    Rectangle rec = new Rectangle();
	    Circle cir = new Circle();
	    Square squ = new Square();
	    Triangle tri = new Triangle();
	    int opc;
	    do {
		    System.out.println("1.Rectangle 2.Circle\n3.Square 4.Triangle");
		    System.out.println("Digite o formato do terreno ou 0 para sair: ");
		    opc = sc.nextInt();
		    switch (opc) {
		    case 1:
		        System.out.println("Entre com altura:");
		        rec.altura = sc.nextDouble();
		        System.out.println("Entre com base:");
		        rec.base= sc.nextDouble();
		        break;
		    case 2:
		     	System.out.println("Entre com o raio:");
		        cir.raio = sc.nextDouble();
		        break;
		    case 3:
		        System.out.println("Entre com o lado:");
		        squ.lado = sc.nextDouble();
		        break;
		    case 4:
		       	System.out.println("Entre com a base:");
		        tri.base = sc.nextDouble();
		        System.out.println("Entre com a altura: ");
		        tri.altura = sc.nextDouble();
		       	System.out.println("Entre com lado 1:");
		        tri.lado1 = sc.nextDouble();
		        System.out.println("Entre com a lado 2:");
		        tri.lado2 = sc.nextDouble();
		        System.out.println("Entre com a lado 3:");
		        tri.lado3 = sc.nextDouble();
		        break;
		    case 0:
		       	System.out.println("Saindo...");
		       	break;
		    default:
		       	System.out.println("Opção inválida!!");
		       	break;
		    }
		    if(opc == 1) {
		        System.out.printf("Área do Retângulo = %.2f%n", rec.area());
		        System.out.printf("Perímetro do Retângulo = %.2f%n", rec.perimetro());
		    }else if(opc == 2) {
		       	System.out.printf("Área do Círculo = %.2f%n", cir.area());
		       	System.out.printf("Perímetro do Círculo = %.2f%n", cir.perimetro());
		    }else if(opc == 3) {
		       	System.out.printf("Área do Quadrado = %.2f%n", squ.area());
		       	System.out.printf("Perímetro do Quadrado = %.2f%n", squ.perimetro());
		    }else if(opc == 4) {
		      	System.out.printf("Área do Triângulo = %.2f%n", tri.area());
		       	System.out.printf("Perímetro do Triângulo = %.2f%n", tri.perimetro());
		    }
		    System.out.print("\n");
	    }while(opc!=0);
	    sc.close();
	}
} 
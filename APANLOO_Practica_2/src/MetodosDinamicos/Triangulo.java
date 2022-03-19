package MetodosDinamicos;

public class Triangulo extends Figura {
	
	public Triangulo(double dim1, double dim2) {
		super(dim1, dim2);
	}
	
	public void area() {
		
		double area= 0.5*dim1*dim2;
		
		System.out.println("El area del triangulo es: \nA = 1/2 * base * altura = " + "1/2 * " + dim1 + " * " + dim2 + " = " + area);
	}
}

package MetodosDinamicos;

public class Rectangulo extends Figura{
	
	public Rectangulo(double dim1, double dim2) {
		super(dim1, dim2);
	}
	
	public void area() {
		 
		double area= dim1*dim2;
		
		System.out.println("El area del rectangulo es: \nA = base * altura = " + dim1 + " * " + dim2 + " = " + area);
	}
}

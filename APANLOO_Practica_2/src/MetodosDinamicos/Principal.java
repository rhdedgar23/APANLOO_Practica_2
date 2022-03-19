package MetodosDinamicos;

public class Principal {

	public static void main(String[] args) {
		
		Figura fig= new Figura(18, 12);
		Rectangulo rec= new Rectangulo(2,3);
		Triangulo tri= new Triangulo(23,64);
		
		Figura referencia;
		
		referencia=fig;
		fig.area();
		
		referencia=rec;
		rec.area();
		
		referencia=tri;
		tri.area();
		
		//si ahora probamos la seleccion dinamica con una variable del tipo de alguna subclase (Rectangulo o Triangulo), vemos que:
		
		Rectangulo referencia2;
		
		referencia2=fig;
		fig.area();
		
		referencia2=rec;
		rec.area();
		
		referencia2=tri;
		tri.area();
		
		//nos arroja varios errores:
		//al asignar referencia2=fig e intentar hacer el llamado fig.area() nos arroja el error "Type mismatch: cannot convert from Figura to Rectangulo"
		//de igual manera, 
		//al asignar referencia2=tri e intentar hacer el llamado fig.area() nos arroja el error "Type mismatch: cannot convert from Triangulo to Rectangulo"
	}
}

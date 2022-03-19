package SobreescrituraDeMetodos;

public class Principal {

	public static void main(String[] args) {
		
		B obj1= new B(23, 18, 12);
		
		obj1.show();//se invoca al metodo show() de la clase B
		
		//Dado que no podemos accesar el metodo show() de la clase A desde una instancia de la clase B, 
		//la unica forma de accesar dicho metodo es mediante una instancia de la clase A:
		
		A obj2= new A(32, 46);
		obj2.show();
		
		//si queremos ejecutar:
		//obj1.super.show();
		//nos arroja el error: "obj1 cannot be resolved to a type"              
	}
}

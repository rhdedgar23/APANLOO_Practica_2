package SobrecargaDeMetodos;

public class Principal {

	public static void main(String[] args) {
		
		OverloadDemo obj1= new OverloadDemo();
		
		obj1.test();
		obj1.test(2, 3);
		obj1.test(23.1812);
		obj1.test(1, 8);
		
		double i=23;
		
		obj1.test(i);
		//No hay un metodo sobrecargado que reciba solo un entero. Pero tampoco existe un error al hacer la llamada a dicho metodo inexistente. 
		//El metodo sobrecargado que se ejecuta es el metodo sobrecargado de la clase OverloadDemo que mas se parece al que intentamos llamar.
		
		//Si ahora invertimos lo tipos datos para:
		//void test(double a) ---> void test(int a)
		//int i ---> double i
		//nos arroja un error: "The method test(int) in the type OverloadDemo is not applicable for the arguments (double)"
		
		//A grandes razgos, no hay diferencias aparentes entre la sobrecarga de metodos y de constructores. Claro esta que los constructores
		// se usan para inicializar una instancia de alguna clase mientras que los metodos son procedimiento o funciones de dicha clase. 
		//Pero en ambos tiene que coindicir el tipo de argumento pasado en la creacion del metodo o constructor con la llamada 
		//a dicho metodo o constructor (inializacion de instancia)
	}
}

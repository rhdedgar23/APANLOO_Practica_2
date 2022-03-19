package SobrecargaDeMetodos;

public class OverloadDemo {
	
	public void test() {
		System.out.println("Este es el metodo test(): \nVacio");
	}
	
	public void test(int a) {
		System.out.println("Este es el metodo test(double): \nDouble a: " + a);
	}
	
	public void test(int a, int b) {
		System.out.println("Este es el metodo test(int a, int b): \nInt a: " + a + "\nInt b: " + b);
	}
}

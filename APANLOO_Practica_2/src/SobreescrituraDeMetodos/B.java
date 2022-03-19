package SobreescrituraDeMetodos;

public class B extends A {
	
	int k;
	
	public B(int i, int j, int k) {
		super(i, j);
		this.k= k;
	}
	
	public void show() {
		
		System.out.println("i= " + i + "\nj= " + j + "\nk= " + k);
	}
}

package Herencia;

public class Terrestre extends MediosDeTransporte {
	 
	private int ruedas;
	 
	 public Terrestre() {
		 super();
		 this.ruedas= 0;
	 }
	 
	 public Terrestre(String alcance, double precio, int ruedas) {
		 super(alcance, precio);
		 this.ruedas= ruedas;
	 }
	 
	 public int getRuedas() {
		 return ruedas;
	 }
}

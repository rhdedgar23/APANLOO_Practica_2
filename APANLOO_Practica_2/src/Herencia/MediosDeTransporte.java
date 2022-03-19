package Herencia;
 
public class MediosDeTransporte {
	
	private String alcance;
	private double precio;
	
	public MediosDeTransporte() {
		this.alcance= "";
		this.precio= 0;
	}
	
	public MediosDeTransporte(String alcance, double precio) {
		this.alcance= alcance;
		this.precio= precio;
	}
	
	public String getAlcance() {
		return alcance;
	}
	
	public double getPrecio() {
		return precio;
	}
}

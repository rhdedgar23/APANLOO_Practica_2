package Herencia;

public class Bicicleta extends Terrestre {
	
	private String tipo;
	
	public Bicicleta() {
		super();
		this.tipo= " ";
	}
	
	public Bicicleta(String alcance, double precio, int ruedas, String tipo) {
		super(alcance, precio, ruedas);
		this.tipo= tipo;
	}
	
	public String getInformacion() {
		 
		String info= "Informacion de la bicicleta: " +
				 "\nAlcance: " + getAlcance() + 
				 "\nPrecio: " + "$" + Double.toString(getPrecio()) + 
				 "\nRuedas: " + Integer.toString(getRuedas()) + 
				 "\nTipo: " + tipo;  
		
		 return info;
	}
}

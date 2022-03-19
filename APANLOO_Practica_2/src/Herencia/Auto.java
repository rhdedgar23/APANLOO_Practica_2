package Herencia;

public class Auto  extends Terrestre{
	
	private String tipo;
	
	public Auto() {
		super();
		this.tipo= " ";
	}
	
	public Auto(String alcance, double precio, int ruedas, String tipo) {
		super(alcance, precio, ruedas);
		this.tipo= tipo;
	}
	
	public String getInformacion() {
		 
		String info= "Informacion del auto: " +
				 "\nAlcance: " + getAlcance() + 
				 "\nPrecio: " + "$" + Double.toString(getPrecio()) + 
				 "\nRuedas: " + Integer.toString(getRuedas()) + 
				 "\nTipo: " + tipo;  
		
		 return info;
	}
}

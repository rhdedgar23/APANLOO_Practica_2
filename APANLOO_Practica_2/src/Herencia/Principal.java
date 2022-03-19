package Herencia;

public class Principal {

	public static void main(String[] args) {
		
		Bicicleta bici= new Bicicleta("Personal", 15000.00, 2, "bmx");
		Auto auto= new Auto("Masivo", 200000.00, 4, "compacto");
		
		System.out.println(bici.getInformacion() + "\n");
		System.out.println(auto.getInformacion() + "\n");
		
		Terrestre medio3= new Terrestre("Personal", 10000.00, 2);
		MediosDeTransporte medio4= new MediosDeTransporte("Masivo", 625000.00);
		
		System.out.println("Informacion del medio de transporte 3: " + 
				"\nAlcance: " + medio3.getAlcance() +
				"\nPrecio: " + "$" + medio3.getPrecio() +
				"\nRuedas: " + medio3.getRuedas());
		System.out.println("\nInformacion del medio de transporte 4: " + 
				"\nAlcance: " + medio4.getAlcance() +
				"\nPrecio: " + "$" + medio4.getPrecio());
	}
}

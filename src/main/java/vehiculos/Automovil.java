package vehiculos;


public class Automovil extends Vehiculo {
	int puestos;
	static int totalAuto;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fab, int puestos) {
		super(placa, 4,100, nombre, precio, peso, "FWD", fab);
		this.puestos = puestos;
		
		totalAuto++;
	}
	
		
	public int getTotalAuto() {
		return totalAuto;
	}
}


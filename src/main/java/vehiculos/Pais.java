package vehiculos;

import java.util.ArrayList;

public class Pais {
	String nombre;
	static ArrayList<Pais> paises = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
		
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public static Pais paisMasVendedor() {
		int cantMayor = 0;
		Pais paisMayor = null;
		
		for(Pais pais: paises) {
			int cant = 0;
			for(Vehiculo veh:Vehiculo.vehiculos ) {
				if(veh.fabricante.pais.equals(pais)) {
					cant++;
					
				}
			}
			if(cant > cantMayor) {
				cantMayor = cant;
				paisMayor = pais;
			}
		}
		return paisMayor;
	}

}

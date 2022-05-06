package vehiculos;

import java.util.ArrayList;

public class Fabricante extends Vehiculo{
	String nombre;
	Pais pais;
	static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nom, Pais pais) {
		this.nombre = nom;
		this.pais = pais;
		fabricantes.add(this);
	}
	
	public static Fabricante fabricaMayorVentas() {
		int cantMayor = 0;
		Fabricante fabri = null;
		
		for(Fabricante fabric: fabricantes) {
			int cant = 0;
			for(Vehiculo veh:Vehiculo.vehiculos ) {
				if(veh.fabricante.equals(fabric)) {
					cant++;
				}
			}
			if(cant > cantMayor) {
				cantMayor = cant;
				fabri = fabric;
			}
		}
		return fabri;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public Pais getPais() {
		return this.pais;
	}
}

package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	int precio;
	int peso;
	String traccion;
	Fabricante fabricante;
	static int cantVehiculos = 0;
	static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
	public Vehiculo() {
		//cantVehiculos++;
	}
	
	public Vehiculo(String placa,int puertas, int velocidad, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidad;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantVehiculos++;
		vehiculos.add(this);
	}
	
	public static int getCantidadVehiculos() {
		return cantVehiculos;
	}

	public static String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.totalAuto + "\n" +
			"Camionetas: " + Camioneta.totalCamioneta + "\n" +
			"Camiones: " + Camion.totalCamion;
	}

	public int getPuertas() {
		return this.puertas;
	}

	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}

	public String getTraccion() {
		return this.traccion;
	}

	public String getPlaca() {
		return this.placa;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getPrecio() {
		return this.precio;
	}

	public int getPeso() {
		return this.peso;
	}

	public static void setCantidadVehiculos(int cant) {
		cantVehiculos = cant;
		
	}
	
}

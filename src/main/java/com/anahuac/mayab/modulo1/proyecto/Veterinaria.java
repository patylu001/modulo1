package com.anahuac.mayab.modulo1.proyecto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Veterinaria {
	private String nombre;
	private ArrayList<CartillaPerro> listaPacientes = new ArrayList<>();
	

	public Veterinaria(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Servicio realizarServicio(String tipo, String fecha, String nombre) throws Exception {
		Servicio servicio = null;
		
		if(tipo == "baño" || tipo == "corte") {
			servicio = new ServicioEstetico(tipo, 250, fecha, "encargadoEstetica");
		}
		else if(tipo.startsWith ("vacuna") || tipo == "consulta") {
			servicio = new ServicioEstetico(tipo, 500, fecha, "encargadoEstetica");
	}else {
		throw new Exception("No existe ese servicio");
		
	}
		return servicio;
	
}
	
	public void agregarPaciente(CartillaPerro cartilla) {
		listaPacientes.add(cartilla);
	}
	
	public void imprimirExpedientes() {
		
		String nombreArchivo = nombre+".txt";
		FileWriter archivo;
	
		for(CartillaPerro c: listaPacientes) {
			try
			{
				archivo = new FileWriter(nombreArchivo);
		        PrintWriter pw = new PrintWriter(archivo);
		        
		        pw.print("--- Datos Perro ---\n");
		        
		} catch (IOException e) {
	    	System.out.println("Hubo un problema al crear el archivo: "+ nombreArchivo);
	        e.printStackTrace();
		}
		}
	}
}
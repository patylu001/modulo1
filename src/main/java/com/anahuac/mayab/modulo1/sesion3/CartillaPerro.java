package com.anahuac.mayab.modulo1.sesion3;

import java.util.ArrayList;
import java.util.HashMap;

public class CartillaPerro {
	
	
	//Atributos
	private Perro datosPerro;
	private String idCartilla;
	HashMap<String, ArrayList<String>> vacunas;
	
	//Constructor
	
	public CartillaPerro() {}
	
	public CartillaPerro(Perro datosPerro, String idCartilla) {
		super();
		this.datosPerro = datosPerro;
		this.idCartilla = idCartilla;
	}
	
	//Getters y Setters
	public Perro getDatosPerro() {
		return datosPerro;
	}
	public void setDatosPerro(Perro datosPerro) {
		this.datosPerro = datosPerro;
	}
	public String getIdCartilla() {
		return idCartilla;
	}
	public void setIdCartilla(String idCartilla) {
		this.idCartilla = idCartilla;
	}
	public HashMap<String, ArrayList<String>> getVacunas() {
		return vacunas;
	}
	public void setVacunas(HashMap<String, ArrayList<String>> vacunas) {
		this.vacunas = vacunas;
	}
	
	public void actualizar(String nombreVacuna, String fechaAplicacion){
		//Revisar si la vacuna existe en la cartilla 
		if (vacunas.containsKey(nombreVacuna)) {
			ArrayList<String> fechas = vacunas.get(nombreVacuna);
			fechas.add(fechaAplicacion);
			vacunas.put(nombreVacuna, fechas);
		}else { //No existe 
			ArrayList<String> fechas = new ArrayList<>();
			fechas.add(fechaAplicacion);
			vacunas.put(nombreVacuna, fechas);
		}
		
		
	}

}

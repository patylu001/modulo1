package com.anahuac.mayab.modulo1.proyecto;

public abstract class Servicio {
	
	private String tipo;
	private double costo;
	private String fecha;
	private String encargado;
	private CartillaPerro cartilla;
	
	public Servicio(String tipo, double costo, String fecha, String encargado) {
		super();
		this.tipo = tipo;
		this.costo = costo;
		this.fecha = fecha;
		this.encargado = encargado;
	}
	
	
	public CartillaPerro getCartilla() {
		return cartilla;
	}

	public void setCartilla(CartillaPerro cartilla) {
		this.cartilla = cartilla;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getEncargado() {
		return encargado;
	}
	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}
	
	public abstract void realizar(String nombre);

}

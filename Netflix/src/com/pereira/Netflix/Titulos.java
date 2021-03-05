package com.pereira.Netflix;

public class Titulos {
	private String titulo;
	private String genero;
	private String creador;
	private double duracion;
	private boolean visto;

	

	public Titulos (String titulo, String genero, String creador, double duracion, boolean visto) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
		this.visto = visto;
		
		
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public void mostrarTitulos() {
		System.out.println("Titulo :" + titulo);
		System.out.println("Genero :" + genero);
		System.out.println("Creador :" + creador);
		System.out.println("Vistas :" + visto);
		
	}
}



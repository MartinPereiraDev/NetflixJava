package com.pereira.Netflix;

public class Pelicula extends Titulos {
	int año;
	
	
	
	public Pelicula(String titulo,String genero, String creador, int año, double duracion) {
		super(titulo, genero, creador, duracion, false);
		
		this.año = año;
		
	}


	


	




	public int getAño() {
		return año;
	}


	public void setAño(int año) {
		this.año = año;
	}

}

	

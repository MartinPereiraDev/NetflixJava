package com.pereira.Netflix;

public class Pelicula extends Titulos {
	int a�o;
	
	
	
	public Pelicula(String titulo,String genero, String creador, int a�o, double duracion) {
		super(titulo, genero, creador, duracion, false);
		
		this.a�o = a�o;
		
	}


	


	




	public int getA�o() {
		return a�o;
	}


	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

}

	

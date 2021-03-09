package com.pereira.Netflix;

public class Series extends Titulos {

	
	int temporadas;
	
	

	
	public Series(String titulo,String genero, String creador, double duracion, int temporadas) {
		
		
		this.temporadas = temporadas;
		
		
	}

	

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	

	
	

}

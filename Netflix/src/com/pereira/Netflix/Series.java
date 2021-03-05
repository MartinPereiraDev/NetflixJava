package com.pereira.Netflix;

public class Series extends Titulos {

	
	int temporadas;
	
	

	
	public Series(String titulo,String genero, String creador, int temporadas, double duracion) {
		super(titulo, genero, creador, duracion);
		
		this.temporadas = temporadas;
		
		
	}

	

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}

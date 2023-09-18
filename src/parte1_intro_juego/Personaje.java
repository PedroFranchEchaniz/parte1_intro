package parte1_intro_juego;

import java.util.Arrays;

public class Personaje {

	String nombre;
	int vida;
	int score;
	String[] mochila = new String [10];
	
	public Personaje() {
		super();
	}

	public Personaje(String nombre, int vida, int score, String[] mochila) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.score = score;
		this.mochila = mochila;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String[] getMochila() {
		return mochila;
	}

	public void setMochila(String[] mochila) {
		this.mochila = mochila;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", vida=" + vida + ", score=" + score + ", mochila="
				+ Arrays.toString(mochila) + "]";
	}
	
	public String agregarPocion (String pocion) {
		String mensaje = "Poción agregada correctamente";
		for(String m : mochila) {
			if (m == null)
			m = pocion;
			else 
				mensaje= "YA NO PUEDES CONSEGUIR MÁS ELEMENTOS PUES TU MOCHILA ESTÁ COMPLETA";
		}
		return mensaje;
	}
	
	public void recibirGolpe (int golpe) {
		
	}
	
	
	
	
	
}

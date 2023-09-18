package parte1_intro_juego;

import java.util.Arrays;

public class Personaje {

	String nombre;
	int vida;
	int score;
	int puntosFuerza;
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

	
	public String toString() {
		return "Personaje [nombre=" + nombre + ", vida=" + vida + ", score=" + score + ", mochila="
				+ Arrays.toString(mochila) + "]";
	}
	
	public String agregarPocion (String botiquin) {
		String mensaje = "botiquin agregada correctamente";
		for(String m : mochila) {
			if (m.isEmpty())
			m = botiquin;
			else 
				mensaje= "YA NO PUEDES CONSEGUIR MÁS ELEMENTOS PUES TU MOCHILA ESTÁ COMPLETA";
		}
		return mensaje;
	}
	
	public void agregarPocion2 (String botiquin) {
		for (int i = 0; i<mochila.length; i++) {
			if(mochila[i].isEmpty()) {
				mochila[i]=botiquin;
			}else {
				System.out.println("La mochila esta llena");
			}
		}
	}
	
	public int recibirGolpe (int golpe) {
		vida -= golpe;
		return vida;
	}
	
	public void curar () {
		for( int i = 0; i<mochila.length; i++) {
			if(mochila[i].contentEquals("botiquin")) {
				System.out.println("Te has curado");
			}else {
				System.out.println("no tienes botiquines");
			}
		}
	}
	
	
	
}

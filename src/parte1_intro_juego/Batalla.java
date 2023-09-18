package parte1_intro_juego;

public class Batalla {	
	

	public static Personaje pelear (Personaje p1, Personaje p2) {
		int n = 0;
		int m = 3;
		int golpe = (int) (Math.floor(Math.random()*(n-m+1)+m));
		do {
			p1.setVida(p1.getVida()-golpe);
			if(p1.getVida()<30) {
				String mochila [] = p1.getMochila().clone();
				for(int i  = 0; i<mochila.length; i++) {
					if(mochila[i].contentEquals("botiquin")) {
						p1.setVida(p1.getVida()+10);
					}
				}
			}
			
			p2.setVida(p2.getVida()-golpe);
			if(p2.getVida()<30) {
				String mochila [] = p2.getMochila().clone();
				for(int i  = 0; i<mochila.length; i++) {
					if(mochila[i].contentEquals("botiquin")) {
						p2.setVida(p2.getVida()+10);
					}
				}
			}
		}while(p1.getVida()>=0 && p2.getVida()>=0);
		
		if(p1.getVida()>p2.getVida()) {
			return p1;
		}else {
			return p2;
		}
	}
}

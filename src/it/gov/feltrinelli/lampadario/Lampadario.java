package it.gov.feltrinelli.lampadario;

import javafx.scene.paint.Color;

public class Lampadario {
	Lampadina[] l=new Lampadina[4];

	/**
	 * 
	 */
	public Lampadario() {
		super();
		l[0]=new Lampadina(Color.BLUE,10);
		l[1]=new Lampadina(Color.RED,10);
		l[2]=new Lampadina(Color.YELLOW,10);
		l[3]=new Lampadina(Color.GREEN,10);
	}
	
	public void onoff(int lamp) {
		if (lamp>=0 && lamp<4 ) {
			l[lamp].onOff();
		}
	}
	public void getColore(int lamp) {
		if (lamp>=0 && lamp<4 ) {
			l[lamp].getColore();
		}
	}
	public void getStato(int lamp) {
		if (lamp>=0 && lamp<4 ) {
			l[lamp].getStato();
		}
	}

}

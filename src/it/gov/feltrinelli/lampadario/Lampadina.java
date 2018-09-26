package it.gov.feltrinelli.lampadario;

import javafx.scene.paint.Color;

public class Lampadina {
	 public enum Stato{
		 SPENTO, ACCESO, ROTTO;
	 }
	// public enum Colore {
	//	 ROSSO, GIALLO, BLU, VERDE;
	// }
	private Stato stato;
	private Color colore;
	private int nUtilizzi;
	
	/**
	 * @param stato
	 * @param colore
	 * @param nUtilizzi
	 */
	public Lampadina(Color colore, int nUtilizzi) {
		super();
		this.stato = Stato.SPENTO;
		this.colore = colore;
		this.nUtilizzi = nUtilizzi;
	}

	protected void setStato(Stato stato) {
		this.stato = stato;
	}

	protected Stato getStato() {
		return stato;
	}

	protected Color getColore() {
		return colore;
	}

	
	public void onOff() {
		if(nUtilizzi-->0) {
			if(getStato()==Stato.ACCESO) {
				setStato(Stato.SPENTO);
			}
			else setStato(Stato.ACCESO);
		}
		else setStato(Stato.ROTTO);
	}

	
}

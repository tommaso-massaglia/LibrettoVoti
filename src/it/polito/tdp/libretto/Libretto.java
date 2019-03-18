package it.polito.tdp.libretto;

import java.util.ArrayList;
import java.util.List;

public class Libretto {

	private List<Valutazione> voti;

	public Libretto() {
		this.voti = new ArrayList<Valutazione>();
	}

	/**
	 * Aggiunge un nuovo voto al libretto
	 * 
	 * @param v il {@link voto} da aggiungere
	 */
	public void add(Valutazione v) {
		voti.add(v);
	}

	/**
	 * Seleziona il sottoinsieme di valutazioni con voto desiderato
	 * 
	 * @param voto Punteggio da ricercare
	 * @return lista di {@link Voto} aventi quel punteggio (eventualmente vuota)
	 */
	public List<Valutazione> cercaVoti(int voto) {
		List<Valutazione> results = new ArrayList<Valutazione>();
		for (Valutazione v : this.voti) {
			if (v.getVoto() == voto) {
				results.add(v);
			}
		}
		return results;
	}

	/**
	 * Ritorna il voto dell'esame desiderato (case insensitive)
	 * 
	 * @param voto Nome dell'esame da cercare
	 * @return Oggetto {@link Voto} della materia specificata
	 */
	public Valutazione cercaEsame(String nome) {
		for (Valutazione v : this.voti) {
			if (v.getCorso().toLowerCase().equals(nome.toLowerCase())) {
				return v;
			}
		}
		return null;
	}

}

package it.polito.tdp.libretto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Libretto {

	private List<Valutazione> voti;

	public Libretto() {
		this.voti = new ArrayList<Valutazione>();
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
		Valutazione valutazione = new Valutazione(0, nome, null);
		int pos = this.voti.indexOf(valutazione);
		if (pos == -1)
			return null;
		else
			return this.voti.get(pos);
	}
	
	/**
	 * Controlla se e gia stato inserito l'esame nella lista
	 * @param v voto da controllare se esiste
	 * @return {@link true} se presente {@link false} se non presente
	 */
	public boolean esistevoto(Valutazione v) {
		int pos = this.voti.indexOf(v) ;
		if (pos==-1) 
			return false ;
		else 
			return ( v.getVoto() == this.voti.get(pos).getVoto() ) ;
	}
	
	/**
	 * Controlla se è presente un esame con stesso voto ma data diversa
	 * @param v
	 * @return false se non c'è conflitto, true altrimenti
	 */
	public boolean conflittovoto(Valutazione v) {
		int pos = this.voti.indexOf(v) ;
		if (pos==-1) 
			return false ;
		else 
			return ( v.getVoto() != this.voti.get(pos).getVoto() ) ;
	}

	/** 
	 * Aggiunge un voto al libretto solo se presente
	 * @param element {@link Valutazione} da aggiungere
	 * @return {@link true} se aggiunta, {@link false} altrimenti
	 */
	public boolean add(Valutazione element) {

		if (!this.esistevoto(element) && !this.conflittovoto(element)) {
			voti.add(element);
			return true;
		}
		else
			return false;
		

	}

}

package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.List;

public class testlibretto {

	public static void main(String[] args) {

		Libretto test = new Libretto();

		test.add(new Valutazione(30, "Analisi 1", LocalDate.of(2017, 1, 15)));
		test.add(new Valutazione(30, "Analisi 2", LocalDate.of(2018, 5, 25)));
		test.add(new Valutazione(25, "Fisica 1", LocalDate.of(2017, 2, 04)));
		test.add(new Valutazione(28, "Fisica 2", LocalDate.of(2018, 6, 25)));
		test.add(new Valutazione(30, "GAL", LocalDate.of(2019, 8, 12)));
		test.add(new Valutazione(21, "Economia", LocalDate.of(2019, 7, 24)));
		test.add(new Valutazione(23, "PO", LocalDate.of(2018, 3, 01)));
		test.add(new Valutazione(25, "PWR", LocalDate.of(2018, 2, 18)));
		test.add(new Valutazione(18, "Basi di Dati", LocalDate.of(2019, 5, 23)));
		test.add(new Valutazione(21, "Sistemi elettrici", LocalDate.of(2017, 6, 18)));

		List<Valutazione> venticinque = test.cercaVoti(25);
		System.out.println(venticinque);
		System.out.println("Analisi I, "+test.cercaEsame("analisi 1"));

	}

}

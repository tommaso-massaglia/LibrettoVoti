package it.polito.tdp.libretto;

import java.time.LocalDate;

public class testlibretto {

	public static void main(String[] args) {

		Libretto test = new Libretto();

		test.add(new Voto(30, "Analisi 1", LocalDate.of(2017, 1, 15)));
		test.add(new Voto(30, "Analisi 2", LocalDate.of(2018, 5, 25)));
		test.add(new Voto(25, "Fisica 1", LocalDate.of(2017, 2, 04)));
		test.add(new Voto(28, "Fisica 2", LocalDate.of(2018, 6, 25)));
		test.add(new Voto(30, "GAL", LocalDate.of(2019, 8, 12)));
		test.add(new Voto(21, "Economia", LocalDate.of(2019, 7, 24)));
		test.add(new Voto(23, "PO", LocalDate.of(2018, 3, 01)));
		test.add(new Voto(25, "PWR", LocalDate.of(2018, 2, 18)));

	}

}

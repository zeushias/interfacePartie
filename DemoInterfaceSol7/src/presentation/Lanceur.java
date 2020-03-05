package presentation;

import service.Benjamin;
import service.Fatimata;

public class Lanceur {

	public static void main(String[] args) {
		Fatimata fatimata = new Fatimata();
		fatimata.courir();
		fatimata.lireManga();
		
		Benjamin benjamin = new Benjamin();
		benjamin.courir();
		benjamin.jouer();
	}

}

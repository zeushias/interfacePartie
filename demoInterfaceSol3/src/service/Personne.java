package service;

import Interface.ISport;

public class Personne implements ISport {

	@Override
	public void courir() {

		System.out.println("Une personne sait courir");
	}

	@Override
	public void nager() {

		System.out.println("Une personne sait nager");
	}

}

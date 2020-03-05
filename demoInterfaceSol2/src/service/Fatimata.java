package service;

import Interface.ISport;

public class Fatimata implements ISport {

	@Override
	public void courir() {
		System.out.println("Fatimata sait courir");
	}

	@Override
	public void nager() {
		System.out.println("Fatimata sait nager");
	}
}

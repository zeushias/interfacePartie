package service;

import IService.ITriathlon;

public class Fatimata implements ITriathlon {

	@Override
	public void courir() {

		System.out.println("Fatimata sait courir");
	}

	@Override
	public void nager() {

		System.out.println("Fatimata sait nager");
	}

	@Override
	public void pedaler() {
		System.out.println("Fatimata sait p�daler");
	}

}

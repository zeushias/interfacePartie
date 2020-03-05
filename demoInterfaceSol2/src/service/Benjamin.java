package service;

import Interface.ISport;

public class Benjamin implements ISport {

	@Override
	public void courir() {

		System.out.println("Benjamin sait courir");
	}

	@Override
	public void nager() {

		System.out.println("Benjamin sait nager");
	}

}

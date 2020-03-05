package service;

import IService.IManga;
import IService.ISport;

public class Fatimata implements ISport, IManga {

	@Override
	public void courir() {

		System.out.println("Fatimata sait courir");
	}

	@Override
	public void nager() {

		System.out.println("Fatimata sait nager");
	}

}

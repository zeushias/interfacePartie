package service;

import IService.ISport;
import IService.IJeu;

public class Benjamin implements ISport, IJeu {

	@Override
	public void courir() {

		System.out.println("Benjamin sait courir");
	}

	@Override
	public void nager() {

		System.out.println("Benjamin sait nager");
	}
}

package service;

import IService.ISport;
import IService.IJeu;

public class Benjamin implements ISport, IJeu {

	@Override
	public void nager() {

		System.out.println("Benjamin sait nager");
	}
}

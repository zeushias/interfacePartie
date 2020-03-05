package service;

import IService.ITriathlon;

public class Benjamin implements ITriathlon {

	@Override
	public void courir() {

		System.out.println("Benjamin sait courir");
	}

	@Override
	public void nager() {

		System.out.println("Benjamin sait nager");
	}


	@Override
	public void pedaler() {
		
		System.out.println("Benjamin sait pédaler");
	}
}

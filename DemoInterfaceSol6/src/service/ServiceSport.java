package service;

import IService.ITriathlon;

public class ServiceSport {

	public void participerTriathlon(ITriathlon triathlon) {
		triathlon.courir();
		triathlon.nager();
		triathlon.pedaler();
	}
}

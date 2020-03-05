package presentation;

import service.Cedric;
import service.Fatimata;
import service.ServiceSport;

public class Lanceur {

	public static void main(String[] args) {
		ServiceSport ss = new ServiceSport();
		//ss.participerTriathlon(new Cedric());
		ss.participerTriathlon(new Fatimata());
		

	}

}

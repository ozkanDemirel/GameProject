package Adapter;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class EdevletAdapter implements GamerCheckService {
	
	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		System.out.println("Edevlet Kontrolü Yapýlýyor.");
		Edevlet edevlet = new Edevlet();
		 return  edevlet.getFirstName().equals(gamer.getFirstName()) 
				 && edevlet.getLastName().equals(gamer.getLastName())
				 && edevlet.getNationalityId().equals(gamer.getNationalityId())
				 && edevlet.getDateOfBirth().getYear()==gamer.getDateOfBirth().getYear() 
				 ? true : false;
	
	}

}

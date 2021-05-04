package Concrete;

import java.util.Date;

import Abstract.Logger;
import Entities.Gamer;
import Entities.Sale;

public class EmailLogger implements Logger {
	Date date = new Date();
	@Override
	public void saveLog(Gamer gamer) {
		System.out.println("Email G�nerildi: Say�n; " + gamer.getFirstName()+" "+gamer.getLastName()+" "+ date.toLocaleString()+ " tarihinde oyuna kaydoldunuz");
		
	}

	@Override
	public void sellLog(Gamer gamer, Sale sale) {
		System.out.println("Email G�nderildi: ");
		System.out.println("Say�n; " + gamer.getFirstName()+" "+gamer.getLastName());
		System.out.println( date.toLocaleString()+" tarihinde "+sale.getSalePrice()+ " TL �deyerek oyunu sat�n ald�n�z."
				+ "i�lem bilginiz dahilinde de�ilse bizimle irtibata ge�iniz");
		
	}

	

}

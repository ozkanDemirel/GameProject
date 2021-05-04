package Concrete;

import java.util.Date;

import Abstract.Logger;
import Entities.Gamer;
import Entities.Sale;

public class SmsLogger implements Logger {
	
	Date date = new Date();

	@Override
	public void saveLog(Gamer gamer) {
		System.out.println("Sms Gönerildi: Sayýn; " + gamer.getFirstName()+" "+gamer.getLastName()+" "+ date.toLocaleString()+ " tarihinde oyuna kaydoldunuz");
		
	}

	@Override
	public void sellLog(Gamer gamer, Sale sale) {
		System.out.println("Sms Gönderildi: ");
		System.out.println("Sayýn; " + gamer.getFirstName()+" "+gamer.getLastName());
		System.out.println( date.toLocaleString()+" tarihinde "+sale.getSalePrice()+ " TL ödeyerek oyunu satýn aldýnýz."
				+ "iþlem bilginiz dahilinde deðilse bizimle irtibata geçiniz");
		
	}

	
	

}

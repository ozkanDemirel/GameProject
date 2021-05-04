package Concrete;

import java.util.Date;
import Abstract.Logger;
import Entities.Gamer;
import Entities.Sale;

public class DatabaseLogger implements Logger{
	
	Date date = new Date();


	@Override
	public void saveLog(Gamer gamer) {
		System.out.println("Veri Taban�na Logland�: " + gamer.getFirstName()+" "+gamer.getLastName()+" adl� oyuncu "+ date.toLocaleString()+ " tarihinde oyuna kaydoldu");
		
	}

	@Override
	public void sellLog(Gamer gamer, Sale sale) {
		System.out.println("Veri Taban�na Logland�: ");
		System.out.println("Oyunu Alan Oyuncunun Ad� Soyad�: " + gamer.getFirstName()+" "+gamer.getLastName());
		System.out.println("Sat�� Tarihi: " + date.toLocaleString());
		System.out.println("Sat�� Tutar�: " + sale.getSalePrice());
	}
	
	

}

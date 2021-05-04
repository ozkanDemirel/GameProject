package Concrete;

import java.util.Date;

import Abstract.Logger;
import Entities.Gamer;
import Entities.Sale;

public class FileLogger implements Logger{

	Date date = new Date();
	
	@Override
	public void saveLog(Gamer gamer) {
		System.out.println("Dosyaya Logland�: " + gamer.getFirstName()+" "+gamer.getLastName()+" adl� oyuncu "+ date.toLocaleString()+ " tarihinde oyuna kaydoldu");
		
	}

	@Override
	public void sellLog(Gamer gamer, Sale sale) {
		System.out.println("Dosyaya Logland�: ");
		System.out.println("Oyunu Alan Oyuncunun Ad� Soyad�: " + gamer.getFirstName()+" "+gamer.getLastName());
		System.out.println("Sat�� Tarihi: " + date.toLocaleString());
		System.out.println("Sat�� Tutar�: " + sale.getSalePrice());
		
		
	}

	

}

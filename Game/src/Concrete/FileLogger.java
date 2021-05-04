package Concrete;

import java.util.Date;

import Abstract.Logger;
import Entities.Gamer;
import Entities.Sale;

public class FileLogger implements Logger{

	Date date = new Date();
	
	@Override
	public void saveLog(Gamer gamer) {
		System.out.println("Dosyaya Loglandý: " + gamer.getFirstName()+" "+gamer.getLastName()+" adlý oyuncu "+ date.toLocaleString()+ " tarihinde oyuna kaydoldu");
		
	}

	@Override
	public void sellLog(Gamer gamer, Sale sale) {
		System.out.println("Dosyaya Loglandý: ");
		System.out.println("Oyunu Alan Oyuncunun Adý Soyadý: " + gamer.getFirstName()+" "+gamer.getLastName());
		System.out.println("Satýþ Tarihi: " + date.toLocaleString());
		System.out.println("Satýþ Tutarý: " + sale.getSalePrice());
		
		
	}

	

}

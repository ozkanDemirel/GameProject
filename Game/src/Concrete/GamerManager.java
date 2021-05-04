package Concrete;


import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Abstract.Logger;
import Entities.Gamer;
import Utils.Utils;

public class GamerManager implements GamerService{
	
	GamerCheckService gamerCheckService;
	
	Logger[] loggers;
	
	public GamerManager(GamerCheckService gamerCheckService, Logger[] loggers) {
		
		this.gamerCheckService = gamerCheckService;
		this.loggers = loggers;
	}

	@Override
	public void save(Gamer gamer) throws NumberFormatException, RemoteException {
		
		if (gamerCheckService.CheckIfRealPerson(gamer)) {
			
			System.out.println("Sayýn; "+ gamer.getFirstName()+" "+gamer.getLastName()+" sisteme kaydýnýz baþarýyla tamamlanmýþtýr.");
			Utils.saveRunLogger(loggers, gamer);
		}else {
			System.out.println("Not a valid Person");
		}
			
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println( "Sayýn; " + gamer.getFirstName()+" "+gamer.getLastName()+" sistemden kaydýnýz baþarýyla silinmiþtir.");	
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Sayýn; " + gamer.getFirstName()+" "+gamer.getLastName()+" bilgileriniz baþarýyla güncellenmiþtir.");		
	}
	
	
}

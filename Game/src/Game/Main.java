package Game;
import java.rmi.RemoteException;
import java.util.Date;

import Abstract.CampaignService;
import Abstract.GamerService;
import Abstract.Logger;
import Abstract.SaleService;
import Adapter.EdevletAdapter;
import Adapter.MernisAdapter;
import Concrete.AdultCampaignManager;
import Concrete.DatabaseLogger;
import Concrete.EmailLogger;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Concrete.SaleWithCampaignManager;
import Concrete.SmsLogger;
import Concrete.StudentCampaignManager;
import Entities.Campaign;
import Entities.Gamer;
import Entities.Product;
import Entities.Sale;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		Logger[] loggers = {new DatabaseLogger(), new SmsLogger(), new EmailLogger()};
		
		GamerService gamerService = new GamerManager(new EdevletAdapter(),loggers);
		System.out.println("************************************************************************************************");
		Gamer gamer = new Gamer(1,"özkan","demirel","12345678902",new Date(1986,1,14),"ozkan@gmail.com","05504004040","öðrenci");	
		gamerService.save(gamer);
		
		System.out.println("************************************************************************************************");	
		SaleService saleService1 = new SaleManager(loggers,new Product(),new Sale(2));
		SaleService saleService2 = new SaleWithCampaignManager(new StudentCampaignManager(loggers,new Sale(2)));
		
		if(gamer.getStatus().equalsIgnoreCase("öðrenci")) {
		saleService1.sale(gamer);	
		}
		else {
			saleService2.sale(gamer);
		}
		
		
		
		
	}

}

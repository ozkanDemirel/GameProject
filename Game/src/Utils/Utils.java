package Utils;

import Abstract.CampaignService;
import Abstract.Logger;
import Entities.Campaign;
import Entities.Gamer;
import Entities.Product;
import Entities.Sale;

public class Utils {
	
	
	
	public static void saveRunLogger(Logger[] loggers, Gamer gamer) {
		for (Logger logger : loggers) {
			
			logger.saveLog(gamer);
			System.out.println("************************************************************************************************");
			
		}
	}
	public static void saleRunLogger(Logger[] loggers, Gamer gamer, Sale sale) {
		for (Logger logger : loggers) {
			
			logger.sellLog(gamer, sale);
			System.out.println("************************************************************************************************");
			
		}
	}
	
}

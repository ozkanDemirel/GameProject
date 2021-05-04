package Concrete;


import Abstract.CampaignService;
import Abstract.Logger;
import Abstract.SaleService;
import Entities.Campaign;
import Entities.Gamer;
import Entities.Product;
import Entities.Sale;
import Utils.Utils;
import Entities.Product;

public class SaleManager implements SaleService{
	
	Logger[] loggers;
	Product product;
	Sale sale;
	

	public SaleManager(Logger[] loggers, Product product, Sale sale) {
		
		this.loggers = loggers;
		this.product = product;
		this.sale = sale;
	}


	@Override
	public  void sale(Gamer gamer) {
		System.out.println("Sayýn " + gamer.getFirstName()+" "+gamer.getLastName()+" Oyunu Satýn Aldýnýz");
		System.out.println("Oyunun Birim Fiyatý : "+ product.getUnitPrice());
		System.out.println("Satýþ Adedi 		: " + sale.getSaleAmount());
		sale.setSalePrice(sale.getSaleAmount()*product.getUnitPrice());
		System.out.println("Toplam Satýþ Fiyatý : " + sale.getSalePrice());
		System.out.println("************************************************************************************************");	
		Utils.saleRunLogger(loggers, gamer, sale);
		
	}


}

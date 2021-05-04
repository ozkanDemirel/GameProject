package Concrete;

import Abstract.CampaignService;
import Abstract.Logger;
import Entities.Campaign;
import Entities.Gamer;
import Entities.Product;
import Entities.Sale;
import Utils.Utils;

public class AdultCampaignManager implements CampaignService{
	
	Logger[] loggers ;
	Campaign campaign =new Campaign();
	Product product = new Product();
	
	Sale sale;
	
	
	public AdultCampaignManager (Logger[] loggers,Sale sale) {
		
		this.loggers = loggers;
		this.sale=sale;
	}
	@Override
	public void sale(Gamer gamer) {
		
		switch (sale.getSaleAmount()) {

		case 1:
			campaign.setDiscount(5);
			break;
		case 2:
			campaign.setDiscount(10);
			break;
		case 3:
			campaign.setDiscount(15);
			break;
		case 4:
			campaign.setDiscount(20);
			break;
		case 5:
			campaign.setDiscount(25);
			break;
		default:
			campaign.setDiscount(30);

		}
		double lastPrice = product.getUnitPrice()-(product.getUnitPrice()*campaign.getDiscount()/100);
		System.out.println("Yeti�kin �ndirimi Uygulan�yor");
		System.out.println( gamer.getFirstName() + " " + gamer.getLastName() + " Oyunu Sat�n Ald�n�z");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("Oyunun Birim Fiyat�		: " + product.getUnitPrice());
		System.out.println("�ndirim Oran� 			: " + campaign.getDiscount());
		System.out.println("�ndirimli Birim Fiyat�		: "
				+ (product.getUnitPrice() - (product.getUnitPrice() * campaign.getDiscount() / 100)));
		System.out.println("Sat�� Adedi 			: " + sale.getSaleAmount());
		product.setStockAmount(product.getStockAmount() - sale.getSaleAmount());
		System.out.println("Kalan Oyun Adedi		: " + product.getStockAmount());
		sale.setSalePrice(sale.getSaleAmount()
				* (product.getUnitPrice() - (product.getUnitPrice() * campaign.getDiscount() / 100)));
		System.out.println("Toplam Sat�� Fiyat�		: " + sale.getSalePrice());
		System.out.println("************************************************************************************************");
		Utils.saleRunLogger(loggers, gamer, sale);
	}
	
	

}

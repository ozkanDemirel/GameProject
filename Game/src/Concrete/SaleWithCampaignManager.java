package Concrete;

import Abstract.CampaignService;
import Abstract.Logger;
import Abstract.SaleService;
import Entities.Campaign;
import Entities.Gamer;
import Entities.Product;
import Entities.Sale;
import Utils.Utils;

public class SaleWithCampaignManager implements SaleService {
	
	CampaignService campaignService;
	
	public SaleWithCampaignManager(CampaignService campaignService) {
		
		this.campaignService = campaignService;
	}

	@Override
	public void sale(Gamer gamer) {
		
		campaignService.sale(gamer);
		System.out.println("************************************************************************************************");	
		
	}

}

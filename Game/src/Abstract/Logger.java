package Abstract;

import Entities.Gamer;
import Entities.Sale;

public interface Logger {
	
	void saveLog(Gamer gamer);
	void sellLog(Gamer gamer, Sale sale);
	
}

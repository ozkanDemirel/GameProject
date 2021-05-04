package Abstract;

import java.rmi.RemoteException;

import Entities.Gamer;

public interface GamerCheckService {
	
	boolean CheckIfRealPerson(Gamer	gamer) throws NumberFormatException, RemoteException;

}

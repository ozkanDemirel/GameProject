package Abstract;

import java.rmi.RemoteException;

import Entities.Gamer;

public interface GamerService {
	void save(Gamer gamer) throws NumberFormatException, RemoteException;
	void delete(Gamer gamer);
	void update(Gamer gamer);
}

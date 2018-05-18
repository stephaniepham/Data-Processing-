//1686756
//Stephanie Pham
//Inleveropdracht P1 DAO Simulatie voor 1 domeinklasse 

package week2.opdrachtinles.p2;

import java.sql.SQLException;
import java.util.List;

public interface ReizigerDAO {
	public List<Reiziger> findAll() throws ClassNotFoundException, SQLException;
	
	public Reiziger findByGBdatum(String DBdatum) throws ClassNotFoundException, SQLException;
	
	public Reiziger save(Reiziger reiziger) throws ClassNotFoundException, SQLException;
//	
//	public Reiziger update(int i, Reiziger reiziger);
//	
	public boolean delete(Reiziger reiziger) throws ClassNotFoundException, SQLException;
	}


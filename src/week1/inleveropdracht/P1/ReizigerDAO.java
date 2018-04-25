//1686756
//Stephanie Pham
//Inleveropdracht P1 DAO Simulatie voor 1 domeinklasse 

package week1.inleveropdracht.P1;

import java.util.List;

public interface ReizigerDAO {
	public List<Reiziger> findall();
	public List<Reiziger> findByDBdatum(String DBdatum);
	public Reiziger save(Reiziger reiziger);
	public Reiziger update (Reiziger reiziger);
	public boolean delete (Reiziger reiziger);
	}


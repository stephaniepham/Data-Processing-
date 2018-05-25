package week3.inleveropdracht.p3;

import java.util.ArrayList;

public interface ReizigerDao {

	public ArrayList<Reiziger> findAll();

	public ArrayList<Reiziger> findByGBdatum(String GBdatum);

	public Reiziger save(Reiziger reiziger);

	public Reiziger update(Reiziger reiziger);

	public boolean delete(Reiziger reiziger);
}
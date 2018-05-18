package week2.opdrachtinles.p2;

import java.sql.SQLException;


public class Main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		ReizigerOracleDaoImpl reizigerDao = new ReizigerOracleDaoImpl();
		
		System.out.println("ADD reiziger  --------------------------------------------------------START");
		Reiziger reizigerSteph = new Reiziger();
		reizigerSteph.setReizigerId(7);
		reizigerSteph.setAchternaam("Pham");
		reizigerSteph.setVoorletter("S");
		reizigerSteph.setTussenvoegsel(null);
		reizigerSteph.setGbdatum("03-12-02");
		
		reizigerDao.save(reizigerSteph);
		
		
		
		Reiziger reizigerJay = new Reiziger();
		reizigerJay.setReizigerId(8);
		reizigerJay.setAchternaam("Dammer");
		reizigerJay.setVoorletter("J");
		reizigerJay.setTussenvoegsel(null);
		reizigerJay.setGbdatum("13-12-02");
		
		reizigerDao.save(reizigerJay);
		
		System.out.println("ADD reiziger --------------------------------------------------------END");
		
		System.out.println();
		System.out.println();
		
		System.out.println("Haal alle reizigers op --------------------------------------------------------START");
		for ( Reiziger reiziger : reizigerDao.findAll()) {
			System.out.println("reiziger: [reiziger Id: " + reiziger.getReizigerId()+ ", Naam : " + reiziger.getVoorletter() + "." + reiziger.getAchternaam()
											+ ", Geboortedatum: "+ reiziger.getGBdatum() + " ]");
		}
		System.out.println("Haal alle reizigers op --------------------------------------------------------END");
		
		System.out.println();
		System.out.println();
		
		System.out.println("haal reiziger OP BASIS VAN gbdatum--------------------------------------------START");
		
		Reiziger reiziger = reizigerDao.findByGBdatum("03-12-02");
		System.out.println("reiziger: [reiziger Id: " + reiziger.getReizigerId()+ ", Naam : " + reiziger.getVoorletter() + "." + reiziger.getAchternaam()
		+ ", Geboortedatum: "+ reiziger.getGBdatum() + " ]");
		
		System.out.println("haal reiziger OP BASIS VAN gbdatum--------------------------------------------EINDE");

		System.out.println();
		System.out.println();
//		
//		System.out.println("verwijder reiziger OP BASIS VAN ID--------------------------------------------START");
//		reizigerDao.delete(reizigerSteph);
//		//reizigerDao.delete(reizigerJay);
//		System.out.println("verwijder reiziger OP BASIS VAN ID--------------------------------------------EINDE");
//		
		
		
	}

}


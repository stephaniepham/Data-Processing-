//1686756
//Stephanie Pham
//Inleveropdracht P1 DAO Simulatie voor 1 domeinklasse 

package week1.inleveropdracht.P1;

import java.sql.Date;

public class Reiziger {
	private String naam;
	private String gbdatum;
		
	public Reiziger(String naam, String gbdatum) {
		this.naam = naam;
		this.gbdatum = gbdatum;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getGbdatum() {
		return gbdatum;
	}

	public void setGbdatum(String gbdatum) {
		this.gbdatum = gbdatum;
	}
}

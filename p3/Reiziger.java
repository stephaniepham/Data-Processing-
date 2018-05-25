package week3.inleveropdracht.p3;

public class Reiziger {

	private long reizigerID;
	private String voorletters;
	private String tussenvoegsel;
	private String achternaam;
	private String geboortedatum;

	public Reiziger() {
	}

	public Reiziger(long reizigerID, String voorletters, String tussenvoegsel, String achternaam, String geboortedatum) {
		super();
		this.reizigerID = reizigerID;
		this.voorletters = voorletters;
		this.tussenvoegsel = tussenvoegsel;
		this.achternaam = achternaam;
		this.geboortedatum = geboortedatum;
	}

	public long getReizigerID() {
		return reizigerID;
	}

	public void setReizigerID(long reizigerID) {
		this.reizigerID = reizigerID;
	}

	public String getVoorletters() {
		return voorletters;
	}

	public void setVoorletters(String voorletters) {
		this.voorletters = voorletters;
	}

	public String getTussenvoegsel() {
		return tussenvoegsel;
	}

	public void setTussenvoegsel(String tussenvoegsel) {
		this.tussenvoegsel = tussenvoegsel;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public String getGeboortedatum() {
		return geboortedatum;
	}

	public void setGeboortedatum(String geboortedatum) {
		this.geboortedatum = geboortedatum;
	}
}

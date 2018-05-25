package week3.inleveropdracht.p3;

public class adres {
	private long adresID;
	private String postcode;
	private int huisnummer;
	private String straat;
	private String woonplaats;
	private long reizigerID;
	private Reiziger reigziger;
	
	public adres() {
	}
	
	public adres(long adresID, String postcode, int huisnummer, String straat, String woonplaats, long reizigerID) {
	super();
	this.adresID = adresID;
	this.postcode = postcode;
	this.huisnummer = huisnummer;
	this.straat = straat;
	this.woonplaats = woonplaats;
	this.reizigerID = reizigerID;
}

	public long getAdresID() {
		return adresID;
	}

	public void setAdresID(long adresID) {
		this.adresID = adresID;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public int getHuisnummer() {
		return huisnummer;
	}

	public void setHuisnummer(int huisnummer) {
		this.huisnummer = huisnummer;
	}

	public String getStraat() {
		return straat;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public String getWoonplaats() {
		return woonplaats;
	}

	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
	}

	public long getReizigerID() {
		return reizigerID;
	}

	public void setReizigerID(long reizigerID) {
		this.reizigerID = reizigerID;
	}

	public Reiziger getReigziger() {
		return reigziger;
	}

	public void setReigziger(Reiziger reigziger) {
		this.reigziger = reigziger;
	}
	
}
	
	

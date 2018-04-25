package week1.inleveropdracht.P1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reiziger r1 = new Reiziger ("Stephanie ", "31-10-1994");
		Reiziger r2 = new Reiziger ("Thomas ", "08-08-1996");
		Reiziger r3 = new Reiziger ("Jenny ", "04-08-1992");
		
		ReizigerDAOImpl rdi = new ReizigerDAOImpl();
		rdi.alleReizigers.add(r1);
		rdi.alleReizigers.add(r2);
		rdi.alleReizigers.add(r3);
		
		System.out.println("Alle reizigers: \n" + rdi.findall()); //de hele lijst uitprinten met alle reizigers
		System.out.println("Verwijderde reizigers: \n" + rdi.delete(r1)); //reiziger r1 verwijderen uit de lijst
		
		Reiziger r4 = new Reiziger ("Nico", "05-11-1988"); //nieuwe reiziger toevoegen
		rdi.save(r4); 
		System.out.println(rdi.findall()); //de hele lijst met alle reizigers 
		System.out.println(rdi.findByGBdatum("04-08-1992")); //persoon met geboortedatum zoeken
		
		System.out.println(rdi.findall());
		
	 	
	}

}

//1686756
//Stephanie Pham
//Inleveropdracht P1 DAO Simulatie voor 1 domeinklasse 

package week1.inleveropdracht.P1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class ReizigerDAOImpl implements ReizigerDAO{
	public ArrayList<Reiziger>alleReizigers;
	
	public ReizigerDAOImpl() {
		alleReizigers = new ArrayList();
	}
	public List<Reiziger> findall(){
		return Collections.unmodifiableList(alleReizigers);
		
	}
	public List<Reiziger> findByGBdatum(String GBdatum){
		List<Reiziger> result = new ArrayList();
		for(Reiziger reiziger: this.alleReizigers) {
			if(reiziger.getGbdatum().equals(GBdatum)) {
				result.add(reiziger);
				System.out.println("Found day of birth");
			}
		}
		for(Reiziger reiziger : result) {
			System.out.println(reiziger);
		
	}
	return result;
}
	
	public Reiziger save (Reiziger reiziger) {
		if(reiziger == null)
			throw new IllegalArgumentException("Reiziger is null, probeer opnieuw");
		
		if(!alleReizigers.contains(reiziger)) {
			alleReizigers.add(reiziger);
		}
		return null;
	}
	
	public Reiziger update (int i, Reiziger reiziger) {
		if(reiziger == null)
			throw new IllegalArgumentException("Reiziger is null, probeer opnieuw");
		
		alleReizigers.set(i, reiziger);
		return reiziger;
	}
	
	public boolean delete (Reiziger reiziger) {
		boolean result = false;
		if(reiziger == null)
			throw new IllegalArgumentException("Reiziger is null, probeer opnieuw");
		if(alleReizigers.contains(reiziger)) {
			alleReizigers.remove(reiziger);
			result = true; 
		}
		System.out.println("Succeed deleting reiziger" + result);
		return result;
	}
	
	@Override
	public List<Reiziger> findByDBdatum(String DBdatum) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Reiziger update(Reiziger reiziger) {
		// TODO Auto-generated method stub
		return null;
	}
	}

package week3.inleveropdracht.p3;

import java.util.ArrayList;

import week3.inleveropdracht.p3.OVChipkaart;

public interface OVChipkaartDao {

	
	public OVChipkaart findById(long id);
	public ArrayList<OVChipkaart> findByReiziger(long id);
	public OVChipkaart insertOVChipkaart(OVChipkaart oVChipkaart);
	public OVChipkaart updateOVChipkaart(OVChipkaart oVChipkaart);
	public OVChipkaart deleteOVChipkaart(long id);
	public OVChipkaart selectOVChipkaartWithReizigerInfo(long id);
}

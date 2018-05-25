package week3.inleveropdracht.p3;

import java.util.ArrayList;

import week3.inleveropdracht.p3.OVChipkaartProduct;

public interface OVChipkaartProductDao {
	public OVChipkaartProduct findById(long id);
	public OVChipkaartProduct findByIdInOVChipkaart(long id);
	public ArrayList<OVChipkaartProduct> findByIdInBothTables(long id);
}



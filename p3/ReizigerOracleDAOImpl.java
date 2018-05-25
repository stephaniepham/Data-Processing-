package week3.inleveropdracht.p3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ReizigerOracleDAOImpl extends OracleBaseDao implements ReizigerDao {

	@Override
	public ArrayList<Reiziger> findAll() {
		ArrayList<Reiziger> reizigerList = new ArrayList<Reiziger>();
		try (Connection con = super.getConnection()) {
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM reiziger");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String tussenvoegsel = null;
				String geboortedatum = null;
				int reizigerID = rs.getInt("reiziger_id");
				String voorletters = rs.getString("voorletters");
				if(rs.getString("tussenvoegsel") != null) {
					tussenvoegsel = rs.getString("tussenvoegsel");
				}
				String achternaam = rs.getString("achternaam");
				if(rs.getString("geboortedatum") != null) {
					geboortedatum = rs.getString("geboortedatum");
				}
				Reiziger reiziger = new Reiziger(reizigerID, voorletters, tussenvoegsel, achternaam, geboortedatum);
				reizigerList.add(reiziger);
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return reizigerList;
	}

	@Override
	public ArrayList<Reiziger> findByGBdatum(String GBdatum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reiziger save(Reiziger reiziger) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reiziger update(Reiziger reiziger) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Reiziger reiziger) {
		// TODO Auto-generated method stub
		return false;
	}
}
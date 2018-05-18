package week2.opdrachtinles.p2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReizigerOracleDaoImpl extends OracleBaseDAO implements ReizigerDAO {

	@Override
	public List<Reiziger> findAll() throws ClassNotFoundException, SQLException {
		Connection con = getConnection();

		List<Reiziger> reizigerLijst = new ArrayList<Reiziger>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String query = "SELECT * FROM reiziger";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				Reiziger reiziger = new Reiziger();
				reiziger.setReizigerId(rs.getInt("REIZIGERID"));
				reiziger.setVoorletter(rs.getString("VOORLETTERS"));
				reiziger.setTussenvoegsel(rs.getString("TUSSENVOEGSEL"));
				reiziger.setAchternaam(rs.getString("ACHTERNAAM"));
				reiziger.setGbdatum(rs.getString("GEBORTEDATUM"));
				reizigerLijst.add(reiziger);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception exe) {
				exe.printStackTrace();
			}
		}
		return reizigerLijst;
	}

	@Override
	public Reiziger findByGBdatum(String GBdatum) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String query = "SELECT * FROM reiziger where GEBORTEDATUM = '" + GBdatum + "' ";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				Reiziger reiziger = new Reiziger();
				reiziger.setReizigerId(rs.getInt("REIZIGERID"));
				reiziger.setVoorletter(rs.getString("VOORLETTERS"));
				reiziger.setTussenvoegsel(rs.getString("TUSSENVOEGSEL"));
				reiziger.setAchternaam(rs.getString("ACHTERNAAM"));
				reiziger.setGbdatum(rs.getString("GEBORTEDATUM"));
				return reiziger;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception exe) {
				exe.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Reiziger save(Reiziger reiziger) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		Statement statement = null;

		String sql = "insert into reiziger values (" + reiziger.getReizigerId() + "," + "'" + reiziger.getVoorletter()
				+ "'" + "," + "'" + reiziger.getTussenvoegsel() + "'" + "," + "'" + reiziger.getAchternaam() + "'" + ","
				+ "'" + reiziger.getGbdatum() + "'" + ")";

		try {

			statement = con.prepareStatement(sql);
			statement.executeUpdate(sql);

			System.out.println("Insert voltooid voor reiziger met achternaam: " + reiziger.getAchternaam());

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	//
//	@Override
//	public Reiziger update(Reiziger reiziger) {
//
//		if (reiziger == null)
//			throw new IllegalArgumentException("Reiziger mag niet null zijn");
//
//		alleReizigers.set(i, reiziger);
//		return reiziger;
//	}

	@Override
	public boolean delete(Reiziger reiziger) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		Statement statement = null;
		boolean Resultaat = false;
		System.out.println("test1");
		
		System.out.println("test2");
		
		if (reiziger == null)
			throw new IllegalArgumentException("reiziger mag niet null zijn");
		System.out.println("test3");
		try {
			String sql = "delete from reiziger where REIZIGERID=" + reiziger.getReizigerId();
			System.out.print("SQL : " + sql);
			System.out.println("test4");
			statement = con.prepareStatement(sql);
			System.out.println("test5");
			statement.execute(sql);   //executeUpdate(sql);
			System.out.println("test6");
			System.out.println("Reiziger succesvol verwijder met reizigersID: " + 
									reiziger.getReizigerId());
			System.out.println("test7");
			Resultaat = true;
			System.out.println("test8");
		}
		catch ( SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			if ( statement != null) {
				try {
					statement.close();
				}
				catch ( SQLException e) {
					e.printStackTrace();
				}
				
			}
			
			if (con != null) {
				try {
					con.close();
				}
				catch (SQLException e ) {
					e.printStackTrace();
				}
			}
		}

		//System.out.println("Verwijderen van reiziger succesvol gelukt?: " + Resultaat);
		return Resultaat;
	}
}
package week3.inleveropdracht.p3;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import week3.inleveropdracht.p3.OVChipkaart;
import week3.inleveropdracht.p3.OVChipkaartProduct;
import week3.inleveropdracht.p3.Product;

	public class OVChipkaartProductDaoImpl extends OracleBaseDao implements OVChipkaartProductDao {

		@Override
		public OVChipkaartProduct findById(long id) {
			OVChipkaartProduct ov_p = new OVChipkaartProduct();
			try (Connection con = super.getConnection()) {
				PreparedStatement stmt = con.prepareStatement("SELECT * FROM ov_chipkaart_product WHERE ovproduct_id = ?");
				stmt.setLong(1, id);
				ResultSet rs = stmt.executeQuery();

				if (rs.next()) {
					long ovproductID = rs.getLong("ovproduct_id");
					long kaartNummer = rs.getLong("kaart_nummer");
					long productNummer = rs.getLong("product_nummer");
					String reisproductStatus = rs.getString("reisproduct_status");
					String lastUpdate = rs.getString("last_update");

					OVChipkaart o = new OVChipkaart();
					Product p = new Product();
					ov_p.setOvproductID(ovproductID);
					ov_p.setReisproductStatus(reisproductStatus);
					ov_p.setLastUpdate(lastUpdate);
					o.setKaartNummer(kaartNummer);
					p.setProductNummer(productNummer);
					ov_p.setoVChipkaart(o);
					ov_p.setProduct(p);
				}
				con.close();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
			return ov_p;
		}

		@Override
		public OVChipkaartProduct findByIdInOVChipkaart(long id) {
			OVChipkaartProduct ov_p = new OVChipkaartProduct();
			try (Connection con = super.getConnection()) {
				PreparedStatement stmt = con.prepareStatement(
						"SELECT ov_c_p.ovproduct_id, ov_c_p.reisproduct_status, ov_c.kaart_nummer, ov_c.saldo \r\n"
								+ "FROM ov_chipkaart_product ov_c_p, ov_chipkaart ov_c\r\n"
								+ "WHERE ov_c.kaart_nummer = ov_c_p.kaart_nummer AND ov_c.kaart_nummer = ?");
				stmt.setLong(1, id);
				ResultSet rs = stmt.executeQuery();

				if (rs.next()) {
					long ovproductID = rs.getLong("ovproduct_id");
					String reisproductStatus = rs.getString("reisproduct_status");
					long kaartNummer = rs.getLong("kaart_nummer");
					double saldo = rs.getDouble("saldo");

					OVChipkaart o = new OVChipkaart();
					ov_p.setOvproductID(ovproductID);
					ov_p.setReisproductStatus(reisproductStatus);
					o.setKaartNummer(kaartNummer);
					o.setSaldo(saldo);
					ov_p.setoVChipkaart(o);
				}
				con.close();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
			return ov_p;
		}

		@Override
		public ArrayList<OVChipkaartProduct> findByIdInBothTables(long id) {
			ArrayList<OVChipkaartProduct> ov_pList = new ArrayList<OVChipkaartProduct>();
			try (Connection con = super.getConnection()) {
				PreparedStatement stmt = con.prepareStatement(
						"SELECT ov_c_p.ovproduct_id, ov_c_p.reisproduct_status, ov_c.kaart_nummer, ov_c.saldo, p.product_naam\r\n"
								+ "FROM ov_chipkaart_product ov_c_p, ov_chipkaart ov_c, product p\r\n"
								+ "WHERE ov_c.kaart_nummer = ov_c_p.kaart_nummer AND ov_c_p.kaart_nummer = ?");
				stmt.setLong(1, id);
				ResultSet rs = stmt.executeQuery();

				while (rs.next()) {
					OVChipkaartProduct ov_p = new OVChipkaartProduct();
					long ovproductID = rs.getLong("ovproduct_id");
					String reisproductStatus = rs.getString("reisproduct_status");
					long kaartNummer = rs.getLong("kaart_nummer");
					double saldo = rs.getDouble("saldo");
					String productNaam = rs.getString("product_naam");

					OVChipkaart o = new OVChipkaart();
					Product p = new Product();
					ov_p.setOvproductID(ovproductID);
					ov_p.setReisproductStatus(reisproductStatus);
					o.setKaartNummer(kaartNummer);
					o.setSaldo(saldo);
					p.setProductNaam(productNaam);
					ov_p.setoVChipkaart(o);
					ov_p.setProduct(p);
					ov_pList.add(ov_p);
				}
				con.close();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
			return ov_pList;
		}
	}


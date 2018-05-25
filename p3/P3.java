package week3.inleveropdracht.p3;

import week3.inleveropdracht.p3.OVChipkaartProduct;
import week3.inleveropdracht.p3.OVChipkaartProductDao;
import week3.inleveropdracht.p3.OVChipkaartProductDaoImpl;
import week3.inleveropdracht.p3.ProductDao;
import week3.inleveropdracht.p3.ProductDaoImpl;

public class P3 {

	public static void main(String[] args) {
		ProductDao pDAO = new ProductDaoImpl();
		OVChipkaartProductDao ov_pDAO = new OVChipkaartProductDaoImpl();

		// Select statement uit product met id 11111111111
		System.out.println("Product rij met id 1111111111");
		System.out.println("Productnaam: " + pDAO.findById(1111111111).getProductNaam());
		System.out.println("Productbeschrijving: " + pDAO.findById(1111111111).getBeschrijving());
		System.out.println("Productprijs: " + pDAO.findById(1111111111).getPrijs());

		// Select statement uit ov_chipkaart_product met id 1111111111
		System.out.println("\nOVChipkaart_Product rij zoeken met id 1111111111");
		System.out.println("Kaartnummer: " + ov_pDAO.findById(1111111111).getoVChipkaart().getKaartNummer());
		System.out.println("Productnummer: " + ov_pDAO.findById(1111111111).getProduct().getProductNummer());
		System.out.println("Reisproduct status: " + ov_pDAO.findById(1111111111).getReisproductStatus());
		System.out.println("Laatste update: " + ov_pDAO.findById(1111111111).getLastUpdate());

		// Select statement uit ov_chipkaart_product en ov_chipkaart met id 1111111111
		System.out.println(
				"\nOVChipkaart_Product rij zoeken uit tabel ov_chipkaart_product en ov_chipkaart met id 1111111111");
		System.out.println("Kaartnummer: " + ov_pDAO.findByIdInOVChipkaart(1111111111).getOvproductID());
		System.out.println("Reisproduct status: " + ov_pDAO.findByIdInOVChipkaart(1111111111).getReisproductStatus());
		System.out
				.println("Kaartnummer: " + ov_pDAO.findByIdInOVChipkaart(1111111111).getoVChipkaart().getKaartNummer());
		System.out.println("saldo: " + ov_pDAO.findByIdInOVChipkaart(1111111111).getoVChipkaart().getSaldo());

		// Select statement uit ov_chipkaart_product en ov_chipkaart en product met id
		// 1111111111
		System.out.println(
				"\nOVChipkaart_Product rijen zoeken uit tabel ov_chipkaart_product en ov_chipkaart en product met id 1111111111");
		for (OVChipkaartProduct ov_p : ov_pDAO.findByIdInBothTables(1111111111)) {
			System.out.println("ov_productID: " + ov_p.getOvproductID());
			System.out.println("Reisproduct status: " + ov_p.getReisproductStatus());
			System.out.println("Kaartnummer: " + ov_p.getoVChipkaart().getKaartNummer());
			System.out.println("saldo: " + ov_p.getoVChipkaart().getSaldo());
			System.out.println("productNaam: " + ov_p.getProduct().getProductNaam() + "\n");
		}
	}
}
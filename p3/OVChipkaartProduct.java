package week3.inleveropdracht.p3;

public class OVChipkaartProduct {

		private long ovproductID;
		private OVChipkaart oVChipkaart;
		private Product product;
		private String reisproductStatus;
		private String lastUpdate;

		public OVChipkaartProduct() {
		}

		public OVChipkaartProduct(long ovproductID, OVChipkaart oVChipkaart, Product product, String reisproductStatus,
				String lastUpdate) {
			super();
			this.ovproductID = ovproductID;
			this.oVChipkaart = oVChipkaart;
			this.product = product;
			this.reisproductStatus = reisproductStatus;
			this.lastUpdate = lastUpdate;
		}

		public long getOvproductID() {
			return ovproductID;
		}

		public void setOvproductID(long ovproductID) {
			this.ovproductID = ovproductID;
		}

		public OVChipkaart getoVChipkaart() {
			return oVChipkaart;
		}

		public void setoVChipkaart(OVChipkaart oVChipkaart) {
			this.oVChipkaart = oVChipkaart;
		}

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		public String getReisproductStatus() {
			return reisproductStatus;
		}

		public void setReisproductStatus(String reisproductStatus) {
			this.reisproductStatus = reisproductStatus;
		}

		public String getLastUpdate() {
			return lastUpdate;
		}

		public void setLastUpdate(String lastUpdate) {
			this.lastUpdate = lastUpdate;
		}
	}


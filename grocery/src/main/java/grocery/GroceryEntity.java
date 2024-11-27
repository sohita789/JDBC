package grocery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


	@Entity
	@Table(name = "grocery_table")

	public class GroceryEntity {

		@Id
		@GenericGenerator(name = "sohita", strategy = "increment")
		@GeneratedValue(generator = "sohita")

		private int id;
		@Column(name = "appName")
		private String appName;
		@Column(name = "productName")
		private String productName;
		@Column(name = "productType")
		private String productType;
		@Column(name = "noOfItems")
		private int noOfItems;
		@Column(name = "quantity")
		private int quantity;
		@Column(name="cost")
		private double cost;
		@Column(name = "location")
		private String location;
		@Column(name="paymentType")
		private String paymentType;
		@Column(name="discount")
		private int discount;
		
		public GroceryEntity() {
			
	}
		
		public GroceryEntity( String appName, String productName, String productType, int noOfItems,
				int quantity, double cost, String location, String paymentType, int discount) {
			super();
			
			this.appName = appName;
			this.productName = productName;
			this.productType = productType;
			this.noOfItems = noOfItems;
			this.quantity = quantity;
			this.cost = cost;
			this.location = location;
			this.paymentType = paymentType;
			this.discount = discount;
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getAppName() {
			return appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductType() {
			return productType;
		}

		public void setProductType(String productType) {
			this.productType = productType;
		}

		public int getNoOfItems() {
			return noOfItems;
		}

		public void setNoOfItems(int noOfItems) {
			this.noOfItems = noOfItems;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			this.cost = cost;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getPaymentType() {
			return paymentType;
		}

		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}

		public int getDiscount() {
			return discount;
		}

		public void setDiscount(int discount) {
			this.discount = discount;
		}
		
	}

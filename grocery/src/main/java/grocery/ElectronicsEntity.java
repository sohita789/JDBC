package grocery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "electronics_table")
public class ElectronicsEntity {
	

		@Id
		@GenericGenerator(name = "sohita", strategy = "increment")
		@GeneratedValue(generator = "sohita")

		private int id;
		@Column(name = "Name")
		private String Name;
		@Column(name = "productName")
		private String productName;
		@Column(name = "color")
		private String color;
		@Column(name = "noOfItems")
		private int noOfItems;
		@Column(name = "quality")
		private String quality;
		@Column(name="cost")
		private double cost;
		@Column(name = "location")
		private String location;
		@Column(name="paymentType")
		private String paymentType;
		@Column(name="discount")
		private int discount;
		
		public ElectronicsEntity() {
			System.out.println("created the ElectronicsEntity with no args");
			
	}

		public ElectronicsEntity(String name, String productName, String color, int noOfItems, String quality,
				double cost, String location, String paymentType, int discount) {
			super();
			Name = name;
			this.productName = productName;
			this.color = color;
			this.noOfItems = noOfItems;
			this.quality = quality;
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

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getNoOfItems() {
			return noOfItems;
		}

		public void setNoOfItems(int noOfItems) {
			this.noOfItems = noOfItems;
		}

		public String getQuality() {
			return quality;
		}

		public void setQuality(String quality) {
			this.quality = quality;
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

	

package dessert;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hoteltable")

public class HotelEntity {
@Id

private int id;
private String customerName;
private String hotelName;
private String dish;
private int quantity;
private double price;
private String location;
private String city;
private String hotelType;
private String specialRecipe;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getHotelName() {
	return hotelName;
}
public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}
public String getDish() {
	return dish;
}
public void setDish(String dish) {
	this.dish = dish;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getHotelType() {
	return hotelType;
}
public void setHotelType(String hotelType) {
	this.hotelType = hotelType;
}
public String getSpecialRecipe() {
	return specialRecipe;
}
public void setSpecialRecipe(String specialRecipe) {
	this.specialRecipe = specialRecipe;
}


}

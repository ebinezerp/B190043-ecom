package dt.b190043.project.model;

import java.util.Set;

public class Product {

	private String productId;
	private String name;
	private String model;
	private Set<Specification> specifications;
	private double price;
	private double discount;
	private int stock;
	private boolean warrenty;
	private int noOfMonthsOfWarrenty;
	private boolean emi;
	private float deliveryCharges;
	private boolean payOnDelivery;
	

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	public Set<Specification> getSpecifications() {
		return specifications;
	}

	public void setSpecifications(Set<Specification> specifications) {
		this.specifications = specifications;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean isWarrenty() {
		return warrenty;
	}

	public void setWarrenty(boolean warrenty) {
		this.warrenty = warrenty;
	}

	public int getNoOfMonthsOfWarrenty() {
		return noOfMonthsOfWarrenty;
	}

	public void setNoOfMonthsOfWarrenty(int noOfMonthsOfWarrenty) {
		this.noOfMonthsOfWarrenty = noOfMonthsOfWarrenty;
	}

	public boolean isEmi() {
		return emi;
	}

	public void setEmi(boolean emi) {
		this.emi = emi;
	}

	public float getDeliveryCharges() {
		return deliveryCharges;
	}

	public void setDeliveryCharges(float deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}

	public boolean isPayOnDelivery() {
		return payOnDelivery;
	}

	public void setPayOnDelivery(boolean payOnDelivery) {
		this.payOnDelivery = payOnDelivery;
	}

}

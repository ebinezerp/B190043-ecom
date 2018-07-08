package dt.b190043.project.model;

import java.util.Set;

public class Laptop {

	private String brand;
	private Set<String> colors;
	private Set<Accessories> accessories;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Set<String> getColors() {
		return colors;
	}

	public void setColors(Set<String> colors) {
		this.colors = colors;
	}

	public Set<Accessories> getAccessories() {
		return accessories;
	}

	public void setAccessories(Set<Accessories> accessories) {
		this.accessories = accessories;
	}

}

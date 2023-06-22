package be.pxl.petstore.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Item {
	@Id
	private String id;
	@ManyToOne
	private Product product;
	private double price;
	private String specification;
	private int quantity;

	public Item() {
		// JPA only
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public int getQuantity() {
		return quantity;
	}

	public void sell(int numberOfItems) {
		this.quantity -= numberOfItems;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

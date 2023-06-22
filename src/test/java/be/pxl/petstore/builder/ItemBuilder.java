package be.pxl.petstore.builder;

import be.pxl.petstore.domain.Item;
import be.pxl.petstore.domain.Product;

public final class ItemBuilder {
	public static final String ITEM_ID = "ITEM-1";
	public static final double ITEM_PRICE = 120.5;
	public static final String ITEM_SPECIFICATION = "Female puppy";
	public static final int ITEM_QUANTITY = 3;
	private String id = ITEM_ID;
	private Product product = ProductBuilder.aProduct().build();
	private double price = ITEM_PRICE;
	private String specification = ITEM_SPECIFICATION;
	private int quantity = ITEM_QUANTITY;

	private ItemBuilder() {}

	public static ItemBuilder anItem() {return new ItemBuilder();}

	public ItemBuilder withId(String id) {
		this.id = id;
		return this;
	}

	public ItemBuilder withProduct(Product product) {
		this.product = product;
		return this;
	}

	public ItemBuilder withPrice(double price) {
		this.price = price;
		return this;
	}

	public ItemBuilder withSpecification(String specification) {
		this.specification = specification;
		return this;
	}

	public ItemBuilder withQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}


	public Item build() {
		Item item = new Item();
		item.setId(id);
		item.setProduct(product);
		item.setPrice(price);
		item.setSpecification(specification);
		item.setQuantity(quantity);
		return item;
	}
}

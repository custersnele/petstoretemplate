package be.pxl.petstore.domain;

public class OrderLine {
	private Long id;
	private Order order;
	private Item item;
	private int quantity;

	public OrderLine() {
		// JPA only
	}

	public OrderLine(Item item, Order order, int quantity) {
		this.item = item;
		this.quantity = quantity;
		this.order = order;
		order.addLine(this);
	}

	public Item getItem() {
		return item;
	}

	public int getQuantity() {
		return quantity;
	}

}

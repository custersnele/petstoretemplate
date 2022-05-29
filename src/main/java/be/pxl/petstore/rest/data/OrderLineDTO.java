package be.pxl.petstore.rest.data;

public class OrderLineDTO {
	private String description;
	private int quantity;

//	public OrderLineDTO(OrderLine orderLine) {
//		this.description = orderLine.getItem().getProduct().getName() + " (" + orderLine.getItem().getSpecification() + ") " + orderLine ;
//		this.quantity = orderLine.getQuantity();
//	}

	public String getDescription() {
		return description;
	}

	public int getQuantity() {
		return quantity;
	}
}

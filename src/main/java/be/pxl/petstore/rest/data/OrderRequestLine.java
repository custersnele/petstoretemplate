package be.pxl.petstore.rest.data;

public class OrderRequestLine {
	private String itemid;
	private int quantity;

	public int getQuantity() {
		return quantity;
	}

	public String getItemid() {
		return itemid;
	}
}

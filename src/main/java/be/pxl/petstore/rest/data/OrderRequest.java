package be.pxl.petstore.rest.data;

import java.util.List;

public class OrderRequest {
	private String name;
	private String email;
	private List<OrderRequestLine> lines;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<OrderRequestLine> getLines() {
		return lines;
	}

	public void setLines(List<OrderRequestLine> lines) {
		this.lines = lines;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

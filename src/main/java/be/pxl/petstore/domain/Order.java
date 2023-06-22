package be.pxl.petstore.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private Long id;
	private String name;
	private String email;
	private List<OrderLine> lines = new ArrayList<>();

	public Order() {
		// JPA only
	}

	public Order(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public List<OrderLine> getLines() {
		return lines;
	}

	public void addLine(OrderLine orderLine) {
		lines.add(orderLine);
	}

	public double getPrice() {
		return lines.stream().mapToDouble(l -> l.getItem().getPrice() * l.getQuantity()).sum();
	}
}

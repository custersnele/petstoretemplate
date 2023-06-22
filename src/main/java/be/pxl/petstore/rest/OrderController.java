package be.pxl.petstore.rest;

import be.pxl.petstore.service.OrderService;

public class OrderController {
	private final OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

}

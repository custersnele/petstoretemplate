package be.pxl.petstore.rest;

import be.pxl.petstore.service.OrderService;

public class OrdersController {
	private final OrderService orderService;

	public OrdersController(OrderService orderService) {
		this.orderService = orderService;
	}

}

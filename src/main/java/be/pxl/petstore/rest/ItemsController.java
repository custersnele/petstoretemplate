package be.pxl.petstore.rest;

import be.pxl.petstore.rest.data.ItemDTO;
import be.pxl.petstore.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemsController {
	private final ItemService itemService;

	public ItemsController(ItemService itemService) {
		this.itemService = itemService;
	}

	@GetMapping
	public List<ItemDTO> findAllItems() {
		return itemService.getAllItems();
	}
}

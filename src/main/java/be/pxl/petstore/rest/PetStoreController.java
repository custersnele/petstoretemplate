package be.pxl.petstore.rest;

import be.pxl.petstore.rest.data.ItemDTO;
import be.pxl.petstore.service.ItemService;
import java.util.List;

public class PetStoreController {
	private final ItemService itemService;

	public PetStoreController(ItemService itemService) {
		this.itemService = itemService;
	}

	public List<ItemDTO> findAllItems() {
		return itemService.getAllItems();
	}

}

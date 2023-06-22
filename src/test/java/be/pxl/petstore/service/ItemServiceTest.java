package be.pxl.petstore.service;

import be.pxl.petstore.builder.ItemBuilder;
import be.pxl.petstore.domain.Item;
import be.pxl.petstore.repository.ItemRepository;

// TODO: add necessary annotations
public class ItemServiceTest {
	private static final String ITEM_ID = "ITEM-007";

	private ItemRepository itemRepository;
	private ItemService itemService;

	private final Item item = ItemBuilder.anItem().withId(ITEM_ID).withQuantity(2).build();

	public void quantityIsUpdatedWhenItemIdIsValid() {
		// TODO: implement this test
	}

	public void throwsNotFoundExceptionWhenUnknownItemId() {
		// TODO: implement this test
	}

}

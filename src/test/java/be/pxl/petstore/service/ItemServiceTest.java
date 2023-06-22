package be.pxl.petstore.service;

import be.pxl.petstore.builder.ItemBuilder;
import be.pxl.petstore.domain.Item;
import be.pxl.petstore.exception.NotFoundException;
import be.pxl.petstore.repository.ItemRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ItemServiceTest {
	private static final String ITEM_ID = "ITEM-007";
	@Mock
	private ItemRepository itemRepository;
	@InjectMocks
	private ItemService itemService;

	private final Item item = ItemBuilder.anItem().withId(ITEM_ID).withQuantity(2).build();

	@Test
	public void quantityIsUpdatedWhenItemIdIsValid() {

		when(itemRepository.findById(ITEM_ID)).thenReturn(Optional.of(item));
		itemService.updateQuantity(ITEM_ID, 8);
		Assertions.assertEquals(8, item.getQuantity());
	}

	@Test
	public void throwsNotFoundExceptionWhenUnknownItemId() {

		when(itemRepository.findById(ITEM_ID)).thenReturn(Optional.empty());
		Assertions.assertThrows(NotFoundException.class, () ->  itemService.updateQuantity(ITEM_ID, 8));
	}

}

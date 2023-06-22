package be.pxl.petstore.service;

import be.pxl.petstore.domain.Item;
import be.pxl.petstore.exception.NotFoundException;
import be.pxl.petstore.repository.ItemRepository;
import be.pxl.petstore.rest.data.ItemDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

	private final ItemRepository itemRepository;

	public ItemService(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	public List<ItemDTO> getAllItems() {
		return itemRepository.findAll().stream().map(ItemDTO::new).collect(Collectors.toList());
	}

	@Transactional
	public void updateQuantity(String itemId, int quantity) {
		Item item = itemRepository.findById(itemId).orElseThrow(() -> new NotFoundException("No item with id [" + itemId + "]"));
		item.setQuantity(quantity);
	}
}

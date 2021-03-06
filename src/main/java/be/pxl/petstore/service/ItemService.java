package be.pxl.petstore.service;

import be.pxl.petstore.repository.ItemRepository;
import be.pxl.petstore.rest.data.ItemDTO;
import org.springframework.stereotype.Service;

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
}

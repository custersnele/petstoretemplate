package be.pxl.petstore.repository;

import be.pxl.petstore.builder.ItemBuilder;
import be.pxl.petstore.builder.ProductBuilder;
import be.pxl.petstore.domain.Category;
import be.pxl.petstore.domain.Item;
import be.pxl.petstore.domain.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ItemRepositoryTest {

	@PersistenceContext
	protected EntityManager entityManager;

	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private ProductRepository productRepository;

	private final Product fish1 = ProductBuilder.aProduct().withId("FISH-1").withCategory(Category.FISH).build();
	private final Product fish2 = ProductBuilder.aProduct().withId("FISH-2").withCategory(Category.FISH).build();
	private final Product dog1 = ProductBuilder.aProduct().withId("DOG-1").withCategory(Category.DOGS).build();
	private final Item item1 = ItemBuilder.anItem().withId("ITEM-1").withProduct(fish1).build();
	private final Item item2 = ItemBuilder.anItem().withId("ITEM-2").withProduct(fish2).build();
	private final Item item3 = ItemBuilder.anItem().withId("ITEM-3").withProduct(dog1).build();
	private final Item item4 = ItemBuilder.anItem().withId("ITEM-4").withProduct(fish2).build();

	@BeforeEach
	public void init() {
		productRepository.save(fish1);
		productRepository.save(fish2);
		productRepository.save(dog1);
		itemRepository.save(item1);
		itemRepository.save(item2);
		itemRepository.save(item3);
		itemRepository.save(item4);
		entityManager.flush();
		entityManager.clear();
	}


}

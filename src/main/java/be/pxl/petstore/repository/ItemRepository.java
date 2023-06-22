package be.pxl.petstore.repository;

import be.pxl.petstore.domain.Category;
import be.pxl.petstore.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {
}

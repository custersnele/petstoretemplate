package be.pxl.petstore.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class InventoryOutOfStockException extends RuntimeException {

	public InventoryOutOfStockException(String message) {
		super(message);
	}
}

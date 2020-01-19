package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.*;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	private Map<Product,Integer> products = new HashMap<>();

	public void addProduct(Product product) {
		this.products.put(product,1);
	}

	public void addProduct(Product product, Integer quantity) {
		this.products.put(product,quantity);
	}

	public BigDecimal getNetPrice() {
		BigDecimal netPrice = 0 ;
		for (Product product : products.keySet())
		{
			netPrice = netPrice.add(product.getPrice()); 
		}

		return BigDecimal.ZERO;
	}

	public BigDecimal getTax() {
		return BigDecimal.ZERO;
	}

	public BigDecimal getTotal() {
		return BigDecimal.ZERO;
	}
}

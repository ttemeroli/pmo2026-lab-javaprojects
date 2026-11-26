package it.unibo.oop.jcf.ex3;

import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse
{
	private Set<Product> product;
	
	public WarehouseImpl()
	{
		product = new LinkedHashSet<>();
	}
	
	@Override
	public void addProduct(Product p) 
	{
		this.product.add(p);
	}

	@Override
	public Set<String> allNames() 
	{
		
		Set<String> names = new LinkedHashSet<>();
		for(Product p : this.product)
			names.add(p.getName());
		
		return names;
	}

	@Override
	public Set<Product> allProducts() 
	{
		/* Alloco un nuovo oggetto, questo è il costruttore di copia */
		return new LinkedHashSet<>(this.product);
	}

	@Override
	public boolean containsProduct(Product p) 
	{
		return p != null && this.product.contains(p);
	}

	@Override
	public double getQuantity(String name) 
	{
		double quantity = 0.0;
		
		for(Product p : product)
			if(p.getName() == name)
				quantity = p.getQuantity();
		
		return quantity;
	}

}

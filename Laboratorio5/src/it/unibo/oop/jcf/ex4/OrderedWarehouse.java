package it.unibo.oop.jcf.ex4;

import java.util.Set;
import java.util.TreeSet;

import it.unibo.oop.jcf.ex3.WarehouseImpl;
import it.unibo.oop.jcf.ex3.Product;

public class OrderedWarehouse extends WarehouseImpl
{
	@Override
    public Set<Product> allProducts() 
	{
        return new TreeSet<>(super.allProducts());
    }
}

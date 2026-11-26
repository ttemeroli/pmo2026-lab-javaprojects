package it.unibo.oop.jcf.ex4;

import it.unibo.oop.jcf.ex3.Product;
import it.unibo.oop.jcf.ex3.ProductImpl;

public class ComparableProduct extends ProductImpl implements Comparable<Product> 
{

    public ComparableProduct(final String name, final int quantity) 
    {
        super(name, quantity);
    }

    @Override
    public int compareTo(final Product other) 
    {
        return this.getName().compareTo(other.getName());
    }
}

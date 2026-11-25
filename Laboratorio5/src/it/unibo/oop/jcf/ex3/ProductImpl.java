package it.unibo.oop.jcf.ex3;

import java.util.Objects;

public class ProductImpl implements Product
{
	private String name;
	private double quantity;
	
	public ProductImpl(final String name, final double quantity) 
	{
		this.name = name;
		this.quantity = quantity;
	}
	
	@Override
	public String getName() {
		
		return this.name;
	}

	@Override
	public double getQuantity() {
		
		return this.quantity;
	}
	
	@Override
	public void hasCode()
	{
		
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hashCode(this.name);
		
	}
	
	@Override
    public boolean equals(final Object obj) 
	{
		
		if (this == obj)
            return true;
        
        if (!(obj instanceof Product other)) 
            return false;
        
        return Objects.equals(this.name, other.getName());
    }

	@Override
	public String toString() {
		return "ProductImpl [name=" + this.name + ", quantity=" + this.quantity + "]";
	}
}

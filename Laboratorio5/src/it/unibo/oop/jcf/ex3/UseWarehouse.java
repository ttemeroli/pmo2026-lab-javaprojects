package it.unibo.oop.jcf.ex3;

import java.util.LinkedHashSet;
import java.util.Set;

public final class UseWarehouse 
{

    
    public static void main(final String[] args) 
    {
    	/*
         * Implementa le classi:
         *
         * 1) WarehouseImpl, che implementa Warehouse. Questa classe deve utilizzare internamente
         * un java.util.LinkedHashSet. A differenza di HashSet, l'ordine di iterazione
         * di LinkedHashSet è prevedibile e riproducibile, anche quando si utilizzano oggetti
         * che non implementano un metodo hashCode personalizzato.
         * Inoltre, LinkedHashSet e HashSet offrono prestazioni simili:
         * https://www.artima.com/weblogs/viewpost.jsp?thread=122295
         *
         * 2) ProductImpl, che implementa Product. Tieni presente che due prodotti sono considerati
         * identici se hanno lo stesso nome.
         *
         * Leggi MOLTO attentamente i commenti presenti nelle interfacce implementate
         * e utilizzali come riferimento per eseguire i test.
         */

        final Product p1 = new ProductImpl("Tavolo", 1);
        final Product p2 = new ProductImpl("Forchetta", 2);
        final Product p3 = new ProductImpl("Sedia", 2);

        final Warehouse w = new WarehouseImpl();
        w.addProduct(p3);
        w.addProduct(p1);
        w.addProduct(p2);

        System.out.println("Nomi: " + w.allNames());
        System.out.println(w.allProducts());

        //Changes to the returned set should not affect the warehouse
//        final var modifiedProductSet = w.allProducts();
//        modifiedProductSet.remove(p1);
        
        
        final Set<Product> modifiedProductSet = new LinkedHashSet<>(w.allProducts());
//        final Set<Product> modifiedProductSet = w.allProducts(); //w.allProduct(); ritorna un Set<Product>
        modifiedProductSet.remove(p1);
        

        System.out.println("Nomi: " + w.allNames());
        System.out.println(w.allProducts());
        System.out.println(modifiedProductSet);

    }

}

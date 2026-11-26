package it.unibo.oop.jcf.ex4;

import java.util.Set;

import it.unibo.oop.jcf.ex3.Product;


public final class UseWarehouse 
{

   
    public static void main(final String[] args) 
    {
    	/*
         * Fornisci una soluzione diversa rispetto all'esercizio precedente implementando
         * due classi: ComparableProduct e OrderedWarehouse. Le classi dell'esercizio precedente
         * possono essere estese e riutilizzate, ma non modificate.
         *
         * La nuova soluzione deve rispettare questi nuovi requisiti:
         *
         * 1) allProducts() restituisce i prodotti ordinati lessicograficamente. Preferisci
         * soluzioni che riutilizzano il codice esistente.
         *
         * 2) L'implementazione di Product deve implementare Comparable<Product>.
         */
    	
    	final Product p1 = new ComparableProduct("Arco", 1);
        final Product p2 = new ComparableProduct("Forchetta", 2);
        final Product p3 = new ComparableProduct("Sedia", 2);

        final OrderedWarehouse w = new OrderedWarehouse();

        w.addProduct(p3);
        w.addProduct(p1);
        w.addProduct(p2);

        System.out.println("Nomi: " + w.allNames());
        System.out.println("PRODOTTI ORDINATI:\n" + w.allProducts());

        // Le modifiche al Set restituito non modificano il magazzino
        final Set<Product> modifiedProductSet = w.allProducts();

        modifiedProductSet.remove(p1);

        System.out.println("Nomi: " + w.allNames());
        System.out.println(w.allProducts());
        System.out.println("PRODOTTI MODIFICATI ORDINATI:\n" + modifiedProductSet);
    }

}

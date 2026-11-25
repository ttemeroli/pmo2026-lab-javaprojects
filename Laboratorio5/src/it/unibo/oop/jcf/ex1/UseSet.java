package it.unibo.oop.jcf.ex1;

import java.util.*;



/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet 
{
    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) 
    {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	Set<String> set = new TreeSet<>();
    	
    	for (int i = 0; i < 20; i++)
    		set.add(Integer.toString(i));
    	
    	/* Questa Struttura Dati ordina gli elementi secondo un ordine lessicografico o alfabetico*/
    	System.out.println("Dimensione: " + set.size());
    	System.out.println(set);
    	
    	
    	//set.removeIf(i -> Integer.parseInt(i) % 3 == 0);
    	
    	Iterator<String> iterator = set.iterator();

    	while (iterator.hasNext()) 
    	{
    	    String i = iterator.next();
    	    int k = Integer.parseInt(i);
    	    
    	    if (k % 3 == 0) {
    	        iterator.remove(); 
    	    }
    	}
    	
    	System.out.println("\nDimensione: " + set.size());
    	System.out.print("[");
    	for(String i : set)
    		System.out.print(i + ", ");
    	System.out.println("]");
    
    	
    	boolean hasAllEven = hasAllEven(set);
    	String s = (hasAllEven) ? "Gli elementi sono tutti pari": "Elementi pari e dispari";
    	System.out.println(s);
    	
    }
    
    private static boolean hasAllEven(Set<String> set)
    {
    	/* La variabile iterator è meglio ricrearla */
    	Iterator<String> iterator = set.iterator();
    	int counter = 0;
    	
    	while (iterator.hasNext()) 
    	{
    	    String i = iterator.next();
    	    int k = Integer.parseInt(i);
    	    
    	    if (k % 2 == 0)
    	        counter++;
    	}
    	return (counter == set.size()) ? true : false;
    }
}

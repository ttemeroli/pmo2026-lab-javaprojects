package it.unibo.oop.jcf.ex2;

import java.util.*;

public final class UseSetWithOrder {

   
	private static final int MAX_STRING = 100;
    
    public static void main(final String[] args) {
        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define
         * a new Comparator in a separate class.
         * 
         * 2) Inserts in the set a hundred strings containing randomly generated
         * numbers (use Math.random())
         * 
         * 3) Prints the set, which must be ordered
         */
    	
    	/* Punto (1) */
    	Set<String> set = new TreeSet<>(new Element());
    	/* public TreeSet(Comparator<? super E> comparator) 
    	 * Dove: possiamo inserire nel costruttore una classe che implememta Comparetor quindi Element
    	 * 		 <? super E> ci dice che la E è <String>*/
    	
//    	for (int i = 0; i <= UseSetWithOrder.MAX_STRING; i++)
//    	{
//    		String s = Integer.toString((int)(Math.random() * 10000));
//    		set.add(s);
//    	}
    	
    	while (set.size() < UseSetWithOrder.MAX_STRING)
    	{
    		String s = Integer.toString((int)(Math.random() * 10000));
    		set.add(s);
    	}
    	
    	System.out.println(set + "\n"+ set.size() + "");
    }
}

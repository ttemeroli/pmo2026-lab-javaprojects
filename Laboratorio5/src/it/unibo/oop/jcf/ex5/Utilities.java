package it.unibo.oop.jcf.ex5;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class Utilities 
{

    public static <X> Set<X> setUnion(final Set<? extends X> setA, final Set<? extends X> setB) 
    {
        Set<X> setC = new HashSet<>(setA);
        setC.addAll(setB);
    	
    	return setC;
    }

    
    public static <X> Set<X> setIntersection(final Set<? extends X> setA, final Set<? extends X> setB) 
    {
        Set<X> setC = new HashSet<>(setA);
        setC.retainAll(setB);
    	
        return setC;
    }

    public static <X> Set<X> setSymmetricDifference(final Set<? extends X> setA, final Set<? extends X> setB) 
    {
        return null;
    }

    public static <X> X getRandomElement(final Collection<X> coll) 
    {
        
    	return null;
    }

    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> first, final Collection<Y> second) 
    {
        return null;
    }
}

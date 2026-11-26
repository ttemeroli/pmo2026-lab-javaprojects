package it.unibo.oop.jcf.ex5;

/*
 * A class used to enclose two objects.
 * Important note: when creating real projects, it is much, much, much better
 * to rely on widely used libraries than to write tons of boilerplate code
 * yourself (or copy the code we provide you). Good implementations of mutable
 * and immutable pairs are available in Apache Commons Lang, Apache Commons
 * Math, and Jool (joo-lambda by Jooq).
 */

public final class Pair<X, Y> 
{

    private final X first;
    private final Y second;

    public Pair(final X o1, final Y o2) 
    {
        this.first = o1;
        this.second = o2;
    }

    
    public X getFirst() 
    {
        return this.first;
    }

    
    public Y getSecond() 
    {
        return this.second;
    }

    @Override
    public String toString() 
    {
        return "Pair [first=" + first + ", second=" + second + "]";
    }

    
    public int hashCode() 
    {
        /*
         * Xor of hashes. It is usually a decent hashing method, and it is
         * easier to understand than the auto-generated hashCode() by Eclipse.
         * However, for serious use cases, a good hashing library and algorithm is
         * warmly recommended. For instance, Google Guava provides a number of
         * good and fast hashing algorithms (Murmur 3 is an extremely good
         * solution).
         */
        return first.hashCode() ^ second.hashCode();
    }

    /*
     * Compares this pair to the specified object. The result is true if and
     * only if the argument is not null and is a Pair object containing the same
     * pair of object.
     */
    
    public boolean equals(final Object obj) 
    {
        if (this == obj)
            return true;
        
        if (obj instanceof Pair) 
        {
            final var p = (Pair<?, ?>) obj;
            return areEquals(first, p.first) && areEquals(second, p.second);
        }
        
        return false;
    }

    private static boolean areEquals(final Object o1, final Object o2) 
    {
        return o1 == null ? o2 == null : o1.equals(o2);
    }

}

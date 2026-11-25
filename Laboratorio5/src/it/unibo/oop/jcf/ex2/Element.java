package it.unibo.oop.jcf.ex2;

import java.util.Comparator;

public class Element implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) 
	{
		 int num1 = Integer.parseInt(s1);
	     int num2 = Integer.parseInt(s2);
	     
		return Integer.compare(num1, num2);
	}	
}

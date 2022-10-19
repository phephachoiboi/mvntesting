package com.lightbend.lagom.maven_archetype_lagom_java;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

	public static int add(int a, int b) {
		return a+b;
	}
	
	public static Double divide(int a, int b) {
		return a/b;
	}
	
	public String firstTwo(String str) {
	    if(str.length()<2) {
	        return str;
	    }
	    else {
	        return str.substring(0, 2);
	    }
	}
	
	
}

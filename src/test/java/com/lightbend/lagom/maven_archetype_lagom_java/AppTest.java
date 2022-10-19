package com.lightbend.lagom.maven_archetype_lagom_java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void addTest() {
    	assertEquals(10, App.add(6,4));
    }
    
    @Test
    public void addDivide() {
        assertEquals(1.33, App.divide(4.00, 3.00));
    }
    
}

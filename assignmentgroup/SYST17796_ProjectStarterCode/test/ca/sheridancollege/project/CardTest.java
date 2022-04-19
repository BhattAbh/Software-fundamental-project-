/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Abhishek Bhattarai
 */
public class CardTest {
    
    public CardTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getrank method, of class Card.
     */
    @Test
    public void testGetrank() {
        System.out.println("getrank");
        Card instance = null;
        int expResult = 0;
        int result = instance.getrank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getsuit method, of class Card.
     */
    @Test
    public void testGetsuit() {
        System.out.println("getsuit");
        Card instance = null;
        int expResult = 0;
        int result = instance.getsuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getvalue method, of class Card.
     */
    @Test
    public void testGetvalue() {
        System.out.println("getvalue");
        Card instance = null;
        int expResult = 0;
        int result = instance.getvalue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setvalue method, of class Card.
     */
    @Test
    public void testSetvalue() {
        System.out.println("setvalue");
        int set = 0;
        Card instance = null;
        instance.setvalue(set);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

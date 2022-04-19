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
public class DealerTest {
    
    public DealerTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of showFirst method, of class Dealer.
     */
    @Test
    public void testShowFirst() {
        System.out.println("showFirst");
        Dealer instance = null;
        instance.showFirst();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Hit method, of class Dealer.
     */
    @Test
    public void testHit_Deck() {
        System.out.println("Hit");
        Deck deck = null;
        Dealer instance = null;
        instance.Hit(deck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Hit method, of class Dealer.
     */
    @Test
    public void testHit_0args() { //hit
        System.out.println("HitBad");
        Dealer instance = null;
        boolean expResult = true;
        boolean result = instance.Hit();
        assertEquals(expResult, result);//assertEquals compare expResult and result. match the condition so true return or false is return.
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testHit_0argsBad() { //not hit
        System.out.println("HitBad");
        Dealer instance = null;
        boolean expResult = true;
        boolean result = instance.Hit();
        assertEquals(expResult, result);//assertEquals compare expResult and result. match the condition so true return or false is return.
        // TODO review the generated test code and remove the default call to fail.  
    }
    @Test
    public void testHit_0argsBoundary() { //hit
        System.out.println("HitBoundary");
        Dealer instance = null;
        boolean expResult = true;
        boolean result = instance.Hit();
        assertEquals(expResult, result);//assertEquals compare expResult and result. match the condition so true return or false is return.
        // TODO review the generated test code and remove the default call to fail.
        
    }
    /**
     * Test of has21 method, of class Dealer.
     */
    @Test
    public void testHas21Good() { //=21
        System.out.println("has21");
        Dealer instance = null;
        boolean expResult = true;
        boolean result = instance.has21();
        assertEquals(expResult, result); //assertEquals compare expResult and result. match the condition so true return or false is return.
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testHas21Boundary() { //=21
        System.out.println("has21");
        Dealer instance = null;
        boolean expResult = true;
        boolean result = instance.has21();
        assertEquals(expResult, result); //assertEquals compare expResult and result. match the condition so true return or false is return.
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testHas21Bad() { //<21
        System.out.println("has21");
        Dealer instance = null;
        boolean expResult = false;
        boolean result = instance.has21();
        assertEquals(expResult, result); //assertEquals compare expResult and result. match the condition so true return or false is return.
        // TODO review the generated test code and remove the default call to fail.
        
    }
    /**
     * Test of show method, of class Dealer.
     */
    @Test
    public void testShow() {
        System.out.println("show");
        Dealer instance = null;
        instance.show();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHvalue method, of class Dealer.
     */
    @Test
    public void testGetHvalue() {
        System.out.println("getHvalue");
        Dealer instance = null;
        int expResult = 0;
        int result = instance.getHvalue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bust method, of class Dealer.
     */
    @Test
    public void testBustGood() { // >21
        System.out.println("bustGood");
        int hvalue = 22;
        Dealer instance = null;
        boolean expResult = true;
        boolean result = instance.bust(hvalue);
        assertEquals(expResult, result);  //assertEquals compare expResult and result. match the condition so true return or false is return.
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testBustBoundary() { // =21 
        System.out.println("bustBoundary");
        int hvalue = 21;
        Dealer instance = null;
        boolean expResult = false;
        boolean result = instance.bust(hvalue);
        assertEquals(expResult, result);  //assertEquals compare expResult and result. match the condition so true return or false is return.
        // TODO review the generated test code and remove the default call to fail.    
    }
    
    @Test
    public void testBustBad() { // <21 
        System.out.println("bustBad");
        int hvalue = 20;
        Dealer instance = null;
        boolean expResult = false;
        boolean result = instance.bust(hvalue);
        assertEquals(expResult, result);  //assertEquals compare expResult and result. match the condition so true return or false is return.
        // TODO review the generated test code and remove the default call to fail.    
    }
    /**
     * Test of Turn method, of class Dealer.
     */
    @Test
    public void testTurn() {
        System.out.println("Turn");
        Deck deck = null;
        Dealer instance = null;
        int expResult = 0;
        int result = instance.Turn(deck);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

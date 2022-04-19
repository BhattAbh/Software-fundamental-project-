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
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of draw method, of class Deck.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Deck instance = new Deck();
        Card expResult = null;
        Card result = instance.draw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

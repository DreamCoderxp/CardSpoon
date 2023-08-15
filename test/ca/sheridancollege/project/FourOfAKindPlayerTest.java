/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gurle
 */
public class FourOfAKindPlayerTest {
    
    public FourOfAKindPlayerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addCardToHand method, of class FourOfAKindPlayer.
     */
    @Test
    public void testAddCardToHand() {
        System.out.println("addCardToHand");
        Card card = null;
        FourOfAKindPlayer instance = null;
        instance.addCardToHand(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of discardCard method, of class FourOfAKindPlayer.
     */
    @Test
    public void testDiscardCard() {
        System.out.println("discardCard");
        Card discardedCard = null;
        FourOfAKindPlayer instance = null;
        instance.discardCard(discardedCard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasFourOfAKind method, of class FourOfAKindPlayer.
     */
    @Test
    public void testHasFourOfAKind() {
        System.out.println("hasFourOfAKind");
        FourOfAKindPlayer instance = null;
        boolean expResult = false;
        boolean result = instance.hasFourOfAKind();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHand method, of class FourOfAKindPlayer.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        FourOfAKindPlayer instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

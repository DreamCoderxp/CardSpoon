/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

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
public class FourOfAKindGameTest {
    
    public FourOfAKindGameTest() {
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
     * Test of addPlayer method, of class FourOfAKindGame.
     */
    @Test
    public void testAddPlayer() {
        System.out.println("addPlayer");
        FourOfAKindPlayer player = null;
        FourOfAKindGame instance = null;
        instance.addPlayer(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class FourOfAKindGame.
     */
    @Test
    public void testPlay_Deck() {
        System.out.println("play");
        Deck deck = null;
        FourOfAKindGame instance = null;
        instance.play(deck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of declareWinner method, of class FourOfAKindGame.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        FourOfAKindGame instance = null;
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class FourOfAKindGame.
     */
    @Test
    public void testPlay_0args() {
        System.out.println("play");
        FourOfAKindGame instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author gurle
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * A class representing a deck of cards for the Four of a Kind card game.
 */
public class Deck extends GroupOfCards {

    public Deck() {
        super(52); // A standard deck of cards has 52 cards
        initializeDeck();
        shuffle();
    }

    private void initializeDeck() {
        // Implement the logic to populate the deck with all 52 standard playing cards.
        // You can create the appropriate card objects and add them to the cards list.
    }

    public Card drawCard() {
        // Implement the logic to draw the top card from the deck.
        // Return the drawn card.
        return null;
    }

    public boolean isEmpty() {
        // Implement the logic to check if the deck is empty (no more cards to draw).
        // Return true if the deck is empty, false otherwise.
        return false;
    }
}


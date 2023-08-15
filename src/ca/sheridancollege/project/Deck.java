/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author Gurleen Kaur
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * A class representing a deck of cards for the Four of a Kind card game.
 */
public class Deck {
    private final ArrayList<Card> drawPile = new ArrayList<>();
    private final ArrayList<Card> discardPile = new ArrayList<>();

    public Deck() {
        initializeDeck();
        shuffle();
    }

    private void initializeDeck() {
        for (CardSuit suit : CardSuit.values()) {
            for (CardRank rank : CardRank.values()) {
                Card card = new Card(rank, suit);
                drawPile.add(card);
            }
        }
    }

    public Card drawCard() {
        if (drawPile.isEmpty()) {
            System.out.println("Draw pile is empty.");
            return null;
        }
        return drawPile.remove(drawPile.size() - 1);
    }

    public void addCardToDiscardPile(Card card) {
        discardPile.add(card);
    }

    public boolean isEmpty() {
        return drawPile.isEmpty();
    }

    private void shuffle() {
        Collections.shuffle(drawPile);
    }
}
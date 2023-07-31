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
import java.util.Iterator;

/**
 * A class that represents a player in the Four of a Kind card game.
 * Each player will have a hand of cards and can draw, keep, and discard cards during their turn.
 * The player wins if they have four cards of the same rank (four of a kind).
 * Players can also choose to quit the game at any point.
 * The player class will also have a method to check if they have four of a kind cards.
 * Each player's turn is managed in the FourOfAKindGame class.
 */
public class FourOfAKindPlayer extends Player {

    private ArrayList<Card> hand;

    public FourOfAKindPlayer(String name) {
        super(name);
        hand = new ArrayList<>();
    }

    @Override
    public void play() {
        // The player's turn is managed in the FourOfAKindGame class
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public void discardCard(String discardedCardRank) {
        Iterator<Card> iterator = hand.iterator();
        while (iterator.hasNext()) {
            Card card = iterator.next();
            if (card.getRank().equals(discardedCardRank)) {
                iterator.remove();
                break;
            }
        }
    }

    public boolean hasFourOfAKind() {
        for (int i = 0; i < hand.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < hand.size(); j++) {
                if (hand.get(i).getRank().equals(hand.get(j).getRank())) {
                    count++;
                }
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    @Override
    public void play(Deck deck) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


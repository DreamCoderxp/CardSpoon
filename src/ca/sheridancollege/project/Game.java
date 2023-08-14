/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @modifier Gurleen Kaur
 */
public abstract class Game {

    private final String name;//the title of the game
    private ArrayList<Player> players;// the players of the game

    public Game(String name) {
        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();

public abstract void play(Deck deck);

    /**
     * Method to draw a card from the deck and add it to the player's hand.
     *
     * @param deck the deck of cards to draw from.
     * @return the drawn card.
     */
    protected Card drawCard(Deck deck) {
        Card drawnCard = deck.drawCard();
        System.out.println(getName() + " draws: " + drawnCard);
        return drawnCard;
    }

    /**
     * Method to discard a card from the player's hand.
     *
     * @return the discarded card.
     */
    protected Card discardCard() {
        // Implement discard logic here (e.g., prompting the player to choose a card to discard).
        // Return the discarded card.
        return null;
    }
}

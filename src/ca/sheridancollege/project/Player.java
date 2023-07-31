/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Player {

    private String name; //the unique name for this player

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play();
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
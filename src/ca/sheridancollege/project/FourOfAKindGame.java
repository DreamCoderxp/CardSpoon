/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author gurleen Kaur
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class representing the Four of a Kind card game.
 * It extends the Game class and contains the game logic for playing the Four of a Kind card game.
 */
public class FourOfAKindGame extends Game {

    private final Deck deck;
    private final ArrayList<FourOfAKindPlayer> players;

    public FourOfAKindGame(String name) {
        super(name);
        deck = new Deck();
        players = new ArrayList<>();
    }

    public void addPlayer(FourOfAKindPlayer player) {
        players.add(player);
    }

    @Override
    public void play(Deck deck) {
        // Implement game logic here for Four of a Kind game.
        // This method should handle the overall flow of the game, including dealing cards, player turns, and game end conditions.
    }

    @Override
    public void declareWinner() {
        // Implement declareWinner logic here for Four of a Kind game.
        // This method should determine the winner and display the result at the end of the game.
    }

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

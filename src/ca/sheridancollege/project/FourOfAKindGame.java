/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gurleen Kaur
 */

/**
 * A class representing the Four of a Kind card game.
 * It extends the Game class and contains the game logic for playing the Four of a Kind card game.
 */

public class FourOfAKindGame extends Game {

   private Deck deck = new Deck();
    private final ArrayList<FourOfAKindPlayer> players = new ArrayList<>();

    public FourOfAKindGame(int numPlayers) {
        super("Four of a Kind");
        initializePlayers(numPlayers);
    }

    private void initializePlayers(int numPlayers) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter player " + (i + 1) + " name: ");
            String name = scanner.nextLine();
            players.add(new FourOfAKindPlayer(name));
        }
    }

    @Override
    public void play() {
        dealInitialCards();

        while (!gameOver()) {
            for (FourOfAKindPlayer player : players) {
                performPlayerTurn(player);
                if (player.hasFourOfAKind()) {
                    declareWinner(player);
                    return;
                }
            }
        }
        declareWinner(null);
    }

    private void dealInitialCards() {
        for (FourOfAKindPlayer player : players) {
            for (int i = 0; i < 4; i++) {
                Card drawnCard = deck.drawCard();
                player.addCardToHand(drawnCard);
            }
        }
    }

    private void performPlayerTurn(FourOfAKindPlayer player) {
        System.out.println(player.getName() + "'s turn:");
        Card drawnCard = deck.drawCard();
        player.addCardToHand(drawnCard);
        System.out.println(player.getName() + " draws: " + drawnCard);
        System.out.print(player.getName() + ", do you want to keep the card? (yes/no): ");
        Scanner scanner = new Scanner(System.in);
        String decision = scanner.nextLine();
        if (decision.equalsIgnoreCase("no")) {
            System.out.print(player.getName() + ", which card do you want to discard? (enter card index): ");
            int cardIndex = scanner.nextInt();
            if (cardIndex >= 0 && cardIndex < player.getHand().size()) {
                Card discardedCard = player.getHand().get(cardIndex);
                player.discardCard(discardedCard);
                deck.addCardToDiscardPile(discardedCard);
            }
        }
    }

    private boolean gameOver() {
        return deck.isEmpty();
    }

    private void declareWinner(FourOfAKindPlayer player) {
        if (player != null) {
            System.out.println(player.getName() + " wins! Four of a kind!");
        } else {
            System.out.println("The game is over. No winner.");
        }
    }

    @Override
    public void declareWinner() {
        // Find the player with four of a kind (if any)
        FourOfAKindPlayer winner = null;
        for (FourOfAKindPlayer player : players) {
            if (player.hasFourOfAKind()) {
                winner = player;
                break;
            }
        }

        if (winner != null) {
            System.out.println("The winner is: " + winner.getName() + " with four of a kind!");
        } else {
            System.out.println("No winner. Game over.");
        }
    }

    @Override
    public void play(Deck deck) {
        System.out.println("Playing with a custom deck.");
        this.deck = deck;
        play();
    }
}
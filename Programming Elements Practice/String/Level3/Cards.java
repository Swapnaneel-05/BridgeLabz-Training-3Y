package BridgeLabz.Strings.Level3;

import java.util.Scanner;

public class Cards {
    static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    static String[][] distributeCards(String[] deck, int n, int players) {
        if (n % players != 0) {
            System.out.println("Cards cannot be evenly distributed to " + players + " players.");
            return null;
        }
        int cardsPerPlayer = n / players;
        String[][] distributed = new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                distributed[i][j] = deck[index++];
            }
        }
        return distributed;
    }

    static void printPlayers(String[][] players) {
        if (players == null) return;
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < players[i].length; j++) {
                System.out.print(players[i][j]);
                if (j < players[i].length - 1) System.out.print(", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = initializeDeck(suits, ranks);
        deck = shuffleDeck(deck);

        System.out.print("Enter number of cards to distribute (<= 52): ");
        int n = sc.nextInt();

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        if (n > deck.length) {
            System.out.println("Not enough cards in the deck.");
            sc.close();
            return;
        }

        String[][] distributed = distributeCards(deck, n, players);
        printPlayers(distributed);

        sc.close();
    }
}

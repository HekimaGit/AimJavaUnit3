import java.util.Random;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class Assignment3_2 {

    static String[] cardValues = {
        "Ace",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "10",
        "Jack",
        "Queen",
        "King"
    };

    static String[] cardSymbols = {
      "Spades",
      "Diamonds",
      "Hearts",
      "Clubs", 
    };

    public static class Card {
        private String name;

        public Card() {
            this.name = cardValues[new Random().nextInt(cardValues.length)] + " of " + cardSymbols[new Random().nextInt(cardSymbols.length)];
        }
    }

    public static class Deck {

        private int length = 52;
        private Card[] cards = new Card[length];

        public Card[] shuffleCards() {
            Card[] shuffledCards = new Card[length];
            for (int i = 0; i < length; i++) {

            }
            return shuffledCards;
        }

        public Deck() {
            for (int i = 0; i < length; i++) {
                // Create a new card for each slot
                this.cards[i] = new Card();
            }
        }
    }

    public static void main(String[] args) { 
        // Create card deck 
        Deck deck = new Deck();

        // Turn deck into list
        List<Card> deckList = Arrays.asList(deck.cards);

        // Shuffle deck
        Collections.shuffle(deckList);

        // Format deck back into array
        deckList.toArray(deck.cards);

        // Print newly shuffled deck
        System.out.print("This program creates a deck of cards and shuffles them in a random order.\n\n");
        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i].name + "\n");
        }
        System.out.print("\nGoodbye!");
    }
}

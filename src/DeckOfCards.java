import java.util.Random;

public class DeckOfCards {

    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final Random randomNumbers = new Random();

    public DeckOfCards() {

        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS];   //instantiate the deck array
        currentCard = 0;                    // default null

        for (int count = 0; count < deck.length; count++)       //fill the deck with cards
            deck[count] = new Card(faces[count % 13], suits[count / 13]);     // result 0-12 cards and 0-3
    }
    public void shuffle() {

        currentCard = 0;

        for(int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];        //cannot make swap by two the statements...extra temp
            deck[first] = deck[second];     //elements could be lost temp needed
            deck[second] = temp;
        }
    }
    public Card dealCard() {

        if(currentCard < deck.length)       //currentCard - indicates the index of the next card
            return deck[currentCard++];
        else
            return null;        //deck is empty
    }
}

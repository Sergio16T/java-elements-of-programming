package Classes.Cards;

public class Deck {

    public static int numSuits = 4;
    public static int numRanks = 13;
    public static int numCards = numSuits * numRanks;

    private Card[][] cards;

    public Deck() {
        // 2 dimensional array cards is initialized 
        // i.e.: The array int[][] x = new int[10][20] can store a total of (10*20) = 200 elements.
        // then the multidimensional array is created with nested for loop
        cards = new Card[numSuits][numRanks];
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                cards[suit-1][rank-1] = new Card(rank, suit);
            }
        }
    }

    public Card getCard(int suit, int rank) {
        return cards[suit-1][rank-1];
    }

    public Card[][] getCards() {
        return cards; 
    }
}



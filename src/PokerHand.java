public class PokerHand {
    private char rank;
    private char suit;

    public PokerHand(char rank, char suit) {
        this.rank = rank;
        this.suit = suit;
    }



    public int getRank() {
        return PokerHandEvaluator.rank().getNumericValue();
    }

    @Override
    public String toString() {
        return "" + rank + suit;
    }
}
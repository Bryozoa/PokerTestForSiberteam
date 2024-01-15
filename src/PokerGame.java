import java.util.List;

public abstract class PokerGame implements Comparable<PokerGame> {
    String handString;
    List<PokerHand> cards;

    public PokerGame(String handString, List<PokerHand> cards) {



        this.handString = handString;
        this.cards = cards;
    }

    // Other methods and logic...

    public static void main(String[] args) {

        HandComparator handComparator = new HandComparator();

        // Example usage for creating a PokerHand
        PokerGame pokerHand1 = PokerHandFactory.createPokerHand("KS 2H 5C JD TD");
        PokerGame pokerHand2 = PokerHandFactory.createPokerHand("KS 2H 5C JD TD");

        System.out.println("Comparison result: " + handComparator.compare(pokerHand1, pokerHand2));
    }
}
import java.util.Collections;
import java.util.List;

public class PokerHandFactory {
    public static PokerGame createPokerHand(String handString) {
        List<PokerHand> cards = HandParser.parseHand(handString);
        Collections.sort(cards, (card1, card2) -> card2.getRank() - card1.getRank()); // Sort cards by rank
        return new PokerGame(handString, cards) {
            @Override
            public int compareTo(PokerGame o) {
                return 0;
            }
        };
    }
}
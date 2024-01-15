import java.util.ArrayList;
import java.util.List;

public class HandParser {
    public static List<PokerHand> parseHand(String handString) {
        String[] cardStrings = handString.split(" ");
        List<PokerHand> cards = new ArrayList<>();

        for (String cardString : cardStrings) {
            char rankChar = cardString.charAt(0);
            char suitChar = cardString.charAt(1);
            cards.add(new PokerHand(rankChar, suitChar));
        }

        return cards;
    }
}
public class PokerHandEvaluator {

    static PokerHandRanks rank() {
        if (isStraightFlush()) {
            return PokerHandRanks.STRAIGHT_FLUSH;
        } else if (isFourOfAKind()) {
            return PokerHandRanks.FOUR_OF_A_KIND;
        } else if (isFullHouse()) {
            return PokerHandRanks.FULL_HOUSE;
        } else if (isFlush()) {
            return PokerHandRanks.FLUSH;
        } else if (isStraight()) {
            return PokerHandRanks.STRAIGHT;
        } else if (isThreeOfAKind()) {
            return PokerHandRanks.THREE_OF_A_KIND;
        } else if (isTwoPair()) {
            return PokerHandRanks.TWO_PAIR;
        } else if (isOnePair()) {
            return PokerHandRanks.ONE_PAIR;
        } else {
            return PokerHandRanks.HIGH_CARD;
        }
    }

    private static boolean isOnePair() {
        return Helpers.getCountOfGroupOfASize(this.cardsMap, 2) == 1;
    }

    private static boolean isTwoPair() {
        return Helpers.getCountOfGroupOfASize(this.cardsMap, 2) == 2;
    }

    private static boolean isThreeOfAKind() {
        return Helpers.getCountOfGroupOfASize(this.cardsMap, 3) == 1;
    }

    private static boolean isFullHouse() {
        return isThreeOfAKind() && isOnePair();
    }

    private static boolean isFourOfAKind() {
        return Helpers.getCountOfGroupOfASize(this.cardsMap, 4) == 1;
    }

    private static boolean isStraightFlush() {
        return isStraight() && isFlush();
    }


    private static boolean isStraight() {
        boolean isIncreasing = true;
        for (int index = 0; index < this.getCards().size() - 1; index++) {
            if (Math.abs(this.getCards().get(index).getValue() - this.getCards().get(index + 1).getValue()) != 1) {
                isIncreasing = false;
            }
        }
        return isIncreasing;
    }

    private static boolean isFlush() {
        return this.getCards().stream().collect(groupingBy(PokerGame.Card::getSuit)).size() == 1;
    }

}

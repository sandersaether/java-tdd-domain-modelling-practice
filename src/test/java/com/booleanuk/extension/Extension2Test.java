package com.booleanuk.extension;
import com.booleanuk.Poker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Extension2Test {
    @Test
    public void shouldReturnAnEmptyArray() {
        Poker poker = new Poker();
        String[][] hands = {new String[]{"K", "5"}, new String[]{"3", "7"},  new String[]{"K", "J", "4"}};
        String[] result = poker.winningThreeCardHand(hands);
        Assertions.assertArrayEquals(new String[]{}, result);
    }

    @Test
    public void compareTwoHandsOfThree() {
        Poker poker = new Poker();
        String[][] hands = {new String[]{"5", "5", "3"}, new String[]{"7", "7", "7"}};
        String[] result = poker.winningThreeCardHand(hands);
        Assertions.assertArrayEquals(new String[]{"7", "7", "7"}, result);
    }

    @Test
    public void compareMultipleHandsOfThree() {
        Poker poker = new Poker();
        String[][] hands = {new String[]{"7", "2", "7"}, new String[]{"A", "A", "A"}, new String[]{"5", "5", "3"}};
        String[] result = poker.winningThreeCardHand(hands);
        Assertions.assertArrayEquals(new String[]{"A", "A", "A"}, result);
    }

    @Test
    public void threeOfAKindBeatsTwoOfAKind() {
        Poker poker = new Poker();
        String[][] hands = {new String[]{"7", "2", "7"}, new String[]{"A", "A"}, new String[]{"5", "5", "5"}, new String[]{"4", "5"}};
        String[] result = poker.winningThreeCardHand(hands);
        Assertions.assertArrayEquals(new String[]{"5", "5", "5"}, result);
    }

    @Test
    public void pairsBeatDisparateThreeOfAKind() {
        Poker poker = new Poker();
        String[][] hands = {new String[]{"J", "J"}, new String[]{"9", "9"}, new String[]{"6", "6", "4"}};
        String[] result = poker.winningThreeCardHand(hands);
        Assertions.assertArrayEquals(new String[]{"J", "J"}, result);
    }

    @Test
    public void pairInAThreeCanWin() {
        Poker poker = new Poker();
        String[][] hands = {new String[]{"10", "10", "J"}, new String[]{"9", "9"}, new String[]{"6", "5", "4"}};
        String[] result = poker.winningThreeCardHand(hands);
        Assertions.assertArrayEquals(new String[]{"10", "10", "J"}, result);
    }
}

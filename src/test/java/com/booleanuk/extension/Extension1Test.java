package com.booleanuk.extension;

import com.booleanuk.Poker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Extension1Test {
    @Test
    public void shouldReturnAnEmptyArray() {
        Poker poker = new Poker();
        String[][] hands = {new String[]{"K", "5"}, new String[]{"3", "7"}};
        String[] result = poker.winningPairFromArray(hands);
        Assertions.assertArrayEquals(new String[]{}, result);
    }

    @Test
    public void highestOfTwoPairsWins() {
        Poker poker = new Poker();
        String[][] hands = {new String[]{"K", "K"}, new String[]{"A", "A"}};
        String[] result = poker.winningPairFromArray(hands);
        Assertions.assertArrayEquals(new String[]{"A", "A"}, result);
    }

    @Test
    public void highestPairInListWins() {
        Poker poker = new Poker();
        String[][] hands = {new String[]{"4", "3"}, new String[]{"6", "6"}, new String[]{"7", "7"}, new String[]{"3", "3"}};
        String[] result = poker.winningPairFromArray(hands);
        Assertions.assertArrayEquals(new String[]{"7", "7"}, result);
    }

    @Test
    public void noWinnerFromList() {
        Poker poker = new Poker();
        String[][] hands = {new String[]{"K", "5"}, new String[]{"3", "7"}, new String[]{"4", "3"},
                new String[]{"2", "6"}, new String[]{"K", "7"}, new String[]{"A", "3"}};
        String[] result = poker.winningPairFromArray(hands);
        Assertions.assertArrayEquals(new String[]{}, result);
    }
}
package ru.job4j.puzzle;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class WinTest {

    @Test
    public void whenVerticalWin() {
        int[][] board = {
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
        };
        boolean result = Win.check(board);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHorizontalWin() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        boolean result = Win.check(board);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotWinV() {
        int[][] board = {
                {0, 0, 1, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
        };
        boolean result = Win.check(board);
        Assert.assertFalse(result);
    }

    @Test
    public void whenNotWinL() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 1, 1, 0},
        };
        boolean result = Win.check(board);
        Assert.assertFalse(result);
    }
}
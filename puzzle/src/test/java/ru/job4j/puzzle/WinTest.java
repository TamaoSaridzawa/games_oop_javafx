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
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1},
        };
        boolean res = Win.diagonalChek(board);
        Assert.assertTrue(res);
    }

    @Test
    public void whenHorizontalWin() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
        };
        boolean res = Win.diagonalChek(board);
        Assert.assertTrue(res);
    }

    @Test
    public void whenNotWin1() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0},
        };
        boolean res = Win.diagonalChek(board);
        Assert.assertFalse(res);
    }

    @Test
    public void whenNotWin2() {
        int[][] board = {
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 0},
        };
        boolean res = Win.diagonalChek(board);
        Assert.assertFalse(res);
    }
}
package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = diagonalChek(board);
        return rsl;
    }

    public static boolean diagonalChek(int[][] board) {

        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                int point = i;
                rsl = verticalChek(board, point) || horizontalChek(board, point);
            }
        }
        return rsl;
    }

    public static boolean verticalChek(int[][] board, int column) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean horizontalChek(int[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}

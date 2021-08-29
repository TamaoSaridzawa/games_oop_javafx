package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack((Cell.F5));
        Assert.assertThat(bishopBlack.position(), is(Cell.F5));
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G5);
        Cell[] array = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertThat(bishopBlack.way(Cell.G5), is(array));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void wayException() throws ImpossibleMoveException{
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G3);
        Cell[] array = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertThat(bishopBlack.way(Cell.G5), is(array));
    }

    @Test
    public void isDiagonalTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.B1);
        Assert.assertTrue(bishopBlack.isDiagonal(bishopBlack.position(), Cell.D3));
    }

    @Test
    public void isDiagonalFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.B1);
        Assert.assertFalse(bishopBlack.isDiagonal(bishopBlack.position(), Cell.D7));
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A4);
        Assert.assertThat(bishopBlack.copy(Cell.A4).position(), is(bishopBlack.position()));
    }
}
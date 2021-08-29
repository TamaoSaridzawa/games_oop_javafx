package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Ignore
    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);

    }
    @Test(expected = FigureNotFoundException.class)
    public void moveFigure()throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.move(Cell.A1, Cell.B2);
    }

    @Test(expected = OccupiedCellException.class)
    public void moveOccupied()throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A4));
        logic.add(new BishopBlack(Cell.C2));
        logic.move(Cell.A4, Cell.D1);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void moveImpossible() throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.D3));
        logic.move(Cell.D3, Cell.D6);
    }
}
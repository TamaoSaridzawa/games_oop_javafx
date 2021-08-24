package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not move by diagonal from %s to %s", position, dest)
            );
        }
        int size = position.getX() > dest.getX() ? position.getX() - dest.getX() :
                dest.getX() - position.getX();
        Cell[] steps = new Cell[size];
        int x = position.getX();
        int y = position.getY();
        for (int i = 0; i < size; i++) {
            x = x - dest.getX() < 0 ? x + 1 : x - 1;
            y = y - dest.getY() < 0 ? y + 1: y - 1;
            steps[i] = Cell.findBy(x, y);
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        if (source.getX() > dest.getX() && source.getY() < dest.getY()
        || source.getX() < dest.getX() && source.getY() > dest.getY()) {
            if (source.getX() - dest.getX() == dest.getY() - source.getY()) {
                return true;
            }
        } else {
            if (source.getX() - dest.getX() == source.getY() - dest.getY()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}

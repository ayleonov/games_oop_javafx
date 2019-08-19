package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        int size = dest.x > source.x ? (dest.x - source.x + 1) : (source.x - dest.x + 1);
        Cell[] steps = new Cell[size];

        int deltaX = dest.x - source.x > 0 ? 1 : -1;
        int deltaY = dest.y - source.y > 0 ? 1 : -1;
        for (int index = 0; index < size; index++) {
            int stepX = source.x + deltaX * index;
            int stepY = source.y + deltaY * index;

            for (Cell c : Cell.values()) {
                if ((c.x == stepX) && (c.y == stepY)) {
                    steps[index] = c;
                    break;
                }
            }
        }

        return steps;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        boolean res = true;
        if (source.x == dest.x || source.y == dest.y){
            res = false;
        }
        return res;
    }



}

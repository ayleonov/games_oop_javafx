package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;



import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class BishopBlackTest {
    @Test
    public void whenCreateFigureStandsOnPosition() {
        BishopBlack figure = new BishopBlack(Cell.C8);
        Cell position = figure.position();
        assertThat(position, is(Cell.C8));
    }

    @Test
    public void whenCopyNewObjectOnCorrectPosition() {
        BishopBlack figure = new BishopBlack(Cell.C8);
        BishopBlack figureCopy = (BishopBlack) figure.copy(Cell.F8);
        Cell positionCopy = figureCopy.position();
        assertThat(positionCopy, is(Cell.F8));
    }

    @Test
    public void whenTestingWay() {
        BishopBlack figure = new BishopBlack(Cell.C1);
        Cell[] figureWay = figure.way(Cell.C1, Cell.G5);
        Cell[] mock = {Cell.C1, Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(figureWay, is(mock));
    }

    @Test
    public void whenTryPassInDiagonal() {
        BishopBlack figure = new BishopBlack(Cell.C1);
        boolean testLine =  figure.isDiagonal(Cell.C1,Cell.D2);

        assertTrue(testLine == true);
    }

    @Test
    public void whenTryPassNotInDiagonal() {
        BishopBlack figure = new BishopBlack(Cell.C1);
        boolean testLine =  figure.isDiagonal(Cell.C1,Cell.D1);

        assertTrue(testLine == false);
    }

}


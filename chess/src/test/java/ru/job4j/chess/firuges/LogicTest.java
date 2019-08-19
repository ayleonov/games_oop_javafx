package ru.job4j.chess.firuges;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {
    @Test
    public void when1(){
        Logic logic = new Logic();
        Cell source = Cell.C1;
        Cell dest = Cell.E3;
        BishopBlack figureFirst = new BishopBlack(Cell.C1);
        BishopBlack figureSecond = new BishopBlack(Cell.E3);
        Figure[] figures = new Figure[32];
        figures[0] = figureFirst;
        figures[1] = figureSecond;

        boolean figureMove = logic.move(source, dest);

        assertThat(figureMove, is(true));
    }

}

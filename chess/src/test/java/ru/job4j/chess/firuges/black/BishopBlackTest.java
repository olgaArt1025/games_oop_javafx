package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest extends TestCase {

    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Assert.assertThat(bishopBlack.position(), Matchers.is(Cell.F8));
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Figure figure = bishopBlack.copy(Cell.F8);
        Assert.assertThat(figure.position(), Matchers.is(Cell.F8));
    }

    @Test
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] way = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertThat(way, Matchers.is(bishopBlack.way(Cell.G5)));
    }
}

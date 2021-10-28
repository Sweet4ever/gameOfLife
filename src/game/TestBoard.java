package game;

import org.junit.*;

import java.util.ArrayList;

public class TestBoard {

    private ArrayList<Cell> cells = new ArrayList<Cell>();

    @Before
    public void init() {
        Cell c1 = new Cell(1, 1);
        Cell c2 = new Cell(2, 1);
        cells.add(c1);
        cells.add(c2);
    }
    @Test
    public void testPrintXAxisOnStartWithMultipleCells(){
        int length = 5;
        Assert.assertEquals(". * * . . ", Board.printXAxisOnStart(length, cells));
    }
    @Test
    public void testPrintXAxisOnStartWithOutCells(){
        int length = 5;
        Assert.assertEquals(". . . . . ", Board.printXAxisOnStart(length, new ArrayList<>()));
    }
    @Test
    public void testPrintXAxisOnStartWithLength0(){
        int length = 0;
        Assert.assertEquals("", Board.printXAxisOnStart(length, cells));
    }
    @Test
    public void testPrintXAxisOnStartWithNegativeLength(){
        int length = -1;
        Assert.assertEquals("Please use a number larger than 0.", Board.printXAxisOnStart(length, cells));
    }
}

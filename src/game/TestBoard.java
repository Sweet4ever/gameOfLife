package game;

import org.junit.*;

public class TestBoard {

    @Test
    public void testPrintXAxisOnStartWithCell(){
        Cell startCell = new Cell(1,1);
        int length = 5;
        Assert.assertEquals(". * . . . ", Board.printXAxisOnStart(length, startCell, true));
    }
    @Test
    public void testPrintXAxisOnStartWithOutCell(){
        Cell startCell = new Cell(1,1);
        int length = 5;
        Assert.assertEquals(". . . . . ", Board.printXAxisOnStart(length, startCell, false));
    }


}

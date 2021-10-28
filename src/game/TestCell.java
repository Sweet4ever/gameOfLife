package game;

import org.junit.*;

import java.util.ArrayList;

public class TestCell {

    public ArrayList<Cell> neighbours = new ArrayList<>();
    public ArrayList<Cell> cells = new ArrayList<>();

    @Test
    public void TestCellHasOneNeighboursOnSameRow(){
        Cell cell1 = new Cell(2,1);
        Cell cell2 = new Cell(1,1);
        neighbours.add(cell2);
        cells.add(cell2);
        cells.add(cell1);
        Assert.assertEquals(neighbours, cell1.hasNeighbours(cell1, cells));
    }
    @Test
    public void TestCellHasManyNeighboursOnSameRow(){
        Cell cell1 = new Cell(2,1);
        Cell cell2 = new Cell(1,1);
        Cell cell3 = new Cell(3,1);
        neighbours.add(cell2);
        neighbours.add(cell3);
        cells.add(cell2);
        cells.add(cell1);
        cells.add(cell3);
        Assert.assertEquals(neighbours, cell1.hasNeighbours(cell1, cells));
    }
    @Test
    public void TestCellHasManyNeighboursOnDifferentRows(){
        Cell cell1 = new Cell(2,2);
        Cell cell2 = new Cell(2,1);
        Cell cell3 = new Cell(3,3);
        neighbours.add(cell2);
        neighbours.add(cell3);
        cells.add(cell2);
        cells.add(cell1);
        cells.add(cell3);
        Assert.assertEquals(neighbours, cell1.hasNeighbours(cell1, cells));
    }
    @Test
    public void TestCellHasOneNeighbourOnDifferentRow(){
        Cell cell1 = new Cell(2,1);
        Cell cell2 = new Cell(1,2);
        neighbours.add(cell2);
        cells.add(cell2);
        cells.add(cell1);
        Assert.assertEquals(neighbours, cell1.hasNeighbours(cell1, cells));
    }
    @Test
    public void TestCellHasZeroNeighbours(){
        Cell cell1 = new Cell(2,1);
        Cell cell2 = new Cell(1,3);
        cells.add(cell2);
        cells.add(cell1);
        Assert.assertEquals(neighbours, cell1.hasNeighbours(cell1, cells));
    }


}

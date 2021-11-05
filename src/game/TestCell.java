package game;

import org.junit.*;

import java.util.ArrayList;

public class TestCell {

    public ArrayList<Cell> neighbours = new ArrayList<>();
    public ArrayList<Cell> cells = new ArrayList<>();
    int xSize = 5;
    int ySize = 5;

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

    @Test
    public void TestCellWithOneNeighbour(){
        Cell cell1 = new Cell(2,1);
        Cell cell2 = new Cell(1,1);
        cells.add(cell2);
        cells.add(cell1);
        Assert.assertTrue(Cell.beKilled(cell1, cells, 3, 3));
    }
    @Test
    public void TestCellWithTwoNeighbours(){
        Cell cell1 = new Cell(2,1);
        Cell cell2 = new Cell(1,1);
        Cell cell3 = new Cell(3,1);
        cells.add(cell2);
        cells.add(cell1);
        cells.add(cell3);
        Assert.assertFalse(Cell.beKilled(cell1, cells, 3,3));
    }
    @Test
    public void TestCellWithThreeNeighbours(){
        Cell cell1 = new Cell(2,1);
        Cell cell2 = new Cell(1,1);
        Cell cell3 = new Cell(3,1);
        Cell cell4 = new Cell(2,2);
        cells.add(cell2);
        cells.add(cell1);
        cells.add(cell3);
        cells.add(cell4);
        Assert.assertFalse(Cell.beKilled(cell1, cells,3,3));
    }
    @Test
    public void TestCellWithFourNeighbours(){
        Cell cell1 = new Cell(2,1);
        Cell cell2 = new Cell(1,1);
        Cell cell3 = new Cell(3,1);
        Cell cell4 = new Cell(2,2);
        Cell cell5 = new Cell(3,2);
        cells.add(cell2);
        cells.add(cell1);
        cells.add(cell3);
        cells.add(cell4);
        cells.add(cell5);
        Assert.assertTrue(Cell.beKilled(cell1, cells,3,3));
    }

    @Test
    public void TestUpdateCell(){
        Cell cell1 = new Cell(2,0);
        Cell cell2 = new Cell(1,0);
        Cell cell3 = new Cell(3,0);
        Cell cell4 = new Cell(2,1);
        cells.add(cell1);
        cells.add(cell2);
        cells.add(cell3);
        ArrayList<Cell> other = new ArrayList<>();
        other.add(cell1);
        other.add(cell2);
        other.add(cell3);
        other.add(cell4);
        Assert.assertEquals(other.size(), (Cell.update(cells, xSize, ySize).size()+1));
    }
}

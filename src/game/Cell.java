package game;

import java.util.ArrayList;

public class Cell {
    int x;
    int y;
    public Cell(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ArrayList<Cell> hasNeighbours(Cell cell, ArrayList<Cell> cells){
        ArrayList<Cell> neighbours = new ArrayList<>();
        ArrayList<Cell> copy = (ArrayList<Cell>) cells.clone();
        copy.remove(cell);

        for(Cell cl: copy) {
            if((cell.getX()-1 == cl.getX() || cell.getX()+1 == cl.getX() || cell.getX() == cl.getX()) &&
              (cell.getY()-1 == cl.getY() || cell.getY()+1 == cl.getY() || cell.getY() == cl.getY())){
                neighbours.add(cl);
            }
        }

        return neighbours;
    }

    public static boolean beKilled(Cell cell, ArrayList<Cell> cells, int xSize, int ySize){
        ArrayList<Cell> neighbours = cell.hasNeighbours(cell, cells);
        if(neighbours.size() <2){
            return true;
        }
        else if(neighbours.size() > 3){
            return true;
        }
        else if(cell.getX() == 0){
            return true;
        }
        else if(cell.getY() == 0){
            return true;
        }
        else if(cell.getX() == xSize){
            return true;
        }
        else return cell.getY() == ySize;
    }

    public static ArrayList<Cell> update(ArrayList<Cell> cells, int xSize, int ySize){
        ArrayList<Cell> newCells = new ArrayList<>();
        for (int i = 0; i < ySize; i++) {
            for (int j = 0; j < xSize; j++) {
                Cell cell = new Cell(j, i);
                if(cell.hasNeighbours(cell, cells).size() >3){
                    newCells.add(cell);
                }
            }
        }
        newCells.addAll(cells);
        return newCells;
    }
}

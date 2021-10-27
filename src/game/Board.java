package game;

import java.util.ArrayList;

public class Board {
    public static void main(String[] args) {

    }

    public static String printXAxisOnStart(int length, ArrayList<Cell> cells){
        String xAxis = "";
        ArrayList<Integer> x = new ArrayList<>();
        for (Cell cell: cells) {
            x.add(cell.getX());
        }
        for (int i = 0; i < length; i++) {
            if(x.contains(i)){
                xAxis = xAxis.concat("* ");
            }else {
                xAxis = xAxis.concat(". ");
            }
        }
        return xAxis;
    }

    public static void PrintBoard(int xSize, int ySize, ArrayList<Cell> cells){
        String xAxis ="";
        for (int i = 0; i < ySize; i++) {
            ArrayList<Cell> cellOnYAxis = new ArrayList<>();
            for(Cell cell: cells) {
                if(cell.getY() == i){
                    cellOnYAxis.add(cell);
                }
            }
            for(int j= 0; j < xSize; j++){
                xAxis = printXAxisOnStart(xSize, cellOnYAxis);
            }
            System.out.println(xAxis);
        }
    }

    public static void Update(Cell[] cells){
        System.out.println(cells);
    }
}

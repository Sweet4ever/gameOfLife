package game;

import java.util.ArrayList;

public class Board {
    public static void main(String[] args) {

    }

    public static String printXAxisOnStart(int length, ArrayList<Cell> cells){
        if(length <0){return "Please use a number larger than 0.";}
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
        ArrayList<String> xAxis = new ArrayList<>();
        for (int i = 0; i < ySize; i++) {
            ArrayList<Cell> cellOnYAxis = new ArrayList<>();
            for(Cell cell: cells) {
                if(cell.getY() == i){
                    cellOnYAxis.add(cell);
                }
            }
            xAxis.add(printXAxisOnStart(xSize, cellOnYAxis));
        }
        for (String row: xAxis) {
            System.out.println(row);
        }
        System.out.println("<------------->");
    }
}

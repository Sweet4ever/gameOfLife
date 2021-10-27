package game;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cell> cells = new ArrayList<Cell>();

        System.out.println("Välj hur stor banan ska vara i bredd: ");
        int xSize = scanner.nextInt();
        System.out.println("Välj hur stor banan ska vara i höjd: ");
        int ySize = scanner.nextInt();

        for (int i = 0; i < xSize; i++) {
            int x = ((int) (Math.random() * xSize));
            int y = ((int) (Math.random() * ySize));

            Cell cell = new Cell(x,y);
            cells.add(cell);
        }
        /*
        for (Cell cell: cells) {
            System.out.println("cell");
           System.out.println(cell.getX());
            System.out.println(cell.getY());
        }
        */

        Board.PrintBoard(xSize,ySize, cells);

    }
}

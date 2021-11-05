package game;

import java.lang.Math;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Cell> cells = new ArrayList<>();

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
        int i = 1;
        System.out.println("Round: Start");
        Board.PrintBoard(xSize, ySize, cells);
        while(cells.size() != 0){
            cells = Cell.update(cells, xSize, ySize);
            ArrayList <Cell> living = new ArrayList<>();
            for(Cell cell: cells) {
                if(!Cell.beKilled(cell, cells, xSize, ySize)){
                    living.add(cell);
                }
            }
            cells = living;
            System.out.println("Round: " +i);
            Board.PrintBoard(xSize,ySize, cells);
            i = i+1;
        }
    }
}

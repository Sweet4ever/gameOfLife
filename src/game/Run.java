package game;

import java.lang.Math;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();

        System.out.println("Välj hur stor banan ska vara i bredd: ");
        int xSize = scanner.nextInt();
        System.out.println("Välj hur stor banan ska vara i höjd: ");
        int ySize = scanner.nextInt();

        int x = ((int) (Math.random() * xSize));
        int y = ((int) (Math.random() * ySize));

        Cell cell = new Cell(x,y);

        board.PrintBoard(xSize,ySize, cell);

    }
}

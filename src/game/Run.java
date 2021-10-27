package game;

import java.util.Random;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        Random random = new Random();

        System.out.println("Välj hur stor banan ska vara i bredd: ");
        String xSize = scanner.nextLine();
        System.out.println("Välj hur stor banan ska vara i höjd: ");
        String ySize = scanner.nextLine();

        int x = random.nextInt(Integer.parseInt(xSize) - 0) + 0;
        int y = random.nextInt(Integer.parseInt(ySize) - 0) + 0;

        Cell cell = new Cell(x,y);

        board.PrintBoard(xSize,ySize, cell);
    }
}

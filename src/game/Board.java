package game;

public class Board {
    public static void main(String[] args) {

    }

    public static void PrintBoard(String xSize, String ySize){
        String xAxis = "";
        for (int i = 0; i < Integer.parseInt(xSize); i++) {
            xAxis += ". ";
        }
        for (int i = 0; i < Integer.parseInt(ySize); i++) {
            System.out.println(xAxis);
        }
    }
    public static void Update(Cell[] cells){
        System.out.println(cells);
    }
}

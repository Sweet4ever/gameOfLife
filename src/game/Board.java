package game;

public class Board {
    public static void main(String[] args) {

    }

    public static String printXAxisOnStart(int length, Cell startCell, boolean y){
        String xAxis = "";
        for (int i = 0; i < length; i++) {
            if(i == startCell.getX() && y){
                xAxis = xAxis.concat("* ");
            }else {
                xAxis = xAxis.concat(". ");
            }
        }
        return xAxis;
    }

    public static void PrintBoard(int xSize, int ySize, Cell startCell){
        String xAxis;
        for (int i = 0; i < ySize; i++) {
            if(i == startCell.getY()){
                xAxis = printXAxisOnStart(xSize, startCell, true);
            }else{
                xAxis = printXAxisOnStart(xSize, startCell, false);
            }
            System.out.println(xAxis);
        }
    }

    public static void Update(Cell[] cells){
        System.out.println(cells);
    }
}

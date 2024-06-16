package org.rafs.shootergame.Utils;

public class GridConverters {

    public static int rowToY(int rows, int PADDING, int cellSize) {
        return PADDING + (rows * cellSize);
    }

    public static int colToX(int cols, int PADDING, int cellSize) {
        return PADDING + (cols * cellSize);
    }

    public static int xToCol(int width, int PADDING, int cellSize) {
        return PADDING + (width / cellSize);
    }

    public static int yToRows(int height, int PADDING, int cellSize) {return  PADDING + (height / cellSize);}
}

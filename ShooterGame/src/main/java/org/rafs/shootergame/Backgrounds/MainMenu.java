package org.rafs.shootergame.Backgrounds;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import static org.rafs.shootergame.Utils.GridConverters.colToX;
import static org.rafs.shootergame.Utils.GridConverters.rowToY;

public class MainMenu {


    int PADDING = 10;

    int width;
    int height;
    int columns;
    int rows;

    Rectangle grid;
    Rectangle startButton;
    Picture background;

    Picture ground;
    Picture clouds;

    static int cellSize = 50;

    public MainMenu(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;
        width = colToX(columns, PADDING,cellSize);
        height = rowToY(rows, PADDING,cellSize);

    }

    public void init(){

        grid = new Rectangle(PADDING, PADDING, width-PADDING, height-PADDING);
        grid.draw();
        grid.setColor(Color.BLACK);
        grid.fill();

        startButton = new Rectangle(150, 200, 200,50 );
        startButton.draw();
        startButton.setColor(Color.YELLOW);
        startButton.fill();



        /*
        background = new Picture(PADDING, PADDING, "bg_1600.png");
        background.draw();

        ground = new Picture(colToX(0, PADDING, cellSize), rowToY(13, PADDING, cellSize), "/floor_1600x100.png");
        ground.draw();

        clouds = new Picture(colToX(0, PADDING, cellSize), rowToY(0, PADDING, cellSize), "/clouds_1600x100.png");
        clouds.draw();
*/
    }


}


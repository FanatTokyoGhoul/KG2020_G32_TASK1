import java.awt.*;

public class Background implements GraphicsObject {
    /**This is background.
     Parameters:
     x,y: The coordinates of the drawing. Drawing from the upper-left corner.
     width: Length width.
     height: Length height.
     color: Fill color.**/
    private int width;
    private int height;
    private int x,y;
    private Color color;

    public Background(int x, int y, int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(color);
        gr.fillRect(x, y, width, height);
    }

    @Override
    public void scale(double proportion) {
        double[][] matrixScale2D = {{proportion,0},{0, proportion}};
        width = (int)(width * proportion);
        height = (int)(height * proportion);
        x = (int)(x * proportion);
        y = (int)(y * proportion);
    }
}

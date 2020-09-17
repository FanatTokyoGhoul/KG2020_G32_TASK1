import java.awt.*;

public class Lake implements GraphicsObject {

    /**This is Lake.
     Parameters:
     x,y: The coordinates of the drawing. Drawing in center.
     width: Length width.
     height: Length height.**/
    private int x,y;
    private int height;
    private int weigh;

    public Lake(int x, int y, int weigh) {
        this.x = x;
        this.y = y;
        this.weigh = weigh;
        this.height = weigh * 6 / 10;
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(new Color(35, 137, 218));
        gr.fillOval(x - (int)(weigh * 0.5), y - (int)(height * 0.5), weigh, height);
    }

    @Override
    public void scale(double proportion) {
        weigh = (int)(weigh * proportion);
        this.height = weigh * 6 / 10;
    }
}

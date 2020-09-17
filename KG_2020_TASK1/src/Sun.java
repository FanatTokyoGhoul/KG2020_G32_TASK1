import java.awt.*;

public class Sun implements GraphicsObject {

    /**This is Lake.
     Parameters:
     x,y: The coordinates of the drawing. Drawing in center.
     width: Length width.
     height: Length height.
     color: Fill color.
     n: Number of beams.**/

    private int size;
    private Color color;
    private int x, y;
    private int n;

    public Sun(int size, Color color, int x, int y, int n) {
        this.size = size;
        this.color = color;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    @Override
    public void draw(Graphics2D gr) {
        int r = (int)(size*0.65);
        int R = size;
        gr.setColor(color);
        gr.fillOval(x - r,y - r,r + r,r + r);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double dx1 = r * Math.cos(da * i);
            double dy1 = r * Math.sin(da * i);
            double dx2 = R * Math.cos(da * i);
            double dy2 = R * Math.sin(da * i);

            gr.drawLine(x + (int)dx1, y + (int)dy1, x + (int)dx2, y + (int)dy2);
        }
    }

    @Override
    public void scale(double proportion) {
        size = (int)(size * proportion);
        x = (int)(x * proportion);
        y = (int)(y * proportion);
    }
}

import java.awt.*;

public class Bush implements GraphicsObject {

    private int x, y;
    private int size;
    private int radius;
    private int n;

    public Bush(int x, int y, int size, int n) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.n = n;
        radius = (int) (size * 0.6);
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(Color.GREEN);
        gr.fillOval(x, y - (int) (size * 0.2), radius, radius);
        gr.fillOval(x + (int) (size * 0.2), y + (int) (size * 0.2), radius, radius);
        gr.fillOval(x - (int) (size * 0.2), y + (int) (size * 0.2), radius, radius);
        gr.setColor(Color.RED);
        for (int i = 0; i < n; i++) {
            gr.fillOval(Random.interval(x - (int) (size * 0.4) + size/2, x + size/3), y + Random.interval((int) (-size * 0.15), (int) (size * 0.2)), (int) (radius * 0.1), (int) (radius * 0.1));
            gr.fillOval(x + (int) (size * 0.4) + Random.interval((int) (-size * 0.3), (int) (size * 0.2)), y + (int) (size * 0.4) + Random.interval((int) (-size * 0.15), (int) (size * 0.2)), (int) (radius * 0.1), (int) (radius * 0.1));
            gr.fillOval(x - (int) (size * 0.2) + Random.interval((int) (-size * 0.3), (int) (size * 0.3)), y + (int) (size * 0.2) + Random.interval((int) (-size * 0.3), (int) (size * 0.3)), (int) (radius * 0.01), (int) (radius * 0.01));
        }
    }

    @Override
    public void scale(double proportion) {

    }
}

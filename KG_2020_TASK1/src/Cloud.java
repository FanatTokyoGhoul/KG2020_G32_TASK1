import java.awt.*;

public class Cloud implements GraphicsObject {

    /**This is Cloud.
     Parameters:
     x,y: The coordinates of the drawing. Drawing in center.
     width: Length width.**/

    private int x,y;
    private int height;
    private int weigh;

    public Cloud(int x, int y, int weigh) {
        this.x = x;
        this.y = y;
        this.weigh = weigh;
        this.height = weigh/2;
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(new Color(255, 255, 255));
        gr.fillOval(x - (int)(weigh * 0.4), y - (int)(0.4 * height), (int)(weigh * 0.3), (int)(height * 0.42));
        gr.fillOval(x - (int)(weigh * 0.17), y - (int)(0.44 * height), (int)(weigh * 0.28), (int)(height * 0.38));
        gr.fillOval(x , y - (int)(0.5 * height), (int)(weigh * 0.2), (int)(height * 0.36));
        gr.fillOval(x + (int)(weigh * 0.16), y - (int)(0.5 * height), (int)(weigh * 0.23), (int)(height * 0.38));
        gr.fillOval(x + (int)(weigh * 0.28), y - (int)(0.34 * height), (int)(weigh * 0.2), (int)(height * 0.3));
        gr.fillOval(x + (int)(weigh * 0.25), y - (int)(0.18 * height), (int)(weigh * 0.25), (int)(height * 0.34));
        gr.fillOval(x + (int)(weigh * 0.12), y + (int)(0.02 * height), (int)(weigh * 0.2), (int)(height * 0.3));
        gr.fillOval(x - (int)(weigh * 0.15), y + (int)(0.1 * height), (int)(weigh * 0.3), (int)(height * 0.38));
        gr.fillOval(x - (int)(weigh * 0.38), y + (int)(0.16 * height), (int)(weigh * 0.28), (int)(height * 0.26));
        gr.fillOval(x - (int)(weigh * 0.47), y + (int)(0.02 * height), (int)(weigh * 0.2), (int)(height * 0.28));
        gr.fillOval(x - (int)(weigh * 0.5), y - (int)(0.18 * height), (int)(weigh * 0.17), (int)(height * 0.24));
        gr.fillRect(x - (int)(weigh * 0.37),y - (int)(0.3 * height),(int)(weigh * 0.68),(int)(height * 0.54));
    }

    @Override
    public void scale(double proportion) {
        weigh = (int)(weigh * proportion);
        height = weigh/2;
    }
}

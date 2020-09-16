import java.awt.*;

public class Tree implements GraphicsObject {
    private int x,y;
    private int height;
    private int weigh;
    private int[][] firstTriangle;
    private int[][] secondTriangle;

    public Tree(int x, int y, int height) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.weigh = height * 6/9;
        firstTriangle = new int[][]{{x, x - (int) (3 * weigh * 0.167), x + (int) (3 *weigh *0.167)}, {y - height, y - (int)(height * 0.66), y - (int)(height * 0.66)}};
        secondTriangle = new int[][]{{x, x - (int) (3 * weigh * 0.167), x + (int) (3 *weigh *0.167)}, {y - (int)(height * 0.55), y - (int)(height * 0.22), y - (int)(height * 0.22)}};
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(new Color(160, 82, 45));
        gr.fillRect(x - (int)(weigh * 0.167), y - (int)(height * 0.88), (int)(weigh * 2 * 0.167), (int)(height * 0.88));
        gr.setColor(new Color(0, 82, 45));
        gr.fillPolygon(firstTriangle[0], firstTriangle[1], 3);
        gr.fillPolygon(secondTriangle[0], secondTriangle[1], 3);
    }

    @Override
    public void scale(double proportion) {
        height = (int)(height * proportion);
        weigh = height * 6/9;
        x = (int)(x * proportion);
        y = (int)(y * proportion);
        firstTriangle = new int[][]{{x, x - (int) (3 * weigh * 0.167), x + (int) (3 *weigh *0.167)}, {y - height, y - (int)(height * 0.66), y - (int)(height * 0.66)}};
        secondTriangle = new int[][]{{x, x - (int) (3 * weigh * 0.167), x + (int) (3 *weigh *0.167)}, {y - (int)(height * 0.55), y - (int)(height * 0.22), y - (int)(height * 0.22)}};
    }
}

import java.awt.*;

public class BirchTree implements GraphicsObject {

    private int x,y;
    private int height;
    private int weigh;
    private int countBlackRectangle;

    public BirchTree(int x, int y, int height, int countBlackRectangle) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.weigh = height*3/9;
        this.countBlackRectangle = countBlackRectangle;
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(new Color(255, 255, 255));
        gr.fillRect(x - (int)(weigh * 0.167), y - (int)(height * 0.88), (int)(weigh * 2 * 0.167), (int)(height * 0.88));
        gr.setColor(new Color(0,0,0));
        for(int i = 0; i < countBlackRectangle; i++){
            int newX = Random.interval(x-(int)(weigh * 0.167),x + (int)(weigh * 0.167) - 5);
            gr.fillRect(newX,Random.interval(y-(int)(height * 0.3),y - 4),Random.interval(5,(int)(weigh * 0.167 + x - newX)),(int)(height*0.03));
        }
        gr.setColor(new Color(173,255,47));
        gr.fillOval((int)(x - weigh*1.1),(int)(y - height*0.75),(int)(height*0.4),(int)(height*0.4));
        gr.fillOval((int)(x - weigh*0.2),(int)(y - height*0.75),(int)(height*0.4),(int)(height*0.4));
        gr.fillOval(x - weigh,y - height,(int)(height*0.4),(int)(height*0.4));
        gr.fillOval((int)(x - weigh*0.4),(int)(y - height),(int)(height*0.4),(int)(height*0.4));
    }

    @Override
    public void scale(double proportion) {

    }
}

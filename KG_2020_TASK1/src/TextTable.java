import java.awt.*;

public class TextTable implements GraphicsObject {

    private int x,y;
    private int height;
    private int weigh;

    public TextTable(int x, int y, int weigh) {
        this.x = x;
        this.y = y;
        this.weigh = weigh;
        this.height = weigh * 6 / 5;
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(new Color(165, 69, 19));
        gr.fillRect(x,y, weigh, (int)(height * 0.5));
        gr.fillRect(x + (int)(0.4 * weigh),y + (int)(0.5 * height), (int)(weigh * 0.2), (int)(height * 0.5));
        gr.setColor(new Color(0, 0, 0));
        gr.drawLine(x,y,x + weigh,y);
        gr.drawLine(x,y,x,y + (int)(0.5 * height));
        gr.drawLine(x,y + (int)(0.5 * height),x + weigh,y + (int)(0.5 * height));
        gr.drawLine(x + weigh, y,x + weigh,y + (int)(0.5 * height));
        gr.drawLine(x + (int)(0.4 * weigh),y + (int)(0.5 * height),x + (int)(0.4 * weigh),y + height);
        gr.drawLine(x + (int)(0.4 * weigh),y + height,x + (int)(0.6 * weigh),y + height);
        gr.drawLine(x + (int)(0.6 * weigh),y + height,x + (int)(0.6 * weigh),y + (int)(0.5 * height));
        gr.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        Font font = new Font("Serif", Font.PLAIN, (int)(weigh * 0.15));
        gr.setFont(font);
        gr.drawString("Не мусорить!", x + (int)(weigh * 0.06), y + (int)(height * 0.25));
    }

    @Override
    public void scale(double proportion) {

    }
}

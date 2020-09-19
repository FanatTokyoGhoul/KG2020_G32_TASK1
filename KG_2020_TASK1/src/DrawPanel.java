import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

public class DrawPanel extends JPanel {

    /**This is DrawPanel. Here I draw a picture in the BufferedImage in advance and then display it on the screen.**/

    private List<GraphicsObject> listObject;

    public DrawPanel(List<GraphicsObject> listObject) {
        this.listObject = listObject;
    }

    @Override
    public void paint(Graphics graphics){
        BufferedImage bufferedImage = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D gr = bufferedImage.createGraphics();
        for(GraphicsObject object: listObject){
            object.draw(gr);
        }
        graphics.drawImage(bufferedImage,0,0, null);
        gr.dispose();
    }
}

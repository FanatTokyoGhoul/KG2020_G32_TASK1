import java.awt.*;

public interface GraphicsObject {
    void draw(Graphics2D gr);
    void scale(double proportion);
}

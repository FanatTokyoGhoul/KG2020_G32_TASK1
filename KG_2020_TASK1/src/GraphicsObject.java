import java.awt.*;

public interface GraphicsObject {
    /**There are two methods in this interface for drawing
       an object and increasing or decreasing it proportionally.**/
    void draw(Graphics2D gr);
    void scale(double proportion);
    /**If 0 < proportion < 1 the object is being reduced
       If proportion > 1 the object increases**/
}

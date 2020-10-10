import java.awt.*;

public class Tree implements GraphicsObject {
    /**This is Tree.
     Parameters:
     x,y: The coordinates of the drawing. Drawing at the root of the tree.
     height: Length height.**/
    private int x,y;
    private int height;
    private int weigh;
    private int branch;

    public Tree(int x, int y, int height, int branch) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.weigh = height * 3/9;
        this.branch = branch;
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(new Color(160, 82, 45));
        gr.fillRect(x - (int)(weigh * 0.167), y - (int)(height * 0.88), (int)(weigh * 2 * 0.167), (int)(height * 0.88));
        gr.setColor(new Color(0, 82, 45));
        for(int i = 0; i < branch; i++){
            int[] arrayX = {x - weigh/2- (int)(weigh*0.13*i),x,x + weigh/2 + (int)(weigh*0.13*i)};
            int[] arrayY = {y - height + (int)(height*0.7/branch * i) + (int)(height * 0.2) - (int)(height*0.01*i),y - height + (int)(height*0.7/branch * i), y - height + (int)(height*0.7/branch * i) + (int)(height * 0.2) - (int)(height*0.01*i)};

            gr.fillPolygon(arrayX,arrayY,3);
        }
    }

    @Override
    public void scale(double proportion) {
        height = (int)(height * proportion);
        weigh = height * 6/9;
        x = (int)(x * proportion);
        y = (int)(y * proportion);
    }
}

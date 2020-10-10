import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {
    /**This is main frame. I use my graphics interface and draw all object.**/

    private List<GraphicsObject> listObject = new ArrayList<>();

    private void creatingAPicture() {
        listObject.add(new Background(0, 0, 1000, 350, new Color(0, 255, 255)));
        listObject.add(new Background(0, 350, 1000, 350, new Color(205, 133, 63)));
        listObject.add(new Cloud(250, 150, 250));
        listObject.add(new Cloud(550, 100, 250));
        listObject.add(new Sun(100, new Color(255, 255, 0), 900, 125, 25));
        listObject.add(new Lake(500, 500, 300));
        listObject.add(new Bush(800,420,50,3));
        listObject.add(new Bush(800,600,70,3));
        listObject.add(new Bush(900,550,65,3));
        listObject.add(new Bush(870,500,60,3));
        listObject.add(new BirchTree(800,380,120,5));
        listObject.add(new BirchTree(550,370,110,5));
        listObject.add(new Tree(500, 400, 150,5));
        listObject.add(new BirchTree(600,400,110,5));
        listObject.add(new Tree(175, 500, 215,5));
        listObject.add(new Tree(900, 450, 200,5));
        listObject.add(new Tree(700, 650, 400,5));
        listObject.add(new Tree(300, 550, 300,5));
        listObject.add(new Tree(50, 650, 400,5));
        listObject.add(new TextTable(450, 550, 70, "Купание запрещено!"));
        listObject.add(new BirchTree(400,400,150,4));
        listObject.add(new Bush(400,600,70,3));
        listObject.add(new Bush(200,570,70,3));
    }

    public MainFrame() {
        super("Task 1");
        DrawPanel panel = new DrawPanel(listObject);
        setMinimumSize(new Dimension(1000, 739));
        setContentPane(panel);
        creatingAPicture();
        setVisible(true);
    }
}

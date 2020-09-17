import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {
    /**This is main frame. I use my graphics interface and draw all object.**/

    private List<GraphicsObject> listObject = new ArrayList<>();

    public MainFrame(){
        super("Task 1");
        DrawPanel panel = new DrawPanel(listObject);
        setMinimumSize(new Dimension(1000, 739));
        setContentPane(panel);
        creatingAPicture();
        setVisible(true);
    }

    private void creatingAPicture(){
        listObject.add(new Background(0,0, 1000,350, new Color(0,255,255)));
        listObject.add(new Background(0,350, 1000,350, new Color(205,133,63)));
        listObject.add(new Cloud(250, 150, 250));
        listObject.add(new Cloud(550, 100, 250));
        listObject.add(new Sun(100, new Color(255,255,0),900, 125, 25));
        listObject.add(new Lake(500,500, 300));
        listObject.add(new Tree(500,400,150));
        listObject.add(new Tree(175,500,215));
        listObject.add(new Tree(900,450,200));
        listObject.add(new Tree(700,650,400));
        listObject.add(new Tree(300,550,300));
        listObject.add(new Tree(50,650,400));
        listObject.add(new TextTable(450,550,50, "Не мусорить!"));
    }


    static class DrawPanel extends JPanel {
        private List<GraphicsObject> listObject;

        public DrawPanel(List<GraphicsObject> listObject) {
            this.listObject = listObject;
        }

        @Override
        public void paint(Graphics graphics){
            Graphics2D gr = (Graphics2D)graphics;
            for(GraphicsObject object: listObject){
                object.draw(gr);
            }
        }
    }
}

import java.util.List;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args)
    {
        ShapeFactory factory = new ShapeFactory();
        List<Shape> shapes = new ArrayList<Shape>();

        shapes.add(factory.getShape("circle"));
        shapes.add(factory.getShape("circle"));
        shapes.add(factory.getShape("square"));

        for(Shape s: shapes) {
            s.draw();
        }
    }
}

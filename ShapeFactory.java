public class ShapeFactory {
    public Shape getShape(String id) {
        switch(id.toLowerCase()) {
            case "square": return new Square();
            case "circle": return new Circle();
            default: return null;
        }
    }
}

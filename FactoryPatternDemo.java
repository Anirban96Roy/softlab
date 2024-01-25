public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory a = ShapeFactory.getInstance();
        ShapeFactory b = ShapeFactory.getInstance();
        Shape shape1 = a.getshape("SQUARE");shape1.draw();
        Shape shape2 = b.getshape("RECTANGLE");shape2.draw();
        System.out.println("hashcode of shape1: " + a.hashCode());
        System.out.println("hashcode of shape2: " + b.hashCode());
    }
}

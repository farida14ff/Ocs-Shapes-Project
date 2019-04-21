public class Main {
    public static void main(String[] args) {
        Shape [] shape = {new Circle(3.2,"blue",true), new Rectangle(2,4,"gray",true), new Square(5)};
//        Circle circle = new Circle();
//
//        circle.setArea(2);
//        circle.setPirimeter(3);
//        Rectangle rectangle = new Rectangle();
//        rectangle.setArea(4);
//        rectangle.setPirimeter(7);
        Square square = new Square();
        square.setLength(4);
        square.setWidth(3);

        for (int i = 0; i < shape.length ; i++) {
//            System.out.println(shape[i]);
//            System.out.println(shape[i].getArea());
//            System.out.println(shape[i].getPirimeter());
            shape[i].setPirimeter(3);
            shape[i].setArea(4);
            System.out.println(shape[i].toString());
        }
    }
}

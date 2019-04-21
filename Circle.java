public class Circle extends Shape {
    private double radius;

    Circle(){}

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return area;
    }

    @Override
    public double getPirimeter(){
        return pirimeter;
    }

    @Override
    public String toString(){
        return String.format("Circle : %n Radius: %s%n" , getRadius(),"Area: %s%n", getArea()," Perimeter: %s%n" ,getPirimeter(), "%n");
    }

}

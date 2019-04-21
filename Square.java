import java.awt.Shape;

public class Square extends Rectangle{
    public double side;

    Square(){}

    Square(double side){
        this.side = side;
    }
    public Square(double side,String color, boolean filled){
        //Shape(color,filled);
        //super(color,filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
       // return super.toString();
        return String.format("Square: %n Side: %s%n",getSide(),"Length: %s%n",getLength(),"%n");
    }
}

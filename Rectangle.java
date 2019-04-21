public class Rectangle extends Shape {
    private double width;
    public double length;

    Rectangle(){}

    public Rectangle(double width,double length){
        this.width = width;
        this.length =length;
    }

    public Rectangle(double width,double length,String color,boolean filled){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPirimeter() {
        return super.getPirimeter();
    }

    @Override
    public String toString(){
        //return super.toString();
        return  String.format("Rectangle:%n Width: %s%n",getWidth(),"Length: %s%n",getLength(),"Area:%s%n",getArea(),"Pirimeter:%s%n", getPirimeter(),"%n");
        //"Rectangle:%n Width: %s%n",getWidth(),"Length: %s%n",getLength(),"Area:%s%n",getArea(),"Pirimeter:%s%n", getPirimeter(),"%n"
    }
}

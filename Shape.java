public class Shape {
    private String color;
    private boolean filled;
    public double area;
    public double pirimeter;

    Shape() {}

    public Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public  boolean IsFailed(){
        return true;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getArea(){
        return area;
    }
    public void setArea(double area){
        this.area = area;
    }
    public double getPirimeter(){
        return pirimeter;
    }

    public void setPirimeter(double pirimeter) {
        this.pirimeter = pirimeter;
    }

    public String toString(){
        return String.format("Shape class:");
    }



}

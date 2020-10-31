package assignment4;

public class Cylinder extends Circle{
    private double height=10;

    Cylinder(){
        super();
    }
    Cylinder(double height){
        super();
        this.height=height;
    }
    Cylinder(double height, double radius){
        super(radius);
        this.height=height;
    }
    Cylinder(double height, double radius,String color){
        super(radius);
        this.height=height;
        this.setColor(color);
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }
    @Override
    public double getArea(){
        return 2*3.1415926*this.getRadius()*(this.getRadius()+height);
    }
}

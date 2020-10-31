package as4;

public class Cylinder extends Circle{
    private double height=1.0;

    public Cylinder(){

    }

    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder (double height, double radius){
        super(radius);
        this.height=height;
    }

    public Cylinder(double radius, double height,String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea()*this.height;
    }
    //override the getArea() to compute the surface area of the cylinder in the subclass Cylinder
    //2πr(r+h)
    @Override
    public double getArea(){
        return 2*Math.PI*super.getRadius()*(super.getRadius()+this.height);
    }
}

package assignment4;

public class TestCylinder {
    public static void main(String[] args) {
        Circle circle=new Circle(2,"yellow");
        System.out.println("Radius is "+ circle.getRadius()+" color is "+ circle.getColor()+" Base area is "+ circle.getArea());

        Cylinder cylinder1=new Cylinder(1);
        System.out.println("Radius is " +cylinder1.getRadius()+" Height is "+ cylinder1.getHeight()+" color is "+cylinder1.getColor()
                    +" Base is "+ cylinder1.getArea()+" Volume is "+cylinder1.getVolume());

        Cylinder cylinder2 =new Cylinder(5,2);
        System.out.println("Radius is " +cylinder2.getRadius()+" Height is "+cylinder2.getHeight()+" color is "+cylinder2.getColor()
                +" Base is "+ cylinder2.getArea()+" Volume is "+cylinder2.getVolume());
    }
}

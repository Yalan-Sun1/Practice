package as4;

public class TestCylinder {
    public static void main(String[] args) {
        //Constructed a Circle with Circle()
        Circle circle=new Circle();
        circle.setRadius(2.0);
        circle.setColor("yellow");
        System.out.println("radius is "+ circle.getRadius()+ " Base area is "+ circle.getArea());
        //Radius is 2.0, Color is yellow, Base area is (your answer)

        //Constructed a Cylinder with Cylinder()
        //Run of the program should produce the following output:
        //Radius is 1.0, Height is 1.0, Color is red, Base area is (your answer), Volume is (your answer)

        //Constructed a Cylinder with Cylinder(height, radius)
        Cylinder cylinder2=new Cylinder(5.0, 2.0);
        //Run of the program should produce the following output:
        //Radius is 2.0, Height is 5.0, Color is red, Base area is (your answer), Volume is (your answer)
    }
}

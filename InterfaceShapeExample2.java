public class InterfaceShapeExample2 {
    public static void main(String[] args)
    {
        Shape ref = new Rectangle(10.5,5.6);
        System.out.println("Area of Rectangle = "+ref.area());
        ref = new Triangle(10,14);
        System.out.println("Area of Triangle = "+ref.area());
    }
}

interface Shape
{
    double area();
}

class Rectangle implements Shape
{
    double s1,s2;
    Rectangle(double a,double b)
    {
        s1 = a;
        s2 = b;
    }
    public double area()
    {
        return s1*s2;
    }
}

class Triangle implements Shape
{
    double s1,s2;
    Triangle(double a,double b)
    {
        s1 = a;
        s2 = b;
    }
    public double area()
    {
        return 0.5*s1*s2;
    }
}
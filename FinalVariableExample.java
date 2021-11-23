public class FinalVariableExample {
public static void main(String[] args)
{
    final double pi=3.14;
    double radius = 2.3;
    System.out.println("Area = "+(pi*radius*radius));
    pi = pi*2;
}
}

/*
Output -
java: cannot assign a value to final variable pi
 */
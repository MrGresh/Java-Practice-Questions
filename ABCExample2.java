public class ABCExample2 {
    public static void main(String[] args)
    {
        AbstractBaseClass1 obj = new DerivedClassB();
        obj.f1();
    }
}

abstract class AbstractBaseClass1
{
    abstract void f1();
}

class DerivedClassA extends AbstractBaseClass1{
    void f1(){
        System.out.println("Function F1 in DerivedClassA");
    }
}
class DerivedClassB extends DerivedClassA{
    void f1(){
        System.out.println("Function F1 in DerivedClassB");
    }
}
public class InterfaceExample1 {
    public static void main(String[] args)
    {
        MyInterface ref = new MyClass1();
        ref.fun();
        ref = new MyClass2();
        ref.fun();
    }
}

interface MyInterface
{
    void fun();
}
class MyClass1 implements MyInterface
{
    public void fun(){
        System.out.println("fun of MyClass1");
    }
}
class MyClass2 implements MyInterface
{
    public void fun(){
        System.out.println("fun of MyClass2");
    }
}
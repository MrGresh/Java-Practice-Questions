public class MethodOverridingExample {
    public static void main(String[] args)
    {
        Derived obj = new Derived();
        obj.show();
    }
}

class Base{
    void show(){
        System.out.println("Hello from Base");
    }
}

class Derived extends Base{
    void show(){
        System.out.println("Hello from Derived");
    }
}

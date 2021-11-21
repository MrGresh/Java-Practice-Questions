public class StaticMethodDemoMain {
    public static void main(String[] args)
    {
        StaticMethods.staticFun();
        StaticMethods sobj = new StaticMethods();
        sobj.staticFun();
        (new StaticMethods()).staticFun();
    }
}

class StaticMethods
{
    static void staticFun()
    {
        System.out.println("Static Function Called");
    }
}
public class StaticNestedClass {

    static String s = "Static Nested";

    static class StaticInner
    {
        void demo()
        {
            System.out.println(s);
        }
    }

    public static void main(String [] args)
    {
        StaticNestedClass.StaticInner sObj = new StaticNestedClass.StaticInner();
        sObj.demo();
    }
}

public class StaticNestedClassWithNonStaticDataInOuterClass {

    String s = "Static Nested";

    static class StaticInner
    {
        void demo()
        {

            String x = new StaticNestedClassWithNonStaticDataInOuterClass().s;
            System.out.println(x);
        }
    }

    public static void main(String [] args)
    {
        StaticNestedClassWithNonStaticDataInOuterClass.StaticInner sObj = new StaticNestedClassWithNonStaticDataInOuterClass.StaticInner();
        sObj.demo();
    }
}

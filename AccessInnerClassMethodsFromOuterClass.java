public class AccessInnerClassMethodsFromOuterClass {
    public static void main(String[] args)
    {
        new OuterClass().OuterShow();
    }
}

class OuterClass
{

    private int DataOuter = 10;


    class InnerClass
    {
        private int DataInner = 30;

        void InnerShow()
        {
            System.out.println("Outer = "+DataOuter);
            System.out.println("Inner = "+DataInner);
        }
    }

    void OuterShow()
    {
        new InnerClass().InnerShow();
    }

}
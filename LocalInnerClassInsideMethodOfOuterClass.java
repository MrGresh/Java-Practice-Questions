public class LocalInnerClassInsideMethodOfOuterClass {
    public static void main(String[] args)
    {
        new OuterClass().Display();
    }
}

class OuterClass
{
    private int DataOuter = 10;
    void Display()
    {
        class InnerClass
        {
            void innershow()
            {
                System.out.println(DataOuter);
            }
        }
        new InnerClass().innershow();
    }
}
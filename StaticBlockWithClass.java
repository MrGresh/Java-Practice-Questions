public class StaticBlockWithClass {
    public static void main(String[] args)
    {
        System.out.println(ClassWithStaticBlock.staticInt);
    }
}

class ClassWithStaticBlock
{
    static int staticInt;
    static {
        staticInt = 19;
        System.out.println("Static Block Called");
    }
}

/* Output -
Static Block Called
19
 */
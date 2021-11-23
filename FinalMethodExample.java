public class FinalMethodExample {
    public static void main(String[] args)
    {
        new DerivedFinalMethod().fun();
    }
}

class BaseFinalMethod
{
    final  void fun()
    {
        System.out.println("Fun of Base Class");
    }
}
class DerivedFinalMethod extends BaseFinalMethod
{
    void fun()
    {
        System.out.println("Fun of Derived Class");
    }
}

/*
Output -
java: fun() in DerivedFinalMethod cannot override fun() in BaseFinalMethod
  overridden method is final
 */
public class FinalClassExample {
    public static void main(String [] args)
    {
        FinalClassExample obj =   new ChildClass();
        obj.fun();
    }
}

final class FinalClassParent
{
    void fun()
    {
        System.out.println("Mr.Gresh");
    }
}
class ChildClass extends FinalClassExample
{

}

/*
Output -
java: cannot find symbol
  symbol:   method fun()
  location: variable obj of type FinalClassExample

  FinalClassParent class can't be inherited.
 */
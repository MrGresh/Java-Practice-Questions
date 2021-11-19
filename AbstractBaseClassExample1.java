public class AbstractBaseClassExample1 extends AbstractBaseClass {
    @Override
    void f1() {
        System.out.println("Hello Gresh");
    }

    public static void main(String[] args){
        AbstractBaseClass ref = new AbstractBaseClassExample1();
        ref.f1();
    }
}

abstract class AbstractBaseClass
{
    abstract void f1();
}

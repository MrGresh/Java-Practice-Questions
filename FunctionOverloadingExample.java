public class FunctionOverloadingExample {
    public static void main(String[] args){
        ClassA obj = new ClassA();
        obj.show("Hello");
        obj.show(10,2.5f);
    }
}
class ClassA
{
    void show(int x,float y)
    {
        System.out.println(("x = "+x+"\ty = "+y));
    }
    void show(String a)
    {
        System.out.println("a = "+a);
    }
}
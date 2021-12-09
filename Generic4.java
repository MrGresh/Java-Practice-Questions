public class Generic4 {


    public static void main(String[] args) {
        generic <Integer> obj = new generic();
        obj.fi(8);
        generic <String> obj2 = new generic<>();
        obj2.fi("Mr. Gresh");
        generic <Character> obj3 = new generic<Character>();
        obj3.fi('t');


    }
}

class generic <T>
{
    public <T> void fi(T a)
    {
        System.out.println("You Passed " + a);
    }
}

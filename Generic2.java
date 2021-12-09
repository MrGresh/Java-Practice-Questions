public class Generic2 {
    static public <T> void fi(T a)
    {
        System.out.println("You Passed " + a);
    }

    public static void main(String[] args) {
        Generic2.<String>fi("Hiii");
        Generic2.<Character>fi('b');
        Generic2.<Integer>fi(6);
    }
}

/*
Output :

You Passed Hiii
You Passed b
You Passed 6
 */
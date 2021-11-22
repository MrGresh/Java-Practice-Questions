public class StaticBlockExample1 {
    static
    {
        System.out.println("I'll Load First");
    }
    public static void main(String[] args)
    {
        System.out.println("I'll main");
    }
}

// Output - I'll Load First
//          I'll main
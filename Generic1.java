public class Generic1 {
    public static <T extends Number> T hifi(T a)
    {
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Generic1.<Integer>hifi(5));
        System.out.println(Generic1.<Double>hifi(7.8));
    }
}

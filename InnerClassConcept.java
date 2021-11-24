public class InnerClassConcept {

    private String strOuter = "Outer String";
    
    class innerClass
    {
        void demo()
        {
            System.out.println("String is "+strOuter);
        }
    }

    public static void main(String[] args)
    {
        new InnerClassConcept().new innerClass().demo();
    }
}

public class InterfaceExample4 {
    public static void main(String [] args)
    {
        ClassImplemetingDays obj = new ClassImplemetingDays();
        obj.show(3);
    }
}

interface Days{
    int SUN=1,MON=2,TUE=3,WED=4,THU=5,FRI=6,SAT=7;
}

class ClassImplemetingDays implements Days
{
    void show(int x){
        switch (x)
        {
            case MON :
                System.out.println("Monday");
                break;
            case TUE:
                System.out.println("Tuesday");
                break;
            case WED:
                System.out.println("Wednesday");
                break;
            case THU:
                System.out.println("Thursday");
                break;
            case FRI:
                System.out.println("Friday");
                break;
            case SAT:
                System.out.println("Saturday");
                break;
            case SUN:
                System.out.println("Sunday");
                break;
        }
    }
}
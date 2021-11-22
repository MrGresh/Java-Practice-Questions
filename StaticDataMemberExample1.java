public class StaticDataMemberExample1 {
    public static void main(String[] args)
    {
        ClassWithStaticData.count++;
        ClassWithStaticData obj = new ClassWithStaticData();
        obj.count++;
        System.out.println(ClassWithStaticData.count);
    }
}
class ClassWithStaticData
{
    static int count = 10;
}

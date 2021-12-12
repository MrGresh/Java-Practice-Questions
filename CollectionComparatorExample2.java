import java.util.*;
class MyComn implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
// TODO Auto-generated method stub
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s1.compareTo(s2);  // [a, b, c, d, e, f]
       // return s2.compareTo(s1);  // [f, e, d, c, b, a]
    }
}
public class CollectionComparatorExample2 {
    public static void main(String[] args) {
        TreeSet <String> obj= new TreeSet<>(new MyComn());
        obj.add("f");
        obj.add("d");
        obj.add("c");
        obj.add("a");
        obj.add("e");
        obj.add("b");
        System.out.println(obj);
    }

}

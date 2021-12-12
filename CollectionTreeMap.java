import java.util.*;
class MyCom implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
// TODO Auto-generated method stub
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}
public class CollectionTreeMap {
    public static void main(String args[])
    {
        TreeMap t = new TreeMap(new MyCom());
        t.put("aaa",10);
        t.put("bbb",20);
        t.put("ccc",30);
        t.put("ddd",40);
        System.out.println(t);  //  {ddd=40, ccc=30, bbb=20, aaa=10}
    }

}

import java.util.*;
public class CollectionHashSet2 {
    public static void main(String[] args) {
        ArrayList q = new ArrayList();
        q.add("aaa");
        q.add("bbb");
        q.add(null);
        q.add(10);
        q.add("aaa");
        HashSet i = new HashSet(q);
        System.out.println(i);} // [aaa, null, bbb, 10] , No order preserve and No duplicate
}

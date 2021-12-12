import java.util.*;
public class CollectionLinkedHashSet {
    public static void main(String[] args) {
        ArrayList q = new ArrayList();
        q.add("aaa");
        q.add("bbb");
        q.add(null);
        q.add(10);
        q.add("aaa");
        LinkedHashSet i = new LinkedHashSet(q);

        System.out.println(i.add("bbb"));  // false
        System.out.println(i);
    } // [aaa, bbb, null, 10] , order is preserve but No duplicate
}

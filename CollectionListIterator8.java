import java.util.*;
public class CollectionListIterator8 {
    public static void main(String[] args) {
        ArrayList i = new ArrayList();
        i.add("a");
        i.add("b");
        i.add("c");
        i.add("d");
        i.add("e");

        ListIterator m= i.listIterator();

        while (m.hasNext()) {
            System.out.println(m.next());
        }
        /*
        a
        b
        c
        d
        e
         */

        ListIterator l= i.listIterator();
        System.out.println(i); //[a, b, c, d, e]

        l.next();
        System.out.println(i); //[a, b, c, d, e]
        l.next();
        System.out.println(i); //[a, b, c, d, e]
        l.next();
        System.out.println(i); //[a, b, c, d, e]
        l.next();
        System.out.println(i); //[a, b, c, d, e]
        l.remove();
        System.out.println(i);// [a, b, c, d, e]
        l.previous();
        System.out.println(i);// [a, b, c, d, e]
        l.previous();
        System.out.println(i);// [a, b, c, d, e]
        l.remove();
        System.out.println(i);// [a, c, e]


        Iterator it = i.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        /*
        a
        c
        e
         */




    }
}

import java.util.*;
public class CollectionTreeSet {
    public static void main(String[] args) {
        TreeSet obj = new TreeSet();
        obj.add("A");
        obj.add("a");
        obj.add("B");
        obj.add("Z");
        obj.add("U");
        // obj.add(80);  // ClassCastException
        // obj.add(null); // NullPointerException
        System.out.println(obj); // [A, B, U, Z, a]


        /*
        Duplicate Objects are not allowed
All objects will be inserted according to some sorting order.
Heterogeneous objects are not allowed
If we trying to insert heterogeneous object it will throw run time exception class cast exception.

null insertion is allowed but only once(1.6 version) but now its not allowed

         */

    }
    }

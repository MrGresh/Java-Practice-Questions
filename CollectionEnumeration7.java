import java.util.*;
public class CollectionEnumeration7 {
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 5; i++) {
            v.addElement(i);
        }

        System.out.println(v); //[0, 1, 2, 3, 4]

        Enumeration e = v.elements();

        while (e.hasMoreElements()) {

            System.out.println(e.nextElement());

        }
        // want to print only even numbers
        Enumeration j = v.elements();
        while (j.hasMoreElements()) {
            Integer i = (Integer) j.nextElement();
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    }
    /*
    0
    1
    2
    3
    4
     */

    /*
    0
    2
    4
     */


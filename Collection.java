import java.io.Serializable;
import java.util.*;

public class Collection {
    public static void main(String[] args) {
        ArrayList obj= new ArrayList();
        System.out.println(obj instanceof Serializable); //true
        System.out.println(obj instanceof Cloneable); //true
        System.out.println(obj instanceof RandomAccess); //true
        LinkedList l = new LinkedList<>();
        System.out.println(l instanceof Serializable); // true
        System.out.println(l instanceof Cloneable); //true
        System.out.println(l instanceof RandomAccess); //false
        Vector v = new Vector<>();
        System.out.println(v instanceof Serializable); // true
        System.out.println(v instanceof Cloneable); // true
        System.out.println(v instanceof RandomAccess); //true
        HashMap m = new HashMap();
        System.out.println(m instanceof Serializable); // true
        System.out.println(m instanceof Cloneable); //true
        System.out.println(l instanceof RandomAccess); //false
        TreeMap t = new TreeMap();
        System.out.println(t instanceof Serializable); //true
        System.out.println(t instanceof Cloneable); // true
        System.out.println(l instanceof RandomAccess); //false
    }

}

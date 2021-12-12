import java.util.*;
public class CollectionComparable1 {

        public static void main(String[] args) {

            /*

            Collections class provides static methods for sorting the elements of collections.
            If collection elements are of Set or Map, we can use TreeSet or TreeMap.
            However, we cannot sort the elements of List.
            Collections class provides methods for sorting the elements of List type elements.

            String class and Wrapper classes implement the Comparable interface by default.
            So if you store the objects
             of string or wrapper classes in a list, set or map, it will be Comparable by default.
             */
            TreeSet <String> obj= new TreeSet<>();
            obj.add("k");
            obj.add("z");
            obj.add("a");

            System.out.println(obj); // [a, k, z]
        }



    }

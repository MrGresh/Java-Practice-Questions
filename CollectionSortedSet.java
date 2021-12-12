import java.util.*;
public class CollectionSortedSet {
    public static void main(String[] args) {
        TreeSet obj = new TreeSet();
        obj.add(10);
        obj.add(90);
        obj.add(70);
        obj.add(60);
        obj.add(10);
        obj.add(30);
        obj.add(80);
        obj.add(20);

        System.out.println(obj); // [10, 20, 30, 60, 70, 80, 90] , sorting order and duplicates are not allowed

        System.out.println(obj.first()); //10
        System.out.println(obj.last()); // 90
        System.out.println(obj.headSet(70));
//[10, 20, 30, 60]
        System.out.println(obj.tailSet(60));
//[60, 70, 80, 90]
        System.out.println(obj.subSet(20,70)); //[20, 30, 60]
    }

}

import java.util.*;
public class CollectionIterator6 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList();//Creating arraylist
        list.add(8);//Adding object in arraylist
        list.add(9);
        list.add(10);
        list.add(11);

        System.out.println(list); //[8, 9, 10, 11]
//Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

/*
8
9
10
11
 */
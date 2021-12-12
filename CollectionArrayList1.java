import java.util.*;
public class CollectionArrayList1 {
    public static void main(String args[]){
        ArrayList list=new ArrayList();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add(9.7);
        list.add(8);
        System.out.println(  list.add('u'));//true , it is method's return type
        System.out.println(list); //[Ravi, 9.7, 8, u] these are at 0 , 1 , 2 , 3 indexes

        list.add(1,"Gresh");
        System.out.println(list);   //[Ravi, Gresh, 9.7, 8, u]

        ArrayList list2 = new ArrayList();
        list2.add("Rajesh");//Adding object in arraylist
        list2.add(97);
        list2.add(80);

        System.out.println(list.addAll(list2)); //true
        System.out.println(list); //[Ravi, Gresh, 9.7, 8, u, Rajesh, 97, 80]
        list.addAll(1,list2);
        System.out.println(list); // [Ravi, Rajesh, 97, 80, Gresh, 9.7, 8, u, Rajesh, 97, 80]

        System.out.println(list.set(0,"Dinesh")); // Ravi
        System.out.println(list);// [Dinesh, Rajesh, 97, 80, Gresh, 9.7, 8, u, Rajesh, 97, 80]

        System.out.println( list.get(0)); // Dinesh

        System.out.println( list.remove(1)); //Rajesh
        System.out.println(list);   //[Dinesh, 97, 80, Gresh, 9.7, 8, u, Rajesh, 97, 80]

        list.add(8,"Gresh"); // void ,can't be placed inside sout
        System.out.println(list); //[Dinesh, 97, 80, Gresh, 9.7, 8, u, Rajesh, Gresh, 97, 80]

        System.out.println( list.remove("Gresh")); //true
        System.out.println(list); //[Dinesh, 97, 80, 9.7, 8, u, Rajesh, Gresh, 97, 80] ,only first
                                        //occurrence of Gresh will remove only

        System.out.println( list.indexOf(97)); // 1 , first occurrence will print only
        System.out.println( list.lastIndexOf(80)); // 9

        System.out.println(list.add(null)); //true
        System.out.println(list); // [Dinesh, 97, 80, 9.7, 8, u, Rajesh, Gresh, 97, 80, null]
        list.add(0,null);
        System.out.println(list); // [null, Dinesh, 97, 80, 9.7, 8, u, Rajesh, Gresh, 97, 80, null]

        /*
        WHEN TO USE ArrayList

        If our frequent operation is retrieval operation then ArrayList is the best choice because ArrayList implements RandomAccess interface
If out frequent operation is insertion or deletion in the middle then ArrayList is the worst choice

For Insertion and deletion in the middle the best choice is Linked List


         */

        /*

        ArrayList is defined using dynamic array or  Resizable Array or Growable Array
Duplicated are allowed
Insertion order is preserved
Heterogeneous objects are allowed ( expect TreeSet and TreeMap everywhere heterogeneous objects are allowed)
null insertion is possible
ArrayList Methods are not Synchronised. Therefore ArrayList objects are not Thread Safe


         */
        System.out.println("Thread Saftey");
        List obj = Collections.synchronizedList(list);
        System.out.println(obj); // [null, Dinesh, 97, 80, 9.7, 8, u, Rajesh, Gresh, 97, 80, null]

        System.out.println(list.contains(97)); // true
        System.out.println(list.containsAll(list2)); //true

        System.out.println(list.size()); // 12

        System.out.println(list.isEmpty()); // false

        System.out.println(list.retainAll(list2)); //true
        System.out.println(list);  // [97, 80, Rajesh, 97, 80] , Retains only the elements in this collection
        // that are contained in the specified collection

        /*
        Object[] toArray();
To Convert collection to Array
Iterator<E> iterator();
Returns an iterator over the elements in this collection

         */

        /*
        ArrayList Constructors
        ArrayList l = new ArrayList();
Default Initial Capacity 10
ArrayList l = new ArrayList( int initial_capacity)
ArrayList l = new ArrayList( Collection c)
Creates an equivalent array list object for the given collection

         */

       list.clear(); // void
        System.out.println(list); // []

        /*       Thank You */

    }
}

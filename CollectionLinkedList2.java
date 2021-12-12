import java.util.*;
public class CollectionLinkedList2
{
    /*
    LinkedList is defined using double linked list
Insertion order is preserved
Duplicates are allowed
Heterogeneous objects are allowed
Null insertion is possible

LinkedList implements Serializable and Cloneable interfaces but not RendomAccess Interface.
Linked list is the best choice if our frequent operation is insertion or deletion in the middle
LinkedList is the worst choice if our frequent operation is retrieval operation

LinkedList Constructors
LinkedList l = new LinkedList(Collection c)
Creates an equivalent linked list object for the given collection.
LinkedList l = new LinkedList()
Creates empty LinkedList object

Usually we can use linkedList to implement stacks LIFO and queues FIFO to provide support for this
requirement LinkedList class defines following specific methods
Void addFirst(Object o);
Void addLast(Object o);
Object getFirst();
Object getLast();
Object removeFirst();
Object removeLast();

     */

    public static void main(String[] args) {
        LinkedList i = new LinkedList();
        i.add("neeraj");
        i.add(10);
        i.add(null);
        i.add("neeraj");
        System.out.println(i); // [neeraj, 10, null, neeraj]
        i.set(0,"kamal");
        System.out.println(i); // [kamal, 10, null, neeraj]
        i.add(0,"raman");
        System.out.println(i); //[raman, kamal, 10, null, neeraj]
        i.removeLast();
        System.out.println(i);//[raman, kamal, 10, null]

        i.addFirst("rohit");
        System.out.println(i); //[rohit, raman, kamal, 10, null]

        System.out.println( i.remove(1)); //raman
        System.out.println(i); // [rohit, kamal, 10, null]

        System.out.println( i.isEmpty()); //false

        i.addFirst("Gresh"); //void
        System.out.println(i); //[Gresh, rohit, kamal, 10, null]
        i.addLast("Dinesh"); //void
        System.out.println(i); //[Gresh, rohit, kamal, 10, null]
        System.out.println(i.removeLast()); //Dinesh
        System.out.println(i); //[Gresh, rohit, kamal, 10, null]
        System.out.println(i.removeFirst()); //Gresh
        System.out.println(i); //[rohit, kamal, 10, null]
        System.out.println(i.remove(0)); //rohit
        System.out.println(i); //[kamal, 10, null]
        System.out.println(i.getFirst()); //kamal
        System.out.println(i.getLast()); //null














    }

}

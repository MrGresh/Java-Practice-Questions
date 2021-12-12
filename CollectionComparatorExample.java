import java.util.*;

class MyComparatorSorting  implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer)o2;
        if(i1<i2)
        {return 1;}
        else if(i1>i2)
        { return -1;}

        return 0;
    }
}

public class CollectionComparatorExample  {
    public static void main(String[] args) {

        /*
        Write a program to insert Integer objects into the TreeSet where the sorting order is descending order.

        My requirement is to sort the data in descending
        order for this. i created my own class that
        implements Comparator

         */
        TreeSet <Integer> obj= new TreeSet<>(new MyComparatorSorting());
        obj.add(10);
        obj.add(0);
        obj.add(15);
        obj.add(5);
        obj.add(20);
        obj.add(20);
        System.out.println(obj); // [20, 15, 10, 5, 0]

    }

}





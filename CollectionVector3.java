import java.util.*;
public class CollectionVector3 {
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i = 1;i<=10;i++)
        {
            v.addElement(i);
        }
        System.out.println(v.capacity()); // 10
        v.addElement("Neeraj");
        System.out.println(v.capacity()); // 20
        System.out.println(v);
        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Neeraj]

        v.add("Gresh");
        v.addElement("Dinesh");
        System.out.println(v);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Neeraj, Gresh, Dinesh]
        v.add(0,"SirNeeraj");
        System.out.println(v); //[SirNeeraj, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Neeraj, Gresh, Dinesh]

        System.out.println(v.size()); //14


        v.remove(2);
        System.out.println(v); //[SirNeeraj, 1, 3, 4, 5, 6, 7, 8, 9, 10, Neeraj, Gresh, Dinesh]
        v.removeElementAt(1);
        System.out.println(v); //[SirNeeraj, 3, 4, 5, 6, 7, 8, 9, 10, Neeraj, Gresh, Dinesh]



        System.out.println(v.remove("Gresh"));  //true
        System.out.println(v); //[SirNeeraj, 3, 4, 5, 6, 7, 8, 9, 10, Neeraj, Dinesh]
        System.out.println(v.removeElement("Dinesh"));// true
        System.out.println(v);// [SirNeeraj, 3, 4, 5, 6, 7, 8, 9, 10, Neeraj]

        System.out.println(v.remove(5)); // 7
        System.out.println(v); //[SirNeeraj, 3, 4, 5, 6, 8, 9, 10, Neeraj]
        System.out.println(v.removeElement(9)); //true
        System.out.println(v); //[SirNeeraj, 3, 4, 5, 6, 8, 10, Neeraj]

        System.out.println(v.elementAt(7)); //Neeraj
        System.out.println(v.firstElement()); //SirNeeraj
        System.out.println(v.lastElement()); //Neeraj
        System.out.println(v.get(6)); //10



    }

}

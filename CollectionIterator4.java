import java.util.*;
public class CollectionIterator4 {
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i = 1;i<=10;i++)
        {
            v.addElement(i);
        }
        Iterator i = v.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }

}

/*

Output :
1
2
3
4
5
6
7
8
9
10

 */

import java.util.*;
public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList b = new ArrayList();
        b.add(1);
        b.add('2');
        b.add("Gresh");
        System.out.println(b); //[1, 2, Gresh]

        b.remove("Gresh");
        System.out.println(b); //[1, 2]

        b.remove(0);
        System.out.println(b); //[2]

//        b.remove('2'); // remove dosen't support any numeric data to remove directly ,
////        it is only possible by index only
//        System.out.println(b);//[2]2

        b.add("100");
        System.out.println(b); //[2, 100]

        b.remove("100");
        System.out.println(b); //[2]

        b.add('3');
        System.out.println(b); //[2, 3]

        b.remove(1);
        System.out.println(b); //[2]

    }
}

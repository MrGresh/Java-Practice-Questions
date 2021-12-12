import java.util.*;
public class CollectionGenericExample {
    public static void main(String[] args) {
        /*
        Create an array which will be able to store
        only numbers like int, float, double etc, but not any other data type
         */
        // create a array list

        ArrayList<Object> al=new ArrayList();

        Object obj= new Integer(10);
        Object obj1= new Double(10.23);

        if(obj instanceof Number){
            al.add(obj);
        }

        if(obj1 instanceof Number){
            al.add(obj1);
        }

        System.out.println(al); // [10, 10.23]

    }

}

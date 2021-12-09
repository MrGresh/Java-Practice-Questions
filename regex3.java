import  java.util.regex.*;
public class regex3 {
    public static void main(String args[]){
//1st way
        Pattern p = Pattern.compile(".s");//. represents single character
        Matcher m = p.matcher("as");
        System.out.println(m.find());
        boolean b = m.matches();

//2nd way
        boolean b2=Pattern.compile(".s").matcher("as").matches();

//3rd way
        boolean b3 = Pattern.matches(".s", "as");

        System.out.println(b+" "+b2+" "+b3);

        System.out.println(m.find());/*here it will give false bcoz this method attempts to find next match
        and returns true if it is found otherwise it will return false. If i remove this method from Line 7 then
        still it will give false bcoz we already printed true by pattern.matcher then now no match available
        hence in every situation it will return false here.*/


    }

}

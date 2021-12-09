import java.util.regex.*;
public class regex1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("nee",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("neetargetNeeString");

        int c = 0;
        while (m.find())
        {
            System.out.println(m.start());
            System.out.println(m.end());
            System.out.println(m.group());
            c++;
        }
        System.out.println("Value of c "+c);
    }

}

/*
Output :

0
3
nee
9
12
Nee
Value of c 2

 */

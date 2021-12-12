import java.util.regex.*;
public class regex4 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("nee",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("neetargetNeeString");
        int ctr=0;
        while(m.find())
        {
            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
            ctr++;
        }
        System.out.println(ctr);}
}


/*Output

0   3   nee
9   12   Nee
2

 */
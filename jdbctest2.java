import javax.naming.Name;
import java.sql.*;
import java.util.Scanner;

public class jdbctest2 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");//Register
        Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/mrgreshsehrawat","root","");

//        //  (1.) inserting Data
//        Scanner sc = new Scanner(System.in);
//
//        String Name = "KrishnaRadhe";
//        int Marks = 89;
//        int RollNo = 64;
//
//        String q = "insert into student value(?,?,?)";
//        PreparedStatement ps = co.prepareStatement(q);
//        ps.setInt(1,RollNo);
//        ps.setInt(3,Marks);
//        ps.setString(2,Name);
//        ps.executeUpdate();


        // (2.) Update Contant
//        String e = "update student SET Name = ? where RollNo = ?";
//        PreparedStatement ps = co.prepareStatement(e);
//        ps.setInt(2,9);
//        ps.setString(1,"Jalal");
//        ps.executeUpdate();


        //(3.) Delete Content
//        String k = "delete from student where Marks = ?";
//        PreparedStatement ps = co.prepareStatement(k);
//        ps.setInt(1,95);




        // ps.executeUpdate();




        Statement stm = co.createStatement();




        //      (4.) Delete Content
//      stm.execute("delete from student where RollNo = 24 ");


        // (5.) Update Contant
//        stm.executeUpdate("update student SET Name = 'Govind' where RollNo = 48");




        ResultSet rst = stm.executeQuery("select * from student");
        while (rst.next())
        {
            System.out.println(rst.getInt("RollNo") +" "+ rst.getString("Name") +" "+ rst.getInt("Marks"));

        }


    }
}

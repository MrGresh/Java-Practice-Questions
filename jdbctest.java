import java.sql.*;
import java.util.Scanner;

public class jdbctest {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");//Register
        Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/gla","root","");

        Scanner sc = new Scanner(System.in);
        String Name = "Gresh";
        int Marks = 100;

        String q = "insert into seca value(?,?)";
        PreparedStatement ps = co.prepareStatement(q);
        ps.setString(1,Name);
        ps.setInt(2,Marks);
        ps.executeUpdate();  // inserting data into Table



        Statement stm = co.createStatement();
        ResultSet rst = stm.executeQuery("select * from seca");

        while (rst.next())
        {
            System.out.println(rst.getString("Name"));
            System.out.println(rst.getInt("Marks"));
        }


    }
}

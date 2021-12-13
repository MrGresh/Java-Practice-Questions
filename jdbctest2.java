import java.sql.*;
public class jdbctest2 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");//Register
        Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/mrgreshsehrawat","root","");

        Statement stm = co.createStatement();
        ResultSet rst = stm.executeQuery("select * from student");

        while (rst.next())
        {
            System.out.println(rst.getInt("RollNo") +" "+ rst.getString("Name") +" "+ rst.getInt("Marks"));
//            System.out.println(rst.getString("Name"));
//            System.out.println(rst.getInt("Marks"));
        }

    }
}

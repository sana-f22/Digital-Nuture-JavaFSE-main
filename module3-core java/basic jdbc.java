import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "password"
            );

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM students");

            while(rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                                   rs.getString(2));
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
import java.sql.*;

public class TransactionDemo {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "password"
            );

            con.setAutoCommit(false);

            Statement st = con.createStatement();

            st.executeUpdate(
                "UPDATE accounts SET balance = balance - 100 WHERE id=1"
            );

            st.executeUpdate(
                "UPDATE accounts SET balance = balance + 100 WHERE id=2"
            );

            con.commit();

            System.out.println("Transaction Success");

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
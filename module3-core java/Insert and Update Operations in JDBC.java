import java.sql.*;

public class StudentDAO {

    Connection con;

    StudentDAO() throws Exception {
        con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test",
            "root",
            "password"
        );
    }

    void insertStudent(int id, String name) throws Exception {

        PreparedStatement ps =
            con.prepareStatement(
                "INSERT INTO students VALUES(?,?)"
            );

        ps.setInt(1, id);
        ps.setString(2, name);

        ps.executeUpdate();
    }
}
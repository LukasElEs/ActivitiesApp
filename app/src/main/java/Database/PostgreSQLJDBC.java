package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PostgreSQLJDBC {

    String url = "jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true";
    Connection conn;
    {
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

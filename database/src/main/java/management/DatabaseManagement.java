package management;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Michał Szewczyk on 2017-02-03.
 *
 */
public class DatabaseManagement {
    public static final String url = "jdbc:derby:carDb";
    private DriverManagerDataSource dataSource;

    public void setDataSource(DriverManagerDataSource dataSource) {
        this.dataSource = dataSource;
    }
    @SuppressWarnings("all")
    public void setupDerbyDatabase() {
        String url = "jdbc:derby:carDb;create=true";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("CREATE TABLE cars (" + "id INTEGER PRIMARY KEY, " + "model VARCHAR(255), " + "price DECIMAL)");
            stmt.executeUpdate("INSERT INTO cars VALUES (1, 'Mercedes', 100)");
            stmt.executeUpdate("INSERT INTO cars VALUES (2, 'BMW', 200)");
            stmt.executeUpdate("INSERT INTO cars VALUES (3, 'Audi', 300)");
        } catch (SQLException sqlExc) {
            System.out.println("Database already exists.");
        }
    }

}

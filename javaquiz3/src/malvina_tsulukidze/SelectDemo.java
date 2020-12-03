package malvina_tsulukidze;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo {
    public static void main(String[] args) {
        try {

            // 1. Get a Connection to Database
            Class.forName("org.h2.Driver");
            Connection myConn = DriverManager.
                    getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "123");

            // 2. Create Statment
            Statement myStatement = myConn.createStatement();

            // 3. Execute SQL Query
            ResultSet myResultSet = myStatement.executeQuery("select * from Car");

            // 4. process the result set
            while (myResultSet.next()) {
                System.out.println(myResultSet.getString("id") + " " + myResultSet.getString("Manufacturer") + " " + myResultSet.getString("Model") + " " + myResultSet.getString("Price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
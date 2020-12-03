package malvina_tsulukidze;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateDemo {
    public static void main(String[] args) {
        try {
            // 1. Get a Connection to Database
            Class.forName("org.h2.Driver");
            Connection myConn = DriverManager.
                    getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "123");

            // 2. Create Statment
            Statement myStatement = myConn.createStatement();

            // 3. Execute SQL Query
            String query = " UPDATE Car SET Price='40000' WHERE id=1";

            myStatement.executeUpdate(query);
            System.out.println("Succsess");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

package malvina_tsulukidze;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.concurrent.ExecutionException;

public class InsertDemo {
    public static void main(String[] args) throws Exception{
        // 1. get connection
        Class.forName("org.h2.Driver");
        Connection myConn = DriverManager.
                getConnection ("jdbc:h2:tcp://localhost/~/test", "sa","123");
        System.out.println("კავშირი დამყარებულია");

        // 2. create statment
        Statement myStatement = myConn.createStatement();

        // 3. execute query
        String query= "INSERT INTO Car (id,Manufacturer  ,Model ,Price ) VALUES ('1','Ford','Mustang', '27000');";

        myStatement.executeUpdate(query);
        System.out.println("მონაცემები ჩაიწერა");

    }
}


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class mysqlTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rolinhamole";
        String username = "Java";
        String password ="pass";
        
        System.out.println("Connecting...");
        
        try(Connection con = DriverManager.getConnection(url,username,password)){
            System.out.println("Connected!");
        }catch(SQLException e){
            throw new IllegalStateException("Couldt do it!",e);
        }
    }
}

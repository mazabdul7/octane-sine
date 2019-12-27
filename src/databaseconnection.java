
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author mazab
 */
public class databaseconnection {
    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    //change this according to your local server and change the database name to yours
    final static String DB_URL = "jdbc:mysql://localhost:3306/student";
    
    final static String USER = "root";
    final static String PASS = "";
    
    public static Connection connection(){
        try{
            Class.forName(JDBC_DRIVER);
            
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            return conn;
            
        }catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}

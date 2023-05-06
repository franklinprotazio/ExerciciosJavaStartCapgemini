package TodoApp;

import java.sql.Connection;
import util.ConnectionFactory;

/**
 *
 * @author Protazio
 */
public class Main {

    public static void main(String[] args) {
        
        Connection c = ConnectionFactory.getConnection();
        
        ConnectionFactory.closeConnection(c);
       
    }
    
}

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConsultasCRUD {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String dbURL = "jdbc:mysql://localhost:3306/reto5";
        String username = "root";
        String password = "xw5H4a3^";
        // conectar
        try {
            Connection conn = DriverManager.getConnection ( dbURL , username , password );
            System.out.println ("\n Conexión exitosa\n");
            String sql = "SELECT * FROM clientes";
            Statement statement = conn.createStatement ();
            ResultSet result = statement.executeQuery ( sql );
         while ( result.next() ){
            String alias = result.getString(1);
            String nombre = result.getString(2);
           //String apellidos = result.getString(3);
           //String email = result.getString(4);
            System.out.println("Alias: "+alias+"\tNombre: "+nombre);
        }
 
        } catch (SQLException ex) {
    }
    }
}
  

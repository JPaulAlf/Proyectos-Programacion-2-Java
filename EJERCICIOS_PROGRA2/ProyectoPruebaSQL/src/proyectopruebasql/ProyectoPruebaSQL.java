
package proyectopruebasql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProyectoPruebaSQL {

    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        // TODO code application logic here
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       String connectionURL="jdbc:sqlserver://DESKTOP-73ATU6M:1433;databaseName=Mercado;user=usuarioSQL;password=123;";
       Connection con=DriverManager.getConnection(connectionURL);
       System.out.println("nos conectamos");
        
       
    //   Statement st= "";
       
    }
    
}

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conection {
    private static Connection conn = null;
    private String username = "PROYECTO_PROGRA";
    private String password = "1234";
    private String url = "jdbc:oracle:thin:@localhost:1521:umg";
    
    private Connection connectionDB() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(this.url, this.username, this.password);
            conn.setAutoCommit(false);
            
            if (conn != null) {
                System.out.println("Conexion a la base de datos exitosa");
            } else {
                System.out.println("No se pudo conectar a la base de datos");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion erronea" + e.getMessage());
        }
        return conn;
    }
    
    public static Connection getConnection() {        
        if (conn == null) {
            Conection connectionDb = new Conection();
            connectionDb.connectionDB();
        }
        
        return conn;
    }
}

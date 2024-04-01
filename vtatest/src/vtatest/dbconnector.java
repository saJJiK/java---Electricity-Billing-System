
package vtatest;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class dbconnector {
    
    public Connection databaseConnection(){
        
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/for_vta?autoReconnect=false&users=false", "root", "");
//            JOptionPane.showMessageDialog(null, "Database Connected");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Not Connected, Check your server");
        }
        return con;
    }
    
}

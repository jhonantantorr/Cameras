
package DAL;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhonatan
 */
public class ConectaBd {
    public static Connection conectabd() throws ClassNotFoundException{
        try{
            Class.forName("org.postgresql.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/Crud", "postgres", "postgre");
            JOptionPane.showMessageDialog(null, "Conectado com Sucesso");
            return con;
        }
        catch(SQLException error){
            JOptionPane.showInternalMessageDialog(null, error);
            
            return null;
            
                }
    }
    
}

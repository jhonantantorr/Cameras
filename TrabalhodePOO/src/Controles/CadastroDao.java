
package Controles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Jhonatan
 */
public class CadastroDao{
    public static void main(String[] args) {
        try{
            Statement s;
            String usuario = "postgres";
            String senha = "postgre";
            String url = "jdbc:postgresql://localhost:5433/CadastroCamera";
            
            Class.forName("org.postgresql.Driver");
                    
            Connection c = DriverManager.getConnection(url, usuario, senha);
            s = c.createStatement();
            
            s.executeQuery("INSERT INTO CAMERA(NOME,LOCAL_CAMERA,TIPO,DESCRICAO,STATUS)VALUES('TESTE4','Sala','Infravermelho','TESTE3','Habilitado')");
            
            s.close();
            }catch(Exception E){
                System.out.println("/n" + E);
            }
    }
    
}

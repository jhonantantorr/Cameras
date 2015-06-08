/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;


import java.sql.*;

/**
 *
 * @author Jhonatan
 */
public class TestaPostgres{
    public static void main(String[] args) throws ClassNotFoundException {
        try{
            Statement s;
            String usuario = "postgres";
            String senha = "postgre";
            String url = "jdbc:postgresql://localhost:5433/Cameras";
            
            Class.forName("org.postgresql.Driver");
                    
            Connection c = DriverManager.getConnection(url, usuario, senha);
            s = c.createStatement();
            
            s.executeQuery("INSERT INTO CAMERA(CAM_NOME,CAM_LOCAL,CAM_TIPO,CAM_DESCRICAO,CAM_STATUS)VALUES('CAMERA3','Sala','Infravermelho','TESTE3','Habilitado')");
            
            s.close();
            }catch(SQLException error){
                System.out.println("/n" + error);
            }
    }
    
}

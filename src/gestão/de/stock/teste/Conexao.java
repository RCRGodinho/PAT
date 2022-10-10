/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestão.de.stock.teste;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PAT
 */
public class Conexao {
    
    //variaveis
    String orcUrl = "jdbc:oracle:thin:@//localhost:1521/teste";
     String driver = "oracle.jdbc.OracleDriver";
     String user = "dbadmin";
     String pass = "admin";
     
     public Conexao() {
    }
    
    
    //função de criação de conexao

    /**
     *
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public Connection fazerConexao() throws SQLException, ClassNotFoundException
    {
        Connection conn = null;
        
        
        
        try{
            Class.forName(this.driver);
            conn = DriverManager.getConnection(this.orcUrl, this.user, this.pass);
            return conn; 
        }catch(ClassNotFoundException | SQLException x)
        {
            System.out.println(x);
            return null;
        }
    }

    
     
    
}

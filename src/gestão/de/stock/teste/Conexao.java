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
    static final String orcUrl = "jdbc:oracle:thin:@//localhost:1521/teste";
    static final String driver = "oracle.jdbc.OracleDriver";
    static final String user = "dbadmin";
    static final String pass = "admin";
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    Conexao()
    {
        this.con = null;
        this.stmt = null;
        this.rs = null;
    }

    public static String getUser() {
        return user;
    }
    
     
     ResultSet fazerQuery(String st) throws SQLException, Exception
     { 
         
        //variavel de conexão à bd
            con = DriverManager.getConnection(Conexao.orcUrl, Conexao.user, Conexao.pass);
            Statement stm = con.createStatement();
            
            Class.forName(Conexao.driver);
            
        //Conexao
            try{
                rs = stm.executeQuery(st);
              
                return rs;

            }catch(SQLException exp){
                throw new Exception ("Conexao falhou");
            }finally{
                if(this.rs!=null) this.rs.close();
                if(this.stmt!=null) this.stmt.close();
                if(this.con!=null) this.con.close();
            }
     }
     
     
    
    
    
}

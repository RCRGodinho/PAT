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
import java.util.Properties;

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
    Connection con = null;

     static String getOrcUrl() {
        return orcUrl;
    }

     static String getDriver() {
        return driver;
    }

     static String getUser() {
        return user;
    }

     static String getPass() {
        return pass;
    }
     
     int fazConexao(String st) throws SQLException
     { 
        //variavel de conexão à bd
    con = DriverManager.getConnection(Conexao.orcUrl, Conexao.user, Conexao.pass);
    Statement stm = con.createStatement();
    ResultSet rs = stm.executeQuery(st);
         
    return 0;
     }
   
    /*
    // Fazer a conexão à BD
    //variavel de conexão à bd
    con = DriverManager.getConnection(Conexao.orcUrl,Conexao.user,Conexao.pass);
    Statement stm = con.createStatement();
    ResultSet rs = stm.executeQuery(st);
     ********************************************************************************
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try
    {
    Class.forName(driver);
    con = java.sql.DriverManager.getConnection(orcUrl,user,pass);
    }
    catch(Exception exp)
    {
    throw new Exception (exp.getMessage());
    }finally
    {
    if(rs!=null) rs.close();
    if(stmt!=null) stmt.close();
    if(con!=null) con.close();
    }
     */

    

    
     
     
    
    
    
}

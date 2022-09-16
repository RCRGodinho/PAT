/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestão.de.stock.teste;

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

    public Conexao() {
    }

    

    
     
     
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stevent.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DesenvolvedorJava
 */
public class FabricaDeConexoes {
    
    private FabricaDeConexoes(){
        
    }
    
    
    public static Connection conectar() {

        Connection con = null;

        try {
            String drive = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/forsoft";
            String usr = "root";
            String pwd = "root";
            
            Class.forName(drive);

            con = DriverManager.getConnection(url, usr, pwd);

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        return con;
    }

    public static void desconectar(Connection con) {

        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (Exception e) {
        }

    }
    
}

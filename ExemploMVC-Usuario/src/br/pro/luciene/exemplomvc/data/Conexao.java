/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.exemplomvc.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lucas Basseti
 */
public class Conexao {
    
    public static Connection con = null;
    
    public Conexao() throws Exception {
    }
    
    public static Connection getConexao() throws SQLException {
        String user = "alunoLP1"; 
        String senha = "oradba"; 
        String url = "jdbc:oracle:thin:@localhost:1521:XE";

        con = DriverManager.getConnection(url, user, senha);
        
        return con;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Guilherme Bialas
 */
public class ConexaoFactory {

    private static String CLASS_NAME = "jdbc.mysql.com.Driver";
    private static String HOST = "jdbc:mysql://localhost:/exercicio_banco_01";
    private static String LOGIN = "root";
    private static String SENHA = "";
    private static Connection conexao;

    public static Connection obterConexao() {
        try {
            conexao = DriverManager.getConnection(LOGIN, HOST, SENHA);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexao;
    }

    public static void fecharConexao() {
        try {
            if (conexao != null) {
                conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rodrigo - modifications to use with Oracle Database
 * @original author www.programaresfacil.cl
 */
public class Conexion {

    private Connection conexion;

    public Conexion obtener() {
        String url = "jdbc:mysql://localhost:3306/db";
        //String url = "jdbc:oracle:thin:@40.117.103.135:1521:orcl";
        String user = "Rodrigo";
        String password = "Maniac300chang";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            setConexion(DriverManager.getConnection(url, user, password));

            if (getConexion() != null) {
                System.out.println("Bienvenido");
            } else {
                System.out.println("Conexión Fallida");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public ResultSet consultar(String sql) {
        ResultSet resultado;
        try {
            Statement sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return resultado;
    }
}

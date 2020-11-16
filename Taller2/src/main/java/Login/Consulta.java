/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Modelo.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Fabián
 */
public class Consulta {
    public boolean consultaAsignatura(String ID)throws SQLException{
        try{
            Conexion conexion = new Conexion().obtener();
            ResultSet resultado = conexion.consultar("SELECT id, nivel_id, profesor_id, nombre FROM asignatura WHERE id = '" +ID+ "'" );
            resultado.next();
            if (resultado.getRow() >0){
                Asignatura asignatura = Asignatura.getInstance();
              asignatura.setNivel_id(resultado.getString("nivel_id"));
              asignatura.setProfesor_id(resultado.getString("profesor_id"));
              asignatura.setNombre(resultado.getString("nombre"));
              conexion.closeConexion();
              return true;
            }
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
    
    public boolean consultaAdministrador(String ID)throws SQLException{
        try{
            Conexion conexion = new Conexion().obtener();
            ResultSet resultado = conexion.consultar("SELECT id, login, clave, email FROM administrador WHERE id = '" +ID+ "'" );
            resultado.next();
            if (resultado.getRow() >0){
                Administrador admin = Administrador.getInstance();
              admin.setLogin(resultado.getString("login"));
              admin.setClave(resultado.getString("clave"));
              admin.setEmail(resultado.getString("email"));
              conexion.closeConexion();
              return true;
            }
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
    
    public boolean consultaAlumno(String ID)throws SQLException{
        try{
            Conexion conexion = new Conexion().obtener();
            ResultSet resultado = conexion.consultar("SELECT id, nivel_id, login, clave, nombre, apellidos FROM alumno WHERE id = '" +ID+ "'" );
            resultado.next();
            if (resultado.getRow() >0){
                Alumno alumno = Alumno.getInstance();
              alumno.setNivel_id(resultado.getString("nivel_id"));
              alumno.setLogin(resultado.getString("login"));
              alumno.setContraseña(resultado.getString("clave"));
              alumno.setNombre(resultado.getString("nombre"));
              alumno.setApellidos(resultado.getString("apellidos"));
              conexion.closeConexion();
              return true;
            }
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
    
    public boolean consultaProfesor(String ID)throws SQLException{
        try{
            Conexion conexion = new Conexion().obtener();
            ResultSet resultado = conexion.consultar("SELECT id, login, clave, nombre, apellidos, email, especialista FROM profesor WHERE id = '" +ID+ "'" );
            resultado.next();
            if (resultado.getRow() >0){
                Profesor profe = Profesor.getInstance();
              profe.setLogin(resultado.getString("login"));
              profe.setContraseña(resultado.getString("clave"));
              profe.setNombre(resultado.getString("nombre"));
              profe.setApellidos(resultado.getString("apellidos"));
              profe.setEmail(resultado.getString("email"));
              profe.setEspecialista(resultado.getString("especialista"));
              conexion.closeConexion();
              return true;
            }
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
}
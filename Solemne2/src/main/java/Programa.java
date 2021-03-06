import Vistas.*;
import Modelo.*;
import Controlador.*;
import Login.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabián
 */
public class Programa {
    public static void main(String[] args){
        Login login = new Login();
        Insert insert = new Insert();
        Delete delete = new Delete();
        Consulta consulta = new Consulta();
        Update update = new Update();
        frmLogin ventana_login = new frmLogin();
        frmAltaUsuario ventana_alta_usuario = new frmAltaUsuario();
        frmPrincipalAdmin ventana_principal_admin = new frmPrincipalAdmin();
        frmPrincipalAlumno ventana_principal_alumno = new frmPrincipalAlumno();
        frmPrincipalProfesor ventana_principal_profesor = new frmPrincipalProfesor();
        frmBajaUsuario ventana_baja_usuario = new frmBajaUsuario();
        frmBajaAsignatura ventana_baja_asignatura = new frmBajaAsignatura();
        frmAltaAsignatura ventana_alta_asignatura = new frmAltaAsignatura();
        frmModAsignatura ventana_mod_asignatura = new frmModAsignatura();
        frmModUsuario ventana_mod_usuario = new frmModUsuario();
        frmMatricularAlumno ventana_mat_alumno = new frmMatricularAlumno();
        frmConsultarNota ventana_consultar_nota = new frmConsultarNota();
        frmListarAlumnos ventana_listar_alumnos = new frmListarAlumnos();
        frmListarProfesores ventana_listar_profesores = new frmListarProfesores();
        frmListarAlumnos2 ventana_listar_alumnos2 = new frmListarAlumnos2();
        frmListarProfesores2 ventana_listar_profesores2 = new frmListarProfesores2();
        frmPonerNotas ventana_poner_notas = new frmPonerNotas();
        
        Controlador controlador = new Controlador(login,insert,delete,consulta,update,ventana_login,
                ventana_alta_usuario,ventana_principal_admin, ventana_principal_alumno,ventana_principal_profesor,
                ventana_baja_usuario,ventana_baja_asignatura,ventana_alta_asignatura,ventana_mod_asignatura,
                ventana_mod_usuario,ventana_mat_alumno,ventana_consultar_nota,ventana_listar_alumnos,
                ventana_listar_profesores, ventana_listar_alumnos2, ventana_listar_profesores2,ventana_poner_notas);
        
        controlador.Iniciar();
    }
}

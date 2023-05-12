/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.sql.*;
import javax.swing.JOptionPane;
import Modelos.Conexion;

/**
 *
 * @author carlt
 */
public class EmpleadosModel {
  
    Connection miConexion;
    ResultSet rst;
    Conexion nuevaConexion;

    public EmpleadosModel(Connection miConexion, ResultSet rst, Conexion nuevaConexion) {
        this.miConexion = miConexion;
        this.rst = rst;
        this.nuevaConexion = nuevaConexion;
    }

   
     public ResultSet ListarDatos(){
         
         try{
             miConexion=nuevaConexion.Conectar();
             Statement Sentencia =miConexion.createStatement();
             rst=Sentencia.executeQuery("Select * from Empleados");
                     return rst;
             
         }
         catch(SQLException e){
             JOptionPane.showMessageDialog(null,"No Se Pudo Listar");
             return rst;
         }
         
     }
}

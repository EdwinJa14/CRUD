/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.sql.*;

/**
 *
 * @author carlt
 */
public class EmpleadosModel {
    int codigo;
    String apellidos;
    String nombre;
    int telefono;
    Connection miConexion;

    public EmpleadosModel(int codigo, String apellidos, String nombre, int telefono) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public EmpleadosModel() {
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public void GuardarPersona()
    {
      try
        {
            Conexion nuevaConexion = new Conexion();
            this.miConexion = nuevaConexion.Conectar(nombre, nombre);
            Statement sentencia = miConexion.createStatement();
            sentencia.execute("insert into Persona values ()");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    public void AgregarEmpleado(int codigo, String apellidos, String nombre, int telefono)
    {
        try
        {
            Conexion nuevaConexion = new Conexion();
            this.miConexion = nuevaConexion.Conectar(nombre, nombre);
            Statement sentencia = miConexion.createStatement();
            sentencia.execute("insert into Persona values ()");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    public void editarEmpleado()
    {
        try{
            Conexion nuevaConexion = new Conexion();
            this.miConexion = nuevaConexion.Conectar(nombre, nombre);
            Statement sentencia = miConexion.createStatement();
            sentencia.execute("insert into Persona values ()");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    public void EliminarEmpleado()
    {
        try{
            Conexion nuevaConexion = new Conexion();
            this.miConexion = nuevaConexion.Conectar(nombre, nombre);
            Statement sentencia = miConexion.createStatement();
            sentencia.execute("insert into Persona values ()");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}

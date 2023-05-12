/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelos.Conexion;
import Vistas.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author carlt
 */
public class EmpleadosController implements ActionListener {
    frmPrincipal VistaPrincipal;
    frmEmpleado VistaEmpleados;
    Conexion ModeloConeccion;

    public EmpleadosController(frmPrincipal VistaPrincipal, frmEmpleado VistaEmpleados, Conexion ModeloConeccion) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaEmpleados = VistaEmpleados;
        this.ModeloConeccion = ModeloConeccion;
        
        this.VistaPrincipal.btnEntrar.addActionListener(this);
        this.VistaEmpleados.btnAgregar1.addActionListener(this);
        this.VistaEmpleados.btnEditar.addActionListener(this);
        this.VistaEmpleados.btnActualizar.addActionListener(this);
        this.VistaEmpleados.btnEliminar.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnEntrar)
        {
            this.ModeloConeccion.Conectar("","");
            
            this.VistaEmpleados.setVisible(true);this.VistaEmpleados.setBackground(Color.green);
        }
    }
    
    
}

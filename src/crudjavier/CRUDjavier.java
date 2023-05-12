/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudjavier;

import Controlador.EmpleadosController;
import Modelos.Conexion;
import Vistas.frmEmpleado;
import Vistas.frmPrincipal;

/**
 *
 * @author umg
 */
public class CRUDjavier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         frmPrincipal VistaPrincipal = new frmPrincipal();
    frmEmpleado VistaEmpleados =  new frmEmpleado(null,true);
    Conexion ModeloConexion = new Conexion();
    EmpleadosController Controlador = new EmpleadosController(VistaPrincipal, VistaEmpleados, ModeloConexion);
    }
    
}

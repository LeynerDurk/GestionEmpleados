/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primercorteconstruccion;

import java.util.List;

public class DocenteCreator extends EmpleadoFactory {
    
    
    @Override
    public Empleado crearEmpleado(List<Permiso> permisos) {
        Docente docente = new Docente();
        docente.setPermisos(permisos);  // Asignar permisos personalizados
        return docente;
    }
}


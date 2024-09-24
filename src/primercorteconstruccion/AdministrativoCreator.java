/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primercorteconstruccion;

import java.util.List;

public class AdministrativoCreator extends EmpleadoFactory {
    @Override
    public Empleado crearEmpleado(List<Permiso> permisos) {
        Administrativo administrativo = new Administrativo();
        administrativo.setPermisos(permisos);  // Asignar permisos personalizados
        return administrativo;
    }
}


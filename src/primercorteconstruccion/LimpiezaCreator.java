/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primercorteconstruccion;


import java.util.List;

public class LimpiezaCreator extends EmpleadoFactory {

    public LimpiezaCreator() {
    }
    @Override
    public Empleado crearEmpleado(List<Permiso> permisos) {
        Limpieza limpieza = new Limpieza();
        limpieza.setPermisos(permisos);  // Asignar permisos personalizados
        return limpieza;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primercorteconstruccion;

import java.util.ArrayList;
import java.util.List;

public class Limpieza implements Empleado {
    private List<Permiso> permisos;

    public Limpieza() {
        this.permisos = new ArrayList<>();
        // Permisos predeterminados para el personal de limpieza
        this.permisos.add(Permiso.LIMPIAR_INSTALACIONES);
    }

    @Override
    public void trabajar() {
        System.out.println("El personal de limpieza está limpiando las instalaciones.");
    }

    @Override
    public List<Permiso> getPermisos() {
        return permisos;
    }

    @Override
    public void setPermisos(List<Permiso> permisos) {
        this.permisos = permisos;
    }

    
}

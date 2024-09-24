/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primercorteconstruccion;
import java.util.ArrayList;
import java.util.List;

public class Administrativo implements Empleado {
    private List<Permiso> permisos;

    public Administrativo() {
        this.permisos = new ArrayList<>();
        // Permisos predeterminados para un administrativo
        this.permisos.add(Permiso.GESTIONAR_RECURSOS);
    }

    @Override
    public void trabajar() {
        System.out.println("El administrativo está gestionando las tareas del colegio.");
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

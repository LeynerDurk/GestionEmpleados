/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primercorteconstruccion;
import java.util.ArrayList;
import java.util.List;

public class Docente implements Empleado {
    private List<Permiso> permisos;

    public Docente() {
        this.permisos = new ArrayList<>();
        // Permisos predeterminados para un docente
        this.permisos.add(Permiso.GESTIONAR_ESTUDIANTES);
    }

    @Override
    public void trabajar() {
        System.out.println("El docente está enseñando a los estudiantes.");
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
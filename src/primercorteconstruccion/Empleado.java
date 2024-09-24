/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primercorteconstruccion;

import java.util.List;


public interface Empleado {
    void trabajar();  // Definir método trabajar
    List<Permiso> getPermisos();  // Definir método getPermisos
    void setPermisos(List<Permiso> permisos);  // Definir método setPermisos
}
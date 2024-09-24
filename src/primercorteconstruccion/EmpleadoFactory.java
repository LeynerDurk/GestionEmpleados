
package primercorteconstruccion;


import java.util.List;

public abstract class EmpleadoFactory {
    // Método abstracto que debe implementarse en las subclases
    public abstract Empleado crearEmpleado(List<Permiso> permisos);
}

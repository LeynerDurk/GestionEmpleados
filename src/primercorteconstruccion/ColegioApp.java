
package primercorteconstruccion;

import java.util.ArrayList;
import java.util.List;

public class ColegioApp {
    public static void main(String[] args) {
        // Crear fábricas de empleados
        EmpleadoFactory docenteFactory = new DocenteCreator();
        EmpleadoFactory administrativoFactory = new AdministrativoCreator();
        EmpleadoFactory limpiezaFactory = new LimpiezaCreator();

        // Crear listas de permisos personalizados
        List<Permiso> permisosDocente = new ArrayList<>();
        permisosDocente.add(Permiso.GESTIONAR_ESTUDIANTES);
        permisosDocente.add(Permiso.GESTIONAR_RECURSOS);  // Permisos adicionales

        List<Permiso> permisosLimpieza = new ArrayList<>();
        permisosLimpieza.add(Permiso.LIMPIAR_INSTALACIONES);
        

        List<Permiso> permisosAdmin = new ArrayList<>();
        permisosAdmin.add(Permiso.GESTIONAR_RECURSOS);

        // Crear empleados con permisos personalizados
        Empleado docente = docenteFactory.crearEmpleado(permisosDocente);
        Empleado administrativo = administrativoFactory.crearEmpleado(permisosAdmin);
        Empleado limpieza = limpiezaFactory.crearEmpleado(permisosLimpieza);

        // Mostrar el trabajo de cada empleado
        docente.trabajar();
        administrativo.trabajar();
        limpieza.trabajar();

        // Mostrar los permisos asignados a cada empleado
        System.out.println("Permisos del docente: " + docente.getPermisos());
        System.out.println("Permisos del administrativo: " + administrativo.getPermisos());
        System.out.println("Permisos del personal de limpieza: " + limpieza.getPermisos());
    }
}

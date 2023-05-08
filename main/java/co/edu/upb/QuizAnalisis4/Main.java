package co.edu.upb.QuizAnalisis4;

public class Main {

    public static void main(String[] args) {
        TaskController controller = new TaskController();

        // Crear algunas tareas
        Task tarea1 = new Task("Comprar leche", "Ir al supermercado y comprar leche", false);
        Task tarea2 = new Task("Hacer ejercicio", "Ir al gimnasio y hacer una hora de ejercicio", true);
        Task tarea3 = new Task("Hacer la tarea", "Resolver los ejercicios del libro de matemáticas", false);
        
        // Agregar tareas al controlador
        controller.agregarTarea(tarea1);
        controller.agregarTarea(tarea2);
        controller.agregarTarea(tarea3);

        // Mostrar tareas
        controller.mostrarTareas();

        // Actualizar tarea
        int indice = 1;
        String nuevoTitulo = "Comprar pan";
        String nuevaDescripcion = "Ir a la panadería y comprar pan";
        boolean nuevaCompletada = true;
        controller.actualizarTarea(indice, nuevoTitulo, nuevaDescripcion, nuevaCompletada);

        // Mostrar tareas actualizadas
        controller.mostrarTareas();

        // Eliminar tarea
        indice = 2;
        controller.eliminarTarea(indice);

        // Mostrar tareas actualizadas
        controller.mostrarTareas();
    }
}

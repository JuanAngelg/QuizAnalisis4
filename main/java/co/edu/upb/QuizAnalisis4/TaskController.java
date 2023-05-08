package co.edu.upb.QuizAnalisis4;

import java.util.ArrayList;

public class TaskController {
    private final ConsoleView view;
    private final ArrayList<Task> tareas;
    
    public TaskController() {
        view = new ConsoleView();
        tareas = new ArrayList<>();
    }
    
    public void iniciar() {
        int opcion;
        do {
            view.mostrarMenu();
            opcion = view.leerOpcion();
            
            switch (opcion) {
                case 1 -> mostrarTareas();
                case 2 -> agregarTarea();
                case 3 -> actualizarTarea();
                case 4 -> eliminarTarea();
                case 5 -> view.mostrarMensaje("Adios!");

            }
        }
        }
}
    
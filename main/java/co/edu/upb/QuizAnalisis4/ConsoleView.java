package co.edu.upb.QuizAnalisis4;

import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;
    
    public ConsoleView() {
        scanner = new Scanner(System.in);
    }
    
    public void mostrarMenu() {
        System.out.println("==========");
        System.out.println("MENU");
        System.out.println("==========");
        System.out.println("1. Mostrar tareas");
        System.out.println("2. Agregar tarea");
        System.out.println("3. Actualizar tarea");
        System.out.println("4. Eliminar tarea");
        System.out.println("5. Salir");
        System.out.println("==========");
    }
    
    public int leerOpcion() {
        System.out.print("Ingrese una opcion: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }
    
    public void mostrarTareas(Task[] tareas) {
        System.out.println("==========");
        System.out.println("TAREAS");
        System.out.println("==========");
        for (int i = 0; i < tareas.length; i++) {
            Task tarea = tareas[i];
            System.out.println((i+1) + ". " + tarea.getTitulo() + " - " + tarea.getDescripcion() + " - " + (tarea.isCompletada() ? "Completada" : "Pendiente"));
        }
        System.out.println("==========");
    }
    
    public String leerTitulo() {
        System.out.print("Ingrese el titulo de la tarea: ");
        return scanner.nextLine();
    }
    
    public String leerDescripcion() {
        System.out.print("Ingrese la descripcion de la tarea: ");
        return scanner.nextLine();
    }
    
    public int leerIndice() {
        System.out.print("Ingrese el indice de la tarea: ");
        return scanner.nextInt();
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}


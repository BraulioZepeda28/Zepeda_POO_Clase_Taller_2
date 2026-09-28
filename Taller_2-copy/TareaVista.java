import java.util.Scanner;

public class TareaVista {
    private Scanner scn;

    public TareaVista() {
        // Scanner usando System.in para leer el teclado
        scn = new Scanner(System.in);
    }

    //  Vista recibe los datos sueltos y ella decide cómo dibujarlos
    public void mostrarTarea(int indiceNumerico, String nombre, String descripcion, boolean completada) {
        String estado = completada ? "[X]" : "[ ]";
        System.out.println(indiceNumerico + ". " + estado + " " + nombre + " - " + descripcion);
    }
    
    
    
    public void limpiarConsola() {
        System.out.print('\u000C'); 
    }

    
    
    public void pausar() {
        System.out.println("\nPresiona Enter para continuar...");
        scn.nextLine();
    }

    // Muestra las opciones y retorna la eleccion del usuario
    public int mostrarMenu() {
        limpiarConsola(); 
        System.out.println(" Administrador de tareas ");
        System.out.println("1 = Agregar tarea");
        System.out.println("2 = Eliminar tarea");
        System.out.println("3 = Mostrar tareas");
        System.out.println("4 = Completar tarea");
        System.out.println("5 = Salir");
        System.out.print("Escribe una opcion: ");
        
        int opcion = 0;
        if (scn.hasNextInt()) {
            opcion = scn.nextInt();
        }
        scn.nextLine(); // Limpiamos el buffer del Scanner
        return opcion;
    }

    
    
    
    
    // Pide texto al usuario
    public String solicitarTexto(String mensaje) {
        System.out.print(mensaje);
        String texto = "";
        if (scn.hasNextLine()) {
            texto = scn.nextLine();
        }
        return texto;
    }
    
    

    // Pide numeros al usuario
    public int solicitarNumero(String mensaje) {
        System.out.print(mensaje);
        int numero = -1;
        if (scn.hasNextInt()) {
            numero = scn.nextInt();
        }
        scn.nextLine(); // Limpieza de buffer
        return numero;
    }

    
    // Mensajes genericos
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    
    // Tarea con su numero de lista
    public void mostrarTarea(int indiceNumerico, String detalleTarea) {
        System.out.println(indiceNumerico + ". " + detalleTarea);
    }
}
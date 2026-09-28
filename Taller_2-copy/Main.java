public class Main {
    public static void main(String[] args) {
        // Instancias de los datos y la interfaz
        ListaTareas modelo = new ListaTareas();
        TareaVista vista = new TareaVista();
        
        // Mediador y le pasamos las referencias
        TareaControlador controlador = new TareaControlador(modelo, vista);
        
        // Ejecución
        controlador.iniciar();
    }
}
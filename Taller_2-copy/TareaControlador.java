public class TareaControlador {
  
    private ListaTareas modelo;
    private TareaVista vista;

    public TareaControlador(ListaTareas modelo, TareaVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    // Ciclo principal del programa
    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            int opcion = vista.mostrarMenu(); // Llamada externa a la vista
            
            switch (opcion) {
                case 1:
                    agregarTarea();
                    vista.pausar();
                    break;
                case 2:
                    eliminarTarea();
                    vista.pausar();
                    break;
                case 3:
                    mostrarTareas();
                    vista.pausar();
                    break;
                case 4:
                    completarTarea();
                    vista.pausar();
                    break;
                case 5:
                    vista.mostrarMensaje("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    vista.mostrarMensaje("Opcion invalida.");
                    vista.pausar();
            }
        }
    }

    private void mostrarTareas() {
        if (modelo.getTamano() == 0) {
            vista.mostrarMensaje("No hay tareas.");
            return;
        }
        for (int i = 0; i < modelo.getTamano(); i++) {
            Tarea t = modelo.obtener(i);
            // El controlador extrae la información en bruto y se la avienta a la vista
            vista.mostrarTarea(
                (i + 1), 
                t.getNombre(), 
                t.getDescripcion(), 
                t.getCompletada()
            );
        }
    }
    
    
    private void agregarTarea() {
        String nombre = vista.solicitarTexto("Ingresa el nombre: ");
        String desc = vista.solicitarTexto("Ingresa la descripcion: ");
        
        // El controlador crea el objeto Tarea y se lo pasa al modelo
        Tarea nuevaTarea = new Tarea(nombre, desc); 
        modelo.agregar(nuevaTarea);
        
        vista.mostrarMensaje("Tarea agregada.");
    }


    private void eliminarTarea() {
        mostrarTareas();
        if (modelo.getTamano() > 0) {
            int indice = vista.solicitarNumero("Indice a eliminar: ");
            // 1 porque el ArrayList inicia en 0
            modelo.eliminar(indice - 1);
            vista.mostrarMensaje("Acción ejecutada (si el índice era válido).");
        }
    }


    private void completarTarea() {
        mostrarTareas();
        if (modelo.getTamano() > 0) {
            int indice = vista.solicitarNumero("Indice a completar: ");
            // Restamos 1 para coincidir con la posición real en el ArrayList
            modelo.completar(indice - 1);
            vista.mostrarMensaje("Accion ejecutada.");
        }
    }
}
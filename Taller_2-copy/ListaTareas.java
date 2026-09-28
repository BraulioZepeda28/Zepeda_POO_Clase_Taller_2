import java.util.ArrayList;

public class ListaTareas {
    // Coleccion
    private ArrayList<Tarea> lista;

    // Constructor
    public ListaTareas() {
        lista = new ArrayList<>();
    }

    // Agrega un objeto Tarea al final de la coleccion
    public void agregar(Tarea t) {
        lista.add(t); 
    }

    // Elimina un elemento
    public void eliminar(int indice) {
        // índice sea valido
        if(indice >= 0 && indice < lista.size()) {
            lista.remove(indice); 
        }
    }

    
    // Obtener referencia de tarea 
    public Tarea obtener(int indice) {
        if(indice >= 0 && indice < lista.size()) {
            return lista.get(indice); 
        }
        return null;
    }

    // Devuelve la cantidad de elementos actuales en la lista
    public int getTamano() {
        return lista.size(); 
    }    
    
    
    // Tarea completada usando su índice
    public void completar(int indice) {
        Tarea t = obtener(indice);
        if(t != null) {
            t.setCompletada(true); 
        }
    }


}
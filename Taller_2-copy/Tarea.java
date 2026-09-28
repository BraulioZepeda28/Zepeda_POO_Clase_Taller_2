
public class Tarea {
    // Atributos
    private String nombre;
    private String descripcion;
    private boolean completada;

    //Constructor
    public Tarea(String nombre, String descripcion) { 
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completada = false; // Toda tarea inicia sin completar
    }
     
    
    
    // Getters y Setters para acceder o modificar los atributos privados
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean getCompletada() {
        return completada;
    }
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    
}
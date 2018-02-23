

package examen1_angelt;


public class Sistema {
    
    protected String sistema, nombre;
    protected int capacidad;
    protected Carpeta root;

    public Sistema() {
    }
    
    public Sistema(String sistema, String nombre, int capacidad, Carpeta root) {
        this.sistema = sistema;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.root = root;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Carpeta getRoot() {
        return root;
    }

    public void setRoot(Carpeta root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "\\" + nombre + "\\" + root;
    }
    
    
    
    
}

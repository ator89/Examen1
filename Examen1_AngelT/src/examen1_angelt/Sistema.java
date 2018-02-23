

package examen1_angelt;


public class Sistema {
    
    protected String sistema, nombre;
    
    public Sistema() {
    }

    public Sistema(String sistema, String nombre) {
        this.sistema = sistema;
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Sistema{" + "sistema=" + sistema + ", nombre=" + nombre + '}';
    }

    

}

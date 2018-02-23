

package examen1_angelt;

import java.util.Date;


public class Ejecutable extends Archivo{
    
    private Texto archivo;
    
    public Ejecutable() {
    }

    public Ejecutable(Texto archivo, String nom_archivo, int size, Date creacion, Date modif, String sistema, String nombre, int capacidad, Carpeta root) {
        super(nom_archivo, size, creacion, modif, sistema, nombre, capacidad, root);
        this.archivo = archivo;
    }

    public Texto getArchivo() {
        return archivo;
    }

    public void setArchivo(Texto archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return archivo + ".exec";
    }

    
    

}

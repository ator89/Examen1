

package examen1_angelt;

import java.util.Date;


public class Fichero {
    
    protected String nombre;
    protected int size;
    protected Date creacion, modif;

    public Fichero() {
    }

    public Fichero(String nombre, int size, Date creacion, Date modif) {
        this.nombre = nombre;
        this.size = size;
        this.creacion = creacion;
        this.modif = modif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public Date getModif() {
        return modif;
    }

    public void setModif(Date modif) {
        this.modif = modif;
    }

    @Override
    public String toString() {
        return "Fichero{" + "nombre=" + nombre + ", size=" + size + ", creacion=" + creacion + ", modif=" + modif + '}';
    }
    
    

}

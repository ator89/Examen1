

package examen1_angelt;

import java.util.Date;


public abstract class Archivo extends Sistema implements Comandos{
    
    protected String nom_archivo;
    protected int size;
    protected Date creacion, modif;

    public Archivo() {
        super();
    }

    public Archivo(String nombre, int size, Date creacion, Date modif) {
        this.nom_archivo = nombre;
        this.size = size;
        this.creacion = creacion;
        this.modif = modif;
    }

    public String getNombre() {
        return nom_archivo;
    }

    public void setNombre(String nombre) {
        
        if (nom_archivo==null){
            this.nom_archivo = "root";
        }
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
        return "Fichero{" + "nombre=" + nom_archivo 
                + ", size=" + size + ", creacion=" 
                + creacion + ", modif=" + modif + '}';
    }
    
    

}

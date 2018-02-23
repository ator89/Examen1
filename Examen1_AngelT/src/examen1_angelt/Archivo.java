

package examen1_angelt;

import java.util.Date;


public class Archivo extends Sistema {
    
    protected String nom_archivo="root";
    protected int size;
    protected Date creacion, modif;

    public Archivo() {
        super();
    }

    public Archivo(String nom_archivo, int size, Date creacion, Date modif, String sistema, String nombre, int capacidad, Carpeta root) {
        super(sistema, nombre, capacidad, root);
        this.nom_archivo = nom_archivo;
        this.size = size;
        this.creacion = creacion;
        this.modif = modif;
    }

    public String getNom_archivo() {
        return nom_archivo;
    }

    public void setNom_archivo(String nom_archivo) {
        this.nom_archivo = nom_archivo;
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
        return "Archivo{" + "nom_archivo=" + nom_archivo + ", size=" + size + ", creacion=" + creacion + ", modif=" + modif + '}';
    }


}

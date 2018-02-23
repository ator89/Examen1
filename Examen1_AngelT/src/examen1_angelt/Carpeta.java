

package examen1_angelt;

import java.util.ArrayList;
import java.util.Date;


public class Carpeta extends Archivo{
    
    private ArrayList<Archivo> archivo = new ArrayList();

    public Carpeta() {
        super();
    }

    public Carpeta(String nom_archivo, int size, Date creacion, Date modif, String sistema, String nombre, int capacidad, Carpeta root) {
        super(nom_archivo, size, creacion, modif, sistema, nombre, capacidad, root);
    }

    public ArrayList<Archivo> getArchivo() {
        return archivo;
    }

    public void setArchivo(ArrayList<Archivo> archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return super.nom_archivo+"\\";
    }

    

}

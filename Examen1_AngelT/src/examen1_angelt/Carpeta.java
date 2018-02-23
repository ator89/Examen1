

package examen1_angelt;

import java.util.ArrayList;
import java.util.Date;


public class Carpeta extends Archivo{
    
    private ArrayList<ArchivoTexto> archivo = new ArrayList();

    public Carpeta() {
        super();
    }

    public Carpeta(String nombre, int size, Date creacion, Date modif) {
        super(nombre, size, creacion, modif);
    }

    public ArrayList<ArchivoTexto> getArchivo() {
        return archivo;
    }

    public void setArchivo(ArrayList<ArchivoTexto> archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Carpeta{" + "archivo=" + archivo + '}';
    }

}

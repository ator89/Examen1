

package examen1_angelt;

import java.util.Date;



public class Texto extends Archivo{
    
    private String texto;

    public Texto() {
    }

    public Texto(String texto, String nom_archivo, int size, Date creacion, Date modif, String sistema, String nombre, int capacidad, Carpeta root) {
        super(nom_archivo, size, creacion, modif, sistema, nombre, capacidad, root);
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return texto + ".txt";
    }
    
    

}

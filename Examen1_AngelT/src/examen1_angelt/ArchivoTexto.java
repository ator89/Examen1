

package examen1_angelt;

import java.util.Date;



public class ArchivoTexto extends Archivo{
    
    private String texto;

    public ArchivoTexto() {
        super();
    }

    public ArchivoTexto(String texto, String nombre, int size, Date creacion, Date modif) {
        super(nombre, size, creacion, modif);
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
        return "Archivo{" + "texto=" + texto + '}';
    }
    

}

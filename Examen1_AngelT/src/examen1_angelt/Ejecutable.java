

package examen1_angelt;

import java.util.Date;


public class Ejecutable extends Archivo{
    
    private ArchivoTexto archivo;
    private Sistema sis;

    public Ejecutable() {
    }

    public Ejecutable(ArchivoTexto archivo, Sistema sis, String nombre, int size, Date creacion, Date modif) {
        super(nombre, size, creacion, modif);
        this.archivo = archivo;
        this.sis = sis;
    }

    public ArchivoTexto getArchivo() {
        return archivo;
    }

    public void setArchivo(ArchivoTexto archivo) {
        this.archivo = archivo;
    }

    public Sistema getSis() {
        return sis;
    }

    public void setSis(Sistema sis) {
        this.sis = sis;
    }

    @Override
    public String toString() {
        return "Ejecutable{" + "archivo=" + archivo + ", sis=" + sis + '}';
    }
    
    

    @Override
    public void crearCarpeta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearArchivoTexto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearArchivoExe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarArchio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cambiarDirectorio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void regresarDirectorio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    

}

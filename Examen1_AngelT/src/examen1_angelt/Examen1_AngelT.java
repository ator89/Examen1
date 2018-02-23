
package examen1_angelt;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Examen1_AngelT {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Sistema> filesys = new ArrayList();
        ArrayList<Archivo> carpeta = new ArrayList();
        ArrayList<Texto> text = new ArrayList();
        ArrayList<Ejecutable> exec = new ArrayList();
        
        try{
            
            System.out.println("Ingrese el nombre del sistema: ");
            String sistema = sc.next();
            
            System.out.println("Escriba el nombre del usuario: ");
            String user = sc.next();
            
            System.out.println("Ingrese el tamaño de la carpeta: ");
            int tamano=sc.nextInt();
            
            filesys.add(new Sistema(sistema, user, tamano, new Carpeta()));
            System.out.print(filesys);
            String opcion = "";
            do{
                System.out.print(carpeta);
                opcion=sc.next();
                switch(opcion){
                    case "mkdir":
                        String nfolder= sc.next();
                        
                        carpeta.add(new Carpeta(nfolder, tamano, new Date(), new Date(), sistema, nfolder, tamano, new Carpeta()));
                        
                        System.out.println(carpeta);
                        System.out.println();
                        break;
                        
                    case "cat":
                        String ntxt=sc.next();
                        text.add(new Texto(ntxt, opcion, tamano, new Date(), new Date(), sistema, ntxt, tamano, new Carpeta()));
                        System.out.println(text);
                        
                        break;
                        
                    case "mod":
                        break;
                        
                    case "cd":
                        break;
                        
                    case "ls":
                        System.out.println("-----");
                        for (Archivo c : carpeta) {
                            if ( c instanceof Archivo){
                            System.out.println("Directorio "+carpeta);
                        }
                        }
                        System.out.println("-----");
                        for (Archivo t : text) {
                            if ( t instanceof Archivo){
                            System.out.println("Archivos de texto "+text);
                        }
                        }
                        System.out.println("-----");
                        for (Archivo e : exec) {
                            if ( e instanceof Archivo){
                            System.out.println("Archivos "+exec);
                        }
                        }
                        break;
                        
                    case "del":
                        System.out.println("Crear archivo de texto: ");
                        int pos=sc.nextInt();
                        text.remove(pos);
                        break;
                        
                    case "exec":
                        break;
                        
                    default:
                        System.err.println("No existe el comando "
                                +opcion+". Intente nuevamente\n");
                        break;
                            
                }
                
                
            } while (!opcion.equalsIgnoreCase("exit"));
            
            
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Ha ocurrido un error fatal.\n");
        }
        
    }

}


package examen1_angelt;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Examen1_AngelT {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Sistema> filesys = new ArrayList();
        
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
            //System.out.print(filesys);
            String opcion = "";
            do{
                System.out.print(filesys);
                opcion=sc.next();
                switch(opcion){
                    case "mkdir":
                        String nfolder= sc.next();
                        int tam =sc.nextInt();
                        
                        //carpeta.add(new Carpeta(nfolder, tamano, new Date(), new Date(), sistema, nfolder, tamano, new Carpeta()));
                        
                        //filesys.add(new Archivo());
                        filesys.add(new Carpeta(nfolder, tam, new Date(), new Date(), sistema, nfolder, tamano, new Carpeta()));
                        
                        System.out.println(filesys);
                        System.out.println();
                        break;
                        
                    case "cat":
                        String cat=sc.next();
                        if (cat.endsWith(".txt")){
                            //System.out.println("Ingrese el contenido del tetxo: \n");
                            //String contenido = sc.next();
                            
                            
                            
                        text.add(new Texto(cat, opcion, tamano, new Date(), new Date(), sistema, cat, tamano, new Carpeta()));
                        System.out.println(text);
                        
                        } else if (cat.endsWith(".exec")){
                            exec.add(new Ejecutable(new Texto(), opcion, tamano, new Date(), new Date(), sistema, cat, tamano, new Carpeta()));
                            System.out.println(exec);
                        }
                        
                        break;
                        
                    case "mod":
                        break;
                        
                    case "cd..":
                        //String cd = sc.next();
                        
                        
                        
                        break;
                        
                    case "ls":
                        System.out.println("-----");
                        String salida="";
                        for (Sistema s : filesys) {
                            if ( s instanceof Archivo){
                                salida+=filesys.indexOf(s)+ "";
                                salida+=s+"\n";
                            }
                        }
                        System.out.println("Directorios: \n"+salida);
                        
                        System.out.println("-----");
                        for (Archivo t : text) {
                            if ( t instanceof Archivo){
                                salida+=filesys.indexOf(t)+ "";
                                salida+=t+"\n";
                            }
                        }
                        System.out.println("Archivos de texto: \n"+text);
                        
                        System.out.println("-----");
                        for (Archivo e : exec) {
                            if ( e instanceof Archivo){
                                salida+=filesys.indexOf(e)+ "";
                                salida+=e+"\n";
                            }
                        }
                        System.out.println("Archivos: \n"+exec);
                        break;
                        
                    case "del":
                        System.out.println("Eliminar directorios: ");
                        int pos=sc.nextInt();
                        if(pos==0){
                            System.err.println("No se puede borrar el directorio raíz.\n");
                        }
                        else{
                            filesys.remove(pos);
                        }
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


package examen1_angelt;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Examen1_AngelT {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Sistema> filesys = new ArrayList();
        
        try{
            
            System.out.println("Ingrese el nombre del sistema: ");
            String sistema = sc.next();
            
            System.out.println("Escriba el nombre del usuario: ");
            String user = sc.next();
            
            System.out.println("Ingrese el tamaño de la carpeta: ");
            int tamano=sc.nextInt();
            
            filesys.add(new Sistema(sistema, user, tamano, new Carpeta()));
            
            String opcion = "";
            do{
                System.out.print(filesys);
                opcion=sc.next();
                switch(opcion){
                    case "mkdir":
                        System.out.println("Escriba el nombre de la carpeta: ");
                        String nfolder= sc.next();
                        
                        filesys.add(new Carpeta(nfolder, tamano, new Date(), new Date()));
                        break;
                        
                    case "cat":
                        break;
                        
                    case "mod":
                        break;
                        
                    case "cd":
                        break;
                        
                    case "ls":
                        break;
                        
                    case "del":
                        break;
                        
                    case "exec":
                        break;
                        
                    default:
                        System.err.println("No existe el comando "
                                +opcion+". Intente nuevamente\n");
                            
                }
                
                
            } while (!opcion.equalsIgnoreCase("exit"));
            
            
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Ha ocurrido un error fatal.\n");
        }
        
    }

}


package examen1_angelt;

import java.util.ArrayList;
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
            
            System.out.println(filesys);
            
            
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Ha ocurrido un error fatal.\n");
        }
        
    }

}

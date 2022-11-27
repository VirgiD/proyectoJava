//nombre, autor,stock
//Determinar el tipo más adecuado para los atributos listados, agregar constructores, 
//getter, setters y método informeLibro() que muestre los valores de los atributos.
//En la clase principal crear 3 objetos del tipo libro y agregarlos a un ArrayList ,
//mostrar luego los elementos del mismo por pantalla (pista puede revisar el video de la clase del
//24/6 como guía).
import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args) {
              
        Libro A = new Libro ("Robin Hood","Sir Walter Scott",50);
        
        Libro B = new Libro ("Cien años de Soledad","Garcia Marquez",30);
        
        Libro C = new Libro ("Rayuela","Cortázar",20);
//        ARRAYLIST
        ArrayList<Libro>ListaLibros= new ArrayList<>();
                
         ListaLibros.add(A);
         ListaLibros.add(B);
         ListaLibros.add(C);
         
         for(Libro i:ListaLibros){
             System.out.println("Nombre: "+ i.getNombre());
             System.out.println("Autor: "+ i.getAutor());
             System.out.println("Stock:" +i.getStock());
         }       
                   
                
    }
    
}

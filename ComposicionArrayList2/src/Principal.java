
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
         
//         for(Libro i:ListaLibros){
//             System.out.println("Nombre: "+ i.getNombre());
//             System.out.println("Autor: "+ i.getAutor());
//             System.out.println("Stock:" +i.getStock());
//             
//             System.out.println("-------------------------------------------------");
//             
//       }   

       
           Biblioteca D = new Biblioteca("Librito","Avenida Santa Fe 59",ListaLibros); 
          
          D.informeBiblioteca();
          D.StockTotal();
          D.StockMax();
    } 
        }
          
    


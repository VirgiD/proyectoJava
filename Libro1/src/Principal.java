
import LibrosAccion.LibrosA;





public class Principal {

    public static void main(String[] args) {
        
      Libro N = new Libro ("EL ALquimista", "Paulo Cohelo","Atlantida", "Novela",5000);
      
        N.resumen();
        N.precio();
        
        System.out.println("------------------------------------------------------------------");    
        
     LibrosA A = new LibrosA ("El rey dragon", "Juana La Loca","Atlantida", "Accion",200);
        
        
        A.resumen();
    }
    
}

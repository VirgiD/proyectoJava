
import java.util.ArrayList;


public class Principal {

    
    public static void main(String[] args) {
        
        Personaje a= new Personaje("Clark","Metropolis","volar","heroe");
        Personaje b= new Personaje ("Petter Parker", "Nueva York","Aracnido","heroe"); 
        Personaje c= new Personaje ("Mujer Maravilla","EE.UU","Látigo","heroe");
        Personaje d = new Personaje ("Duende Verde","Nueva York","tirar bombas","villano");
        Personaje e = new Personaje ("Gatubela","Gothan","Agilidad","villana");
        Personaje f = new Personaje ("Lex Luthor","Metropolis","Inteligencia criminal","villano");
//        a.informePersona();
                
        
        
        ArrayList<Personaje> Heroes = new ArrayList<>();
        
        Heroes.add(a);
        Heroes.add(b);
        Heroes.add(c);
        
        for(Personaje i:Heroes){
            
            
            System.out.println("El personaje "+i.getNombre()+" vive en "
                    + " "+i.getDireccion()+" tiene el super poder de "+ i.getPoder()+ " su rol es "+ i.getRol());
        }
        
        ArrayList <Personaje>Villanos = new ArrayList<>();
        
        Villanos.add(d);
        Villanos.add(e);
        Villanos.add(f);
        
        for(Personaje j:Villanos){
            
            
            System.out.println("El personaje "+j.getNombre()+" vive en "+""
                    + " "+j.getDireccion()+" tiene el super poder de "+ j.getPoder()+ " su rol es  "+ j.getRol());
        }
        
                }
    
}

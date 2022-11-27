
public class Libro {
    
    String Nombre;
    String Autor;
    String Editorial;
    String Genero;
    int precio;

    public Libro(String Nombre, String Autor, String Editorial, String Genero, int precio) {
        this.Nombre = Nombre;
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.Genero = Genero;
        this.precio = precio;
        
        
    }
        
        public void resumen(){
        System.out.println("Libro: "+ Nombre + "\nAutor: "+ Autor + "\nEditorial: " +Editorial+
                            "\nGenero: "+ Genero+ "\nprecio: "+ precio);
            
        }
        
        public void precio (){
            
            System.out.println("El precio de contado es:" +precio +  "\nEL precio de lista es"+precio *1.2 );   
            
        }
        
    }
    
        
    


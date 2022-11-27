
public class Libro {
//    ATRIBUTOS
   private String nombre;
    private String autor;
       private int stock;
//CONSTRUCTOR
    public Libro() {
    }

    public Libro(String nombre, String autor, int stock) {
        this.nombre = nombre;
        this.autor = autor;
        this.stock = stock;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
//   public void InformeLibro(){
//       System.out.println("Nombre: "+ this.nombre+ " "+"Autor: "+this.nombre +" "+"Stock: "+this.stock);
//   } 
       
    
}
  


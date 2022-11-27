
package LibrosAccion;

public class LibrosA {
    
   private String nombre;
   private String Autor;   
   private String Editorial;
   private String Genero;
   private int precio;

    public LibrosA() {
    }

   
   
    public LibrosA(String nombre, String Autor, String Editorial,String Genero, int precio) {
        this.nombre = nombre;
        this.Autor = Autor;
        this.Editorial= Editorial;
        this.Genero = Genero;        
        this.precio = precio;
    }
   
   public void resumen (){
       
    System.out.println(" El libro: "+ getNombre() +"\n Autor: "+ getAutor()+ "\n Editorial: "+ getEditorial()+"\n Genero: "+ getGenero()+ "\n Precio: " + getPrecio());
    
   }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the Autor
     */
    public String getAutor() {
        return Autor;
    }

    /**
     * @param Autor the Autor to set
     */
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    /**
     * @return the Editorial
     */
    public String getEditorial() {
        return Editorial;
    }

    /**
     * @param Editorial the Editorial to set
     */
    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    /**
     * @return the Genero
     */
    public String getGenero() {
        return Genero;
    }

    /**
     * @param Genero the Genero to set
     */
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
   
   
}

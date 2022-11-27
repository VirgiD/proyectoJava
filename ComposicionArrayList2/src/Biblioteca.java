//•nombre
//•direccion
//•inventario (debe contener un ArrayList con los libros de la biblioteca)
//
//•Determinar el tipo mas adecuado para los atributos listados, agregar constructores,
//getter, setters  y método informeBiblioteca() que muestre los valores de los atributos
//y liste los libros de la biblioteca.
//•En la clase principal crear un objeto del tipo Biblioteca , con toda la información 
//necesaria e invocar el método informeBiblioteca().

import java.util.ArrayList;
//ATRIBUTO ARRAYLIST

public class Biblioteca extends Libro {

    private String Nombre;
    private String direccion;
    private ArrayList<Libro> ListaLibros;

    public Biblioteca() {
    }

    public Biblioteca(String Nombre, String direccion) {
        this.Nombre = Nombre;
        this.direccion = direccion;
    }

    public Biblioteca(String Nombre, String direccion, ArrayList<Libro> ListaLibros) {
        this.Nombre = Nombre;
        this.direccion = direccion;
        this. ListaLibros= ListaLibros;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void informeBiblioteca() {
        System.out.println("Biblioteca: " + this.Nombre);
        System.out.println("Direccion: " + this.direccion);

        System.out.println("                            ");
        System.out.println("Inventario: ");
        System.out.println("****************************************************");

        for (Libro i : getListaLibros()) {
            System.out.println("Nombre: " + i.getNombre());
            System.out.println("Autor: " + i.getAutor());
            System.out.println("Stock: " + i.getStock());

            System.out.println("-----------------------------------------------");

        }

    }
//    METODO STOCKTOTAL
public void StockTotal(){
int total=0;
for(Libro i : ListaLibros){
total = i.getStock()+total;
}
System.out.println("El stock total de la biblioteca es de "+total+" libros");
}    
//   METODO STOCKMAXIMO
public void StockMax(){
int j =0;
String name = "";
for(Libro i : ListaLibros){
if(i.getStock()>j){
j=i.getStock();
name=i.getNombre();
}
}
System.out.println("El libro de mayor stock es '"+name+"', con "+j+" libros");
}

    
    public ArrayList<Libro> getListaLibros() {
        return ListaLibros;
    }

   
    public void setListaLibros(ArrayList<Libro> ListaLibros) {
        this.ListaLibros = ListaLibros;
    }
}   
    
                  

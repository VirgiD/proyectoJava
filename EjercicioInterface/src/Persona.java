
public class Persona {
    private String nombre;
    private String direccion;

    public Persona() {
    }

    public Persona(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }    
    
    public void informePersona(){
    
        System.out.print("El personaje: "+nombre+ " "+"vive en: "+ direccion);
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

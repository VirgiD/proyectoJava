
public class Personaje extends Persona implements Mutante {

   private String Poder;
   private String rol;

    public Personaje() {
    }

    public Personaje( String nombre, String direccion,String Poder, String rol) {
        super(nombre, direccion);
        this.Poder = Poder;
        this.rol = rol;
    }
    
    @Override
    public void SuperPoder() {
        System.out.println("Tiene el poder: "+ Poder);
    }

    @Override
    public void Caracter() {
        System.out.println("es un: "+ rol);
    }

    @Override
    public void informePersona() {
        super.informePersona(); 
        
        System.out.println(" tiene el poder "+this.Poder + " es un "+this.rol);
    }

    public String getPoder() {
        return Poder;
    }

    
    public void setPoder(String Poder) {
        this.Poder = Poder;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
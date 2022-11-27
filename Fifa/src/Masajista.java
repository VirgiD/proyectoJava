
public class Masajista extends EQUIPO {
    
    String titulacion;
    int AñosEsperiencia;

    public Masajista() {
    }

    public Masajista(String titulacion, int AñosEsperiencia, int ID, String nombre, String apellido, int edad) {
        super(ID, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.AñosEsperiencia = AñosEsperiencia;
    }
    
    
    public void darMasaje(){
        System.out.println("El masajista "+ getNombre()+ getApellido()+ "debe dar masaje");
    
    }
    
}

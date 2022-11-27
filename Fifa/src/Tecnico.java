
public class Tecnico extends EQUIPO{
    
    private String Federacion;

    public Tecnico() {
    }

    public Tecnico(String Federacion, int ID, String nombre, String apellido, int edad) {
        super(ID, nombre, apellido, edad);
        this.Federacion = Federacion;
    }

    /**
     * @return the Federacion
     */
    public String getFederacion() {
        return Federacion;
    }

    /**
     * @param Federacion the Federacion to set
     */
    public void setFederacion(String Federacion) {
        this.Federacion = Federacion;
    }
    
    public void dirigirPartido(){
    
    }
    
    public void dirigirEntrenamiento(){
    
    }
}

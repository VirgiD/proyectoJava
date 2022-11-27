public class EQUIPO {
    
    private int ID;
    private String nombre;
    private String apellido;
    private int edad;

    public EQUIPO() {
    }

    public EQUIPO(int ID, String nombre, String apellido, int edad) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
   public void informacionPersonal() {
   
       System.out.println("ID: "+ ID + "\nNombre: "+nombre+ "\nApellido: "+ apellido + "\nEdad: "+ edad);
        
   
   }
     public void Concentrarse()  {
      
         System.out.println( nombre + ""+apellido+ " debe concentrarse");   
         
         
    }  
   
     
     public void Viajar(){
     
         System.out.println( nombre +" "+ apellido+ " debe viajar");
     }
}

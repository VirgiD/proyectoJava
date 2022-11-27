
public class Futbolista extends EQUIPO {
    
    private int dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista( int ID, String nombre, String apellido, int edad,int dorsal, String demarcacion ) {
        super(ID, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
        
        
        
    }

    
    public int getDorsal() {
        return dorsal;
    }

    /**
     * @param dorsal the dorsal to set
     */
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    /**
     * @return the demarcacion
     */
    public String getDemarcacion() {
        return demarcacion;
    }

    /**
     * @param demarcacion the demarcacion to set
     */
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
   
  public void jugarPartido(){
  
      System.out.println(  this.getNombre()+ ""+ this.getApellido() +" debe jugar");   
      
  }  
    
    public void entrenar(){
        
        
    
    }
}

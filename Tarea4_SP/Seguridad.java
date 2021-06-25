
/**
 * Write a description of class Seguridad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seguridad extends Persona{    
    private int sueldo;
    public Seguridad(int edad, String nombre, int CI, int sueldo){
        super(edad, nombre, CI);
        this.sueldo = sueldo;
    }  
    public String trabajar(boolean trabajando){
        String res = " ";
        if(trabajando == true){
            res = "El guardia de seguridad "+ nombre + "esta trabajando";
        }
        else{
            res = "El guardia de seguridad "+ nombre + " no esta trabajando";
        }
        return res;
    }
}

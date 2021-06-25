public class Docente extends Persona{
    private String profesion;
    public Docente(int edad, String nombre, int CI, String profesion){
        super(edad, nombre, CI);
        this.profesion = profesion; 
    }
    public String enseniar(boolean enseniando){
        String res = " ";
        if(enseniando == true){
            res = "El docente "+ nombre + "esta dando una clase";
        }
        else{
            res = "El docente "+ nombre + " no esta dando ninguna clase";
        }
        return res;
    }
}
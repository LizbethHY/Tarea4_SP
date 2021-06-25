public class Estudiante extends Persona{
    private String carrera;
    public Estudiante(int edad, String nombre, int CI, String carrera){
        super(edad, nombre, CI);
        this. carrera = carrera;
    }
    public String estudiar(boolean estudiando){
        String res = " ";
        if(estudiando == true){
            res = "El estudiante "+ nombre + " esta estudiando";
        }
        else{
            res = "El estudiante "+ nombre + " no esta estudiando";
        }
        return res;
    }
}

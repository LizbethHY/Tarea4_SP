public class Persona{
    protected int edad;
    protected String nombre;
    protected int CI;
    public Persona(int edad, String nombre, int CI){
        this.edad = edad;
        this.nombre = nombre;
        this.CI = CI;
    }
    public String saludar(){
        return "Hola";
    }
    public String caminar(boolean caminando){
        String res = " ";
        if(caminando == true){
            res = "Persona caminando";
        }
        else{
            res = "La persona no esta caminando";
        }
        return res;
    }
    public String dormir(boolean durmiendo){
        String res = " ";
        if(durmiendo == true){
            res = "Persona durmiendo";
        }
        else{
            res = "La persona no esta durmiendo";
        }
        return res;
    }
}
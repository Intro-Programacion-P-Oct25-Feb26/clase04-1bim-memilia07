/*
René Rolando

Elizalde Solano

1983
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo051 {
    public static void main(String[] args) {
        // Secuencia de escape \n y \t
        String nombreEstudiante = "René Rolando";
        String apellidoEstudiante = "Elizalde Solano";
        int nacimiento = 1983;
        
        System.out.println(nombreEstudiante+"\n"+apellidoEstudiante+ "\n"+ 
                nacimiento);
        
        System.out.println(nombreEstudiante+"\n\n"+apellidoEstudiante+ "\n\n"+ 
                nacimiento);  
        
        System.out.println(nombreEstudiante+"\n"+"\n"+apellidoEstudiante+ "\n"+
                "\n"+ nacimiento); 
        //System.out.println(nombreEstudiante+"\t"+apellidoEstudiante);   
        //System.out.println(nombreEstudiante+"\n\t"+apellidoEstudiante);  
        // El \n\t inserta un salto de lineqa y despues una tabulacion y \t es 4 espacios un tabulador
        
    }
}

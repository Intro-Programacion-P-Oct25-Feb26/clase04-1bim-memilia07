/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {

    public static void main(String[] args) {
        // Uso de printf
        // f: formato

        String nombre = "Maria Emilia";
        String apellido = "Solano Ramirez";
        int edad = 17;
        String universidad = "UTPL";
        String direccion = "Isaac Ordoñez";
        String ciclo = "Primer ciclo";
        String asignatura = "Introduccion a la programacion";
        String paralelo = "A";

        // System.out.println(nombreEstudiante+" "+apellidoEstudiante+ " "+ 
        // nacimiento);
        // En printf; 
        // usamos %s para reemplazar las cadenas, enteros, decimales
        // usamos %d para reemplazar los valores enteros
        // usamos %f para reemplazar los valore decimales
        // System.out.printf("%s\n\n%s\n\n%s\n", nombreEstudiante, 
        //        apellidoEstudiante, nacimiento);
        System.out.printf("Nombre:\n\t%s\n Apellido:\n\t%s\n Edad:\t%s\n Direccion:\n\n\t%s\n-------\n Universidad:\t%s\n Ciclo:\t%s\n Asignatura:\t%s\n Pararelo:\n\t%s\n" , nombre, apellido, edad, direccion, universidad, ciclo, asignatura, paralelo);
    

    
    }
}

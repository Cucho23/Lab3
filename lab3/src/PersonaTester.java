/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laboratorio
 */
public class PersonaTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona=new Persona();
        
        persona.setId(1);
        persona.setNombre("Pablo");
        persona.setGenero('M');
        persona.setEdad(19);
        persona.setEstatura(1.60);
        System.out.println("Id: "+persona.getId());
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Genero: "+persona.getGenero());
        System.out.println("Edad: "+persona.calcularEdad("23/05/1998"));
        System.out.println("Estatura: "+persona.getEstatura());
    }
    
}

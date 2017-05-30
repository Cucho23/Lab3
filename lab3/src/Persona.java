
import javax.print.DocFlavor;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author laboratorio
 */
public class Persona {

    private int id;
    private String nombre;
    private char genero;
    private int edad;
    private double estatura;
public Persona(){
}
public Persona(int param,String param1,char param2,int param3,double param4){
    id= param;
    nombre=param1;
    genero=param2;
    edad=param3;
    estatura=param4;
}
    public void setId(int param) {
        id = param;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String param) {
        nombre = param;
    }

    public String getNombre() {
        return nombre;
    }

    public void setGenero(char param) {
        genero = param;
    }

    public char getGenero() {
        return genero;
    }

    public void setEdad(int param) {
        edad = param;
    }

    public int getEdad() {
        return edad;
    }

    public void setEstatura(double param) {
        estatura = param;
    }
    
     public double getEstatura() {
        return estatura;
    }
    public int calcularEdad(String age){
          DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(age, fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
       // System.out.printf("Tu edad es: %s años, %s meses y %s días",
             //   periodo.getYears(), periodo.getMonths(), periodo.getDays());
        //age=2017
        int año;
        año= periodo.getYears();
    return año;
    }
}


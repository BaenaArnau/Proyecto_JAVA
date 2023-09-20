package Proyecto_JAVA;

import java.util.*;
public class Lector {
    //Clases de lectura y guardado de datos
    private Scanner entrada = new Scanner(System.in);
    private int lectorDeOpcion, edad, anos_inscrito, anos_de_experiencia, id;
    private String DNI, nombre, primer_apellido, segundo_apellido, barrio, fecha_de_creacion;
    private float altura, salario;
    private boolean colonias;

    //Metodos de lectura
    public void LectorDeOpcion(){
        System.out.println();
        lectorDeOpcion = entrada.nextInt();
    }
    public void LectorDeAnos_inscrito(){
        System.out.println("Cuantos años lleva inscrito");
        anos_inscrito = entrada.nextInt();
    }
    public void LectorDeID(){
        System.out.println("ID: ");
        id = entrada.nextInt();
    }
    public void LectorDeEdad(){
        System.out.println("Edad: ");
        edad = entrada.nextInt();
    }
    public void LectorDeAnos_de_experiencia(){
        System.out.println("Anos de experiencia: ");
        anos_de_experiencia = entrada.nextInt();
    }
    public void LectorDeNombre(){
        entrada.nextLine();
        System.out.println("Nombre: ");
        nombre = entrada.next();
    }
    public void LectorDeFecha_de_creacion(){
        entrada.nextLine();
        System.out.println("Fecha de creacion: ");
        fecha_de_creacion = entrada.next();
    }
    public void LectorDeBarrio(){
        entrada.nextLine();
        System.out.println("Barrio: ");
        barrio = entrada.next();
    }
    public void LectorDePrimer_apellido(){
        entrada.nextLine();
        System.out.println("Primer apellido: ");
        primer_apellido = entrada.next();
    }
    public void LectorDeSegundo_apellido(){
        entrada.nextLine();
        System.out.println("Segundo apellido: ");
        segundo_apellido = entrada.next();
    }
    public void LectorDeDNI(){
        entrada.nextLine();
        System.out.println("DNI: ");
        DNI = entrada.next();
    }
    public void LectorDeSalario(){
        System.out.println("Salario: ");
        salario = entrada.nextFloat();
    }
    public void LectorDeAltura(){
        System.out.println("Altura: ");
        altura = entrada.nextFloat();
    }
    public void LectorDeColonias(){
        System.out.println("Colonias (true/false): ");
        colonias = entrada.nextBoolean();
    }

    //Getter
    public int getLectorDeOpcion() {
        return lectorDeOpcion;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getAnos_inscrito() {
        return anos_inscrito;
    }

    public float getAltura() {
        return altura;
    }

    public boolean getColonias() {
        return colonias;
    }

    public int getAnos_de_experiencia() {
        return anos_de_experiencia;
    }

    public float getSalario() {
        return salario;
    }

    public int getId() {
        return id;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getFecha_de_creacion() {
        return fecha_de_creacion;
    }
}

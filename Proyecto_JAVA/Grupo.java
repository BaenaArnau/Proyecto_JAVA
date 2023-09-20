package Proyecto_JAVA;

import java.util.*;

public class Grupo {

    //Atributos de la clase
    private String nombre, fecha_de_creacion;
    private int id;
    private int identificador;

    //ArrayList de la clase
    private ArrayList<Infante> infantes = new ArrayList<Infante>();
    private ArrayList<Monitor> monitores = new ArrayList<Monitor>();

    //Constructor de clase
    public Grupo(String nombre, String fecha_de_creacion, int id, int identificador) {
        this.nombre = nombre;
        this.fecha_de_creacion = fecha_de_creacion;
        this.id = id;
        this.infantes = new ArrayList<Infante>();
        this.monitores = new ArrayList<Monitor>();
        this.identificador = identificador;
    }
    public String toArchivoString() {
        return nombre + ";" + fecha_de_creacion + ";" + id + ";" + identificador;
    }
    //listar la clase

    public String toString() {
        return "Grupo{" +
                "nombre='" + nombre + '\'' +
                ", fecha_de_creacion='" + fecha_de_creacion + '\'' +
                ", id=" + id +
                '}';
    }

    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_de_creacion(String fecha_de_creacion) {
        this.fecha_de_creacion = fecha_de_creacion;
    }

    public ArrayList<Infante> getInfantes() {
        return infantes;
    }

    public ArrayList<Monitor> getMonitores() {
        return monitores;
    }

    public int getId() {
        return id;
    }

    public void setIdentificador(int identificador) {this.identificador = identificador;}
}

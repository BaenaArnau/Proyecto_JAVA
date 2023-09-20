package Proyecto_JAVA;

import java.util.*;
import java.io.*;
public class Centro {

    //Atributos de la clase
    private String barrio, fecha_de_creacion;
    private int id;

    //ArrayList de la clase
    private ArrayList<Grupo> grupos;

    public Centro(String barrio, String fecha_de_creacion, int id) {
        this.barrio = barrio;
        this.fecha_de_creacion = fecha_de_creacion;
        this.id = id;
        this.grupos = new ArrayList<Grupo>();
    }
    public String toArchivoString() {
        return barrio + ";" + fecha_de_creacion + ";" + id;
    }

    //listar la clase

    public String toString() {
        return "Centro{" +
                "barrio='" + barrio + '\'' +
                ", fecha_de_creacion='" + fecha_de_creacion + '\'' +
                ", id=" + id +
                '}';
    }

    //Getter and Setter
    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setFecha_de_creacion(String fecha_de_creacion) {
        this.fecha_de_creacion = fecha_de_creacion;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public int getId() {
        return id;
    }

}

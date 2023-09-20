package Proyecto_JAVA;

public class Persona {

    //Atributos de la clase
    private String DNI, nombre, primer_apellido, segundo_apellido;
    private int edad;
    private float altura;

    //Constructor de clase
    public Persona(String DNI, String nombre, String primer_apellido, String segundo_apellido, int edad, float altura) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.edad = edad;
        this.altura = altura;
    }

    //Listar la clase
    public String toString() {
        return "Persona{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", primer_apellido='" + primer_apellido + '\'' +
                ", segundo_apellido='" + segundo_apellido + '\'' +
                ", edad=" + edad + '\'' +
                ", altura=" + altura +
                '}';
    }
    public String toArchivoString(){
        return DNI + ";" + nombre + ";" + primer_apellido + ";" + segundo_apellido + ";" + edad + ";" + altura + ";";
    }
    //Getter and Setter
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}

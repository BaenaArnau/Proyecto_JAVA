package Proyecto_JAVA;

public class Infante extends Persona{

    //Atributos de la clase
    private int anos_inscrito;
    private int identificador;
    private boolean colonias;

    //Constructor de clase
    public Infante(String DNI, String nombre, String primer_apellido, String segundo_apellido, int edad, int anos_inscrito, float altura, boolean colonias, int identificador) {
        super(DNI, nombre, primer_apellido, segundo_apellido, edad, altura);
        this.anos_inscrito = anos_inscrito;
        this.colonias = colonias;
        this.identificador = identificador;
    }

    //Listar la clase

    public String toString() {
        return "Infante{" +
                super.toString() + '\'' +
                "anos_inscrito=" + anos_inscrito + '\'' +
                ", colonias=" + colonias +
                '}';
    }

    public String toArchivo() {
        return super.toArchivoString() + anos_inscrito + ";" + colonias + ";" + identificador;
    }
    //Setter

    public void setAnos_inscrito(int anos_inscrito) {
        this.anos_inscrito = anos_inscrito;
    }

    public void setColonias(boolean colonias) {
        this.colonias = colonias;
    }

    public void setIdentificador(int identificador) {this.identificador = identificador;}
}
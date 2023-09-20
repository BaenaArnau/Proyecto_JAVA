package Proyecto_JAVA;

public class Monitor extends Persona{

    //Atributos de la clase
    private int identificador;
    private int anos_de_experiencia;
    private float salario;

    //Constructor de clase
    public Monitor(String DNI, String nombre, String primer_apellido, String segundo_apellido, int edad, int anos_de_experiencia, float altura, float salario, int identificador) {
        super(DNI, nombre, primer_apellido, segundo_apellido, edad, altura);
        this.anos_de_experiencia = anos_de_experiencia;
        this.salario = salario;
        this.identificador = identificador;
    }
    //Listar la clase

    public String toString() {
        return "Monitor{" +
                super.toString() + '\'' +
                "anos_de_experiencia=" + anos_de_experiencia + '\'' +
                ", salario=" + salario +
                '}';
    }

    public String toArchivo() {
        return super.toArchivoString() + anos_de_experiencia + ";" + salario + ";" + identificador;
    }

    //Setter

    public void setAnos_de_experiencia(int anos_de_experiencia) {
        this.anos_de_experiencia = anos_de_experiencia;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setIdentificador(int identificador) {this.identificador = identificador;}
}

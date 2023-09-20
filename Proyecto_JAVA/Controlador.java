package Proyecto_JAVA;

import java.util.ArrayList;
import java.io.*;

public class Controlador {

    //Creacion de classes
    int guardarCentro;
    int guardarGrupo;
    int guardarPersona;

    //Creacion de arraylist
    public ArrayList<Centro> centros = new ArrayList<Centro>();

    //Metodos de creacion y comprobacion de clases
    public void CrearInfante(String DNI, String nombre, String primer_apellido, String segundo_apellido, int edad, int anos_inscrito, float altura, boolean colonias){
        boolean encontrado = false;
        for (Infante ifante : centros.get(guardarCentro).getGrupos().get(guardarGrupo).getInfantes()){
            if (ifante.getDNI().equals(DNI)){
                System.out.println("No se puede crear porque ya hay alguien registrado con ese DNI");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            Infante infante = new Infante(DNI, nombre, primer_apellido, segundo_apellido, edad, anos_inscrito, altura, colonias, centros.get(guardarCentro).getGrupos().get(guardarGrupo).getId());
            infante.setIdentificador(centros.get(guardarCentro).getGrupos().get(guardarGrupo).getId());
            centros.get(guardarCentro).getGrupos().get(guardarGrupo).getInfantes().add(infante);
        }
    }
    public void CrearMonitor(String DNI, String nombre, String primer_apellido, String segundo_apellido, int edad, int anos_de_experiencia, float altura, float salario) {
        boolean encontrado = false;
        for (Monitor moni : centros.get(guardarCentro).getGrupos().get(guardarGrupo).getMonitores()) {
            if (moni.getDNI().equals(DNI)) {
                System.out.println("No se puede crear porque ya hay alguien registrado con ese DNI");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            Monitor monitor = new Monitor(DNI, nombre, primer_apellido, segundo_apellido, edad, anos_de_experiencia, altura, salario, centros.get(guardarCentro).getGrupos().get(guardarGrupo).getId());
            monitor.setIdentificador(centros.get(guardarCentro).getGrupos().get(guardarGrupo).getId());
            centros.get(guardarCentro).getGrupos().get(guardarGrupo).getMonitores().add(monitor);
        }
    }
    public void CrearGrupo(String nombre, String fecha_de_creacion, int id){
        boolean existe = false;
        for (Grupo gupo : centros.get(guardarCentro).getGrupos()){
            if (gupo.getId() == id){
                System.out.println("No se puede crear porque ya hay un grupo registrado con ese ID");
                existe = true;
                break;
            }
        }
        if (!existe) {
            Grupo grupo = new Grupo(nombre, fecha_de_creacion, id, centros.get(guardarCentro).getId());
            grupo.setIdentificador(centros.get(guardarCentro).getId());
            centros.get(guardarCentro).getGrupos().add(grupo);
        }
    }

    public void CrearCentro(String barrio, String fecha_de_creacion, int id){
        Centro centro = new Centro(barrio, fecha_de_creacion, id);
        for (Centro cento : centros){
            if (cento.getId() == id){
                System.out.println("No se puede crear porque ya hay un centro registrado con ese ID");
                return; // Sale del método si el centro ya existe
            }
        }
        centros.add(centro); // Agrega el centro a la lista solo si no existe
    }
    //Metodos de eliminacion y comprobacion de clases
    public void EliminarInfante(String DNI){
        int Eliminar = -1;
        for (int i = 0; i < centros.get(guardarCentro).getGrupos().get(guardarGrupo).getInfantes().size(); i++) {
            if (centros.get(guardarCentro).getGrupos().get(guardarGrupo).getInfantes().get(i).getDNI().equals(DNI)) {
                Eliminar = i;
                break;
            }
        }
        if (Eliminar != -1){
            centros.get(guardarCentro).getGrupos().get(guardarGrupo).getInfantes().remove(Eliminar);
            System.out.println("Se a eliminado con exito");
        }else{
            System.out.println("No se a podido eliminar");
        }
    }
    public void EliminarMonitor(String DNI){
        int Eliminar = -1;
        for (int i = 0; i < centros.get(guardarCentro).getGrupos().get(guardarGrupo).getMonitores().size(); i++) {
            if (centros.get(guardarCentro).getGrupos().get(guardarGrupo).getMonitores().get(i).getDNI().equals(DNI)) {
                Eliminar = i;
                break;
            }
        }
        if (Eliminar != -1){
            centros.get(guardarCentro).getGrupos().get(guardarGrupo).getMonitores().remove(Eliminar);
            System.out.println("Se a eliminado con exito");
        }else{
            System.out.println("No se a podido eliminar");
        }
    }
    public void EliminarGrupo(int ID){
        int Eliminar = -1;
        for (int i = 0; i < centros.get(guardarCentro).getGrupos().size(); i++) {
            if (centros.get(guardarCentro).getGrupos().get(i).getId() == ID) {
                Eliminar = i;
                break;
            }
        }
        if (Eliminar != -1){
            centros.get(guardarCentro).getGrupos().remove(Eliminar);
            System.out.println("Se a eliminado con exito");
        }else{
            System.out.println("No se a podido eliminar");
        }
    }
    public void EliminarCentro(int ID){
        int Eliminar = -1;
        for (int i = 0; i < centros.size(); i++) {
            if (centros.get(i).getId() == ID) {
                Eliminar = i;
                break;
            }
        }
        if (Eliminar != -1){
            centros.remove(Eliminar);
            System.out.println("Se a eliminado con exito");
        }else{
            System.out.println("No se a podido eliminar");
        }
    }
    //Metodos de listado internos he externos
    public void ListarCentros(){
        for (Centro centro : centros) {
            System.out.println("ID: " + centro.getId() + " | Barrio: " + centro.getBarrio());
        }
    }
    public void ListarGruposDeCentro(){
        for (Grupo gupo : centros.get(guardarCentro).getGrupos()){
            System.out.println("ID: " + gupo.getId() + " | Nombre: " + gupo.getNombre());
        }
    }
    public void ListarInfantesDeGrupos(){
        for (Infante infante : centros.get(guardarCentro).getGrupos().get(guardarGrupo).getInfantes()){
            System.out.println(infante.toString());
        }
    }
    public void ListarMonitoresDeGrupos(){
        for (Monitor monitor : centros.get(guardarCentro).getGrupos().get(guardarGrupo).getMonitores()){
            System.out.println(monitor.toString());
        }
    }
    public void ListarTodo(){
        System.out.println();
        System.out.println("──────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println();
        for (int i = 0; i < centros.size(); i++){
            System.out.println(centros.get(i).toString());
            for (int j = 0; j < centros.get(i).getGrupos().size(); j++){
                System.out.println(centros.get(i).getGrupos().get(j).toString());
                for (int k = 0; k < centros.get(i).getGrupos().get(j).getInfantes().size(); k++){
                    System.out.println(centros.get(i).getGrupos().get(j).getInfantes().get(k).toString());
                }
                for (int k = 0; k < centros.get(i).getGrupos().get(j).getMonitores().size(); k++){
                    System.out.println(centros.get(i).getGrupos().get(j).getMonitores().get(k).toString());
                }
            }
            System.out.println();
            System.out.println("──────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println();
        }
    }
    //Buscadores internos
    public void BuscarCentroPorID(int ID){
        for (int i = 0; i < centros.size(); i++){
            if (centros.get(i).getId() == ID){
                guardarCentro = i;
            }
        }
    }
    public void BuscarGrupoPorID(int ID){
        for (int i = 0; i < centros.get(guardarCentro).getGrupos().size(); i++){
            if (centros.get(guardarCentro).getGrupos().get(i).getId() == ID){
                guardarGrupo = i;
            }
        }
    }
    public void BuscarInfantePorDNI(String DNI){
        for (int i = 0; i < centros.get(guardarCentro).getGrupos().get(guardarGrupo).getInfantes().size(); i++){
            if (centros.get(guardarCentro).getGrupos().get(guardarGrupo).getInfantes().get(i).getDNI().equals(DNI)){
                guardarPersona = i;
            }
        }
    }
    //Metodos de edicion de clases
    public void EditarDNImonitor(String DNI){
        centros.get(guardarCentro).getGrupos().get(guardarGrupo).getMonitores().get(guardarPersona).setDNI(DNI);
    }
    public void EditarNombreMonitor(String nombre){
        centros.get(guardarCentro).getGrupos().get(guardarGrupo).getMonitores().get(guardarPersona).setNombre(nombre);
    }
    public void EditarPrimer_apellidoMonitor(String primer_apellido){
        centros.get(guardarCentro).getGrupos().get(guardarGrupo).getMonitores().get(guardarPersona).setPrimer_apellido(primer_apellido);
    }
    public void EditarSegundo_apellidoMonitor(String segundo_apellido){
        centros.get(guardarCentro).getGrupos().get(guardarGrupo).getMonitores().get(guardarPersona).setSegundo_apellido(segundo_apellido);
    }
    public void EditarEdadMonitor(int edad){
        centros.get(guardarCentro).getGrupos().get(guardarGrupo).getMonitores().get(guardarPersona).setEdad(edad);
    }
    public void EditarAnosDeExperienciaMonitor(int anos_de_experiencia){
        centros.get(guardarCentro).getGrupos().get(guardarGrupo).getMonitores().get(guardarPersona).setAnos_de_experiencia(anos_de_experiencia);
    }
    public void EditarAlturaMonitor(float altura){
        centros.get(guardarCentro).getGrupos().get(guardarGrupo).getMonitores().get(guardarPersona).setAltura(altura);
    }
    public void EditarSalarioMonitor(float salario){
        centros.get(guardarCentro).getGrupos().get(guardarGrupo).getMonitores().get(guardarPersona).setSalario(salario);
    }
    public void EditarDNIinfante(String DNI){
        centros.get(guardarCentro).getGrupos().get(guardarGrupo).getInfantes().get(guardarPersona).setDNI(DNI);
    }
    public void EditarNombreInfante(String nombre){
        centros.get(guardarCentro).getGrupos().get(guardarGrupo).getInfantes().get(guardarPersona).setNombre(nombre);
    }
    public void EditarPrimer_apellidoInfante(String primer_apellido){
        centros.get(guardarCentro).getGrupos().get(guardarGrupo).getInfantes().get(guardarPersona).setPrimer_apellido(primer_apellido);
    }
    public void EditarSegundo_apellidoInfante(String segundo_apellido){
        centros.get(guardarCentro).getGrupos().get(guardarGrupo).getInfantes().get(guardarPersona).setSegundo_apellido(segundo_apellido);
    }
    public void EditarEdadInfante(int edad){
        centros.get(guardarCentro).getGrupos().get(guardarGrupo).getInfantes().get(guardarPersona).setEdad(edad);
    }
    public void EditarAnos_inscritoInfante(int anos_inscrito){
        centros.get(guardarCentro).getGrupos().get(guardarGrupo).getInfantes().get(guardarPersona).setAnos_inscrito(anos_inscrito);
    }
    public void EditarAlturaInfante(float altura){
        centros.get(guardarCentro).getGrupos().get(guardarGrupo).getInfantes().get(guardarPersona).setAltura(altura);
    }
    public void EditarColoniasInfante(boolean colonias){
        centros.get(guardarCentro).getGrupos().get(guardarGrupo).getInfantes().get(guardarPersona).setColonias(colonias);
    }
    public void EditarNombreGrupo(String nombre){
        centros.get(guardarCentro).getGrupos().get(guardarGrupo).setNombre(nombre);
    }
    public void EditarFechaDeCreacionGrupo(String fecha_de_creacion){
        centros.get(guardarCentro).getGrupos().get(guardarGrupo).setFecha_de_creacion(fecha_de_creacion);
    }
    public void EditarBarrioCentro(String barrio){
        centros.get(guardarCentro).setBarrio(barrio);
    }
    public void EditarFechaDeCreacionCentro(String fecha_de_creacion){
        centros.get(guardarCentro).setFecha_de_creacion(fecha_de_creacion);
    }

    //Metodo para cargar archivos
    public void cargarDatosGuardados() {
        String[] archivos = {"datos/centros.csv", "datos/grupos.csv", "datos/monitores.csv", "datos/infantes.csv"};
        for (String archivo : archivos) {
            File file = new File(archivo);
            File directorio = file.getParentFile();
            if (!directorio.exists()) {
                directorio.mkdirs();
            }
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            String lineaCentro;
            String lineaGrupo;
            String lineaMonitor;
            String lineaInfante;

            BufferedReader lectorDeCentro = new BufferedReader(new FileReader(new File("datos/centros.csv")));
            BufferedReader lectorDeGrupo = new BufferedReader(new FileReader(new File("datos/grupos.csv")));
            BufferedReader lectorDeMonitor = new BufferedReader(new FileReader(new File("datos/monitores.csv")));
            BufferedReader lectorDeInfante = new BufferedReader(new FileReader(new File("datos/infantes.csv")));

            while ((lineaCentro = lectorDeCentro.readLine()) != null) {
                String[] valoresDeCentro = lineaCentro.split(";");
                String barrioDeCentro = valoresDeCentro[0];
                String fechaDeCracionCentro = valoresDeCentro[1];
                int idDeCentro = Integer.parseInt(valoresDeCentro[2]);
                Centro centroAintroducir = new Centro(barrioDeCentro, fechaDeCracionCentro, idDeCentro);

                while ((lineaGrupo = lectorDeGrupo.readLine()) != null) {
                    String[] valoresDeGrupo = lineaGrupo.split(";");
                    String nombreDeGrupo = valoresDeGrupo[0];
                    String fechaDeCreacionDeGrupo = valoresDeGrupo[1];
                    int idDeGrupo = Integer.parseInt(valoresDeGrupo[2]);
                    int identificadorDeGrupo = Integer.parseInt(valoresDeGrupo[3]);
                    Grupo grupoAintroducir = new Grupo(nombreDeGrupo, fechaDeCreacionDeGrupo, idDeGrupo, identificadorDeGrupo);

                    if (idDeCentro == identificadorDeGrupo) {
                        centroAintroducir.getGrupos().add(grupoAintroducir);
                    }

                    while ((lineaMonitor = lectorDeMonitor.readLine()) != null) {
                        String[] valoresDeMonitor = lineaMonitor.split(";");
                        String DNIdeMonitor = valoresDeMonitor[0];
                        String nombreDeMonitor = valoresDeMonitor[1];
                        String primer_apellidoDeMonitor = valoresDeMonitor[2];
                        String segundo_apellidoDeMonitor = valoresDeMonitor[3];
                        int edadDeMonitor = Integer.parseInt(valoresDeMonitor[4]);
                        float alturaDeMonitor = Float.parseFloat(valoresDeMonitor[5]);
                        int anos_de_experienciaDeMonitor = Integer.parseInt(valoresDeMonitor[6]);
                        float salarioDeMonitor = Float.parseFloat(valoresDeMonitor[7]);
                        int identificadorDeMonitor = Integer.parseInt(valoresDeMonitor[8]);
                        Monitor monitorAintroducir = new Monitor(DNIdeMonitor, nombreDeMonitor, primer_apellidoDeMonitor, segundo_apellidoDeMonitor, edadDeMonitor, anos_de_experienciaDeMonitor, alturaDeMonitor, salarioDeMonitor, identificadorDeMonitor);

                        if (idDeGrupo == identificadorDeGrupo) {
                            if (!centroAintroducir.getGrupos().isEmpty()) {
                                centroAintroducir.getGrupos().get(centroAintroducir.getGrupos().size() - 1).getMonitores().add(monitorAintroducir);
                            }
                        }
                    }
                    lectorDeMonitor.close();
                    lectorDeMonitor = new BufferedReader(new FileReader(new File("datos/monitores.csv")));

                    while ((lineaInfante = lectorDeInfante.readLine()) != null) {
                        String[] valoresDeInfantes = lineaInfante.split(";");
                        String DNIdeInfantes = valoresDeInfantes[0];
                        String nombreDeInfantes = valoresDeInfantes[1];
                        String primer_apellidoDeInfantes = valoresDeInfantes[2];
                        String segundo_apellidoDeInfantes = valoresDeInfantes[3];
                        int edadDeInfantes = Integer.parseInt(valoresDeInfantes[4]);
                        float alturaDeInfantes = Float.parseFloat(valoresDeInfantes[5]);
                        int anos_inscritosDeInfantes = Integer.parseInt(valoresDeInfantes[6]);
                        boolean coloniasDeInfantes = Boolean.parseBoolean(valoresDeInfantes[7]);
                        int identificadorDeInfantes = Integer.parseInt(valoresDeInfantes[8]);
                        Infante infanteAintroducir = new Infante(DNIdeInfantes, nombreDeInfantes, primer_apellidoDeInfantes, segundo_apellidoDeInfantes, edadDeInfantes, anos_inscritosDeInfantes, alturaDeInfantes, coloniasDeInfantes, identificadorDeInfantes);

                        if (idDeGrupo == identificadorDeInfantes) {
                            if (!centroAintroducir.getGrupos().isEmpty()) {
                                centroAintroducir.getGrupos().get(centroAintroducir.getGrupos().size() - 1).getInfantes().add(infanteAintroducir);
                            }
                        }
                    }
                    lectorDeInfante.close();
                    lectorDeInfante = new BufferedReader(new FileReader(new File("datos/infantes.csv")));
                }
                centros.add(centroAintroducir);
                lectorDeGrupo.close();
                lectorDeGrupo = new BufferedReader(new FileReader(new File("datos/grupos.csv")));
            }

            lectorDeCentro.close();
            lectorDeGrupo.close();
            lectorDeMonitor.close();
            lectorDeInfante.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //Metodo para guardar archivos
    public void guardarDatos() {
        String[] archivos = {"datos/centros.csv", "datos/grupos.csv", "datos/monitores.csv", "datos/infantes.csv"};

        for (String archivo : archivos) {
            File file = new File(archivo);
            File directorio = file.getParentFile();
            if (!directorio.exists()) {
                directorio.mkdirs();
            }
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            BufferedWriter lectorDeCentro = new BufferedWriter(new FileWriter(new File("datos/centros.csv")));
            BufferedWriter lectorDeGrupo = new BufferedWriter(new FileWriter(new File("datos/grupos.csv")));
            BufferedWriter lectorDeMonitor = new BufferedWriter(new FileWriter(new File("datos/monitores.csv")));
            BufferedWriter lectorDeInfante = new BufferedWriter(new FileWriter(new File("datos/infantes.csv")));

            for (int i = 0; i < centros.size(); i++) {
                lectorDeCentro.write(centros.get(i).toArchivoString());
                lectorDeCentro.newLine();
                for (int j = 0; j < centros.get(i).getGrupos().size(); j++) {
                    lectorDeGrupo.write(centros.get(i).getGrupos().get(j).toArchivoString());
                    lectorDeGrupo.newLine();
                    for (int k = 0; k < centros.get(i).getGrupos().get(j).getMonitores().size(); k++) {
                        lectorDeMonitor.write(centros.get(i).getGrupos().get(j).getMonitores().get(k).toArchivo());
                        lectorDeMonitor.newLine();
                    }
                    for (int k = 0; k < centros.get(i).getGrupos().get(j).getInfantes().size(); k++) {
                        lectorDeInfante.write(centros.get(i).getGrupos().get(j).getInfantes().get(k).toArchivo());
                        lectorDeInfante.newLine();
                    }
                }
            }
            lectorDeCentro.close();
            lectorDeGrupo.close();
            lectorDeMonitor.close();
            lectorDeInfante.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

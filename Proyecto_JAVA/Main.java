package Proyecto_JAVA;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Lector lector = new Lector();
        Controlador controlador = new Controlador();
        controlador.cargarDatosGuardados();

        do {
            menu.menu();
            lector.LectorDeOpcion();
            if (lector.getLectorDeOpcion() == 1) {
                menu.menuAñadirPersona();
                lector.LectorDeOpcion();
                if (lector.getLectorDeOpcion() == 1) {
                    controlador.ListarCentros();
                    lector.LectorDeID();
                    controlador.BuscarCentroPorID(lector.getId());
                    controlador.ListarGruposDeCentro();
                    lector.LectorDeID();
                    controlador.BuscarGrupoPorID(lector.getId());
                    lector.LectorDeDNI();
                    lector.LectorDeNombre();
                    lector.LectorDePrimer_apellido();
                    lector.LectorDeSegundo_apellido();
                    lector.LectorDeEdad();
                    lector.LectorDeAnos_inscrito();
                    lector.LectorDeAltura();
                    lector.LectorDeColonias();
                    controlador.CrearInfante(lector.getDNI(), lector.getNombre(), lector.getPrimer_apellido(), lector.getSegundo_apellido(), lector.getEdad(), lector.getAnos_inscrito(), lector.getAltura(), lector.getColonias());
                } else if (lector.getLectorDeOpcion() == 2) {
                    controlador.ListarCentros();
                    lector.LectorDeID();
                    controlador.BuscarCentroPorID(lector.getId());
                    controlador.ListarGruposDeCentro();
                    lector.LectorDeID();
                    controlador.BuscarGrupoPorID(lector.getId());
                    lector.LectorDeDNI();
                    lector.LectorDeNombre();
                    lector.LectorDePrimer_apellido();
                    lector.LectorDeSegundo_apellido();
                    lector.LectorDeEdad();
                    lector.LectorDeAnos_de_experiencia();
                    lector.LectorDeAltura();
                    lector.LectorDeSalario();
                    controlador.CrearMonitor(lector.getDNI(), lector.getNombre(), lector.getPrimer_apellido(), lector.getSegundo_apellido(), lector.getEdad(), lector.getAnos_de_experiencia(), lector.getAltura(), lector.getSalario());
                }
            } else if (lector.getLectorDeOpcion() == 2) {
                menu.menuEliminarPersona();
                lector.LectorDeOpcion();
                if (lector.getLectorDeOpcion() == 1) {
                    controlador.ListarCentros();
                    lector.LectorDeID();
                    controlador.BuscarCentroPorID(lector.getId());
                    controlador.ListarGruposDeCentro();
                    lector.LectorDeID();
                    controlador.BuscarGrupoPorID(lector.getId());
                    controlador.ListarInfantesDeGrupos();
                    lector.LectorDeDNI();
                    controlador.EliminarInfante(lector.getDNI());
                } else if (lector.getLectorDeOpcion() == 2) {
                    controlador.ListarCentros();
                    lector.LectorDeID();
                    controlador.BuscarCentroPorID(lector.getId());
                    controlador.ListarGruposDeCentro();
                    lector.LectorDeID();
                    controlador.BuscarGrupoPorID(lector.getId());
                    controlador.ListarMonitoresDeGrupos();
                    lector.LectorDeDNI();
                    controlador.EliminarMonitor(lector.getDNI());
                }
            } else if (lector.getLectorDeOpcion() == 3) {
                controlador.ListarCentros();
                lector.LectorDeID();
                controlador.BuscarCentroPorID(lector.getId());
                lector.LectorDeNombre();
                lector.LectorDeFecha_de_creacion();
                lector.LectorDeID();
                controlador.CrearGrupo(lector.getNombre(), lector.getFecha_de_creacion(), lector.getId());
            } else if (lector.getLectorDeOpcion() == 4) {
                controlador.ListarCentros();
                lector.LectorDeID();
                controlador.BuscarCentroPorID(lector.getId());
                controlador.ListarCentros();
                lector.getId();
                controlador.EliminarGrupo(lector.getId());
            } else if (lector.getLectorDeOpcion() == 5) {
                lector.LectorDeBarrio();
                lector.LectorDeFecha_de_creacion();
                lector.LectorDeID();
                controlador.CrearCentro(lector.getBarrio(), lector.getFecha_de_creacion(), lector.getId());
            } else if (lector.getLectorDeOpcion() == 6) {
                controlador.ListarCentros();
                lector.LectorDeID();
                controlador.EliminarCentro(lector.getId());
            } else if (lector.getLectorDeOpcion() == 7) {
                menu.menuEditarPersona();
                lector.LectorDeOpcion();
                if (lector.getLectorDeOpcion() == 1) {
                    controlador.ListarCentros();
                    lector.LectorDeID();
                    controlador.BuscarCentroPorID(lector.getId());
                    controlador.ListarGruposDeCentro();
                    lector.LectorDeID();
                    controlador.BuscarGrupoPorID(lector.getId());
                    controlador.ListarInfantesDeGrupos();
                    lector.LectorDeDNI();
                    controlador.BuscarInfantePorDNI(lector.getDNI());
                    menu.menuEditarInfante();
                    lector.LectorDeOpcion();
                    if (lector.getLectorDeOpcion() == 1) {
                        lector.LectorDeDNI();
                        controlador.EditarDNIinfante(lector.getDNI());
                    } else if (lector.getLectorDeOpcion() == 2) {
                        lector.LectorDeNombre();
                        controlador.EditarNombreInfante(lector.getNombre());
                    } else if (lector.getLectorDeOpcion() == 3) {
                        lector.LectorDePrimer_apellido();
                        controlador.EditarPrimer_apellidoInfante(lector.getPrimer_apellido());
                    } else if (lector.getLectorDeOpcion() == 4) {
                        lector.LectorDeSegundo_apellido();
                        controlador.EditarSegundo_apellidoInfante(lector.getSegundo_apellido());
                    } else if (lector.getLectorDeOpcion() == 5) {
                        lector.LectorDeEdad();
                        controlador.EditarEdadInfante(lector.getEdad());
                    } else if (lector.getLectorDeOpcion() == 6) {
                        lector.LectorDeAltura();
                        controlador.EditarAlturaInfante(lector.getAltura());
                    } else if (lector.getLectorDeOpcion() == 7) {
                        lector.LectorDeAnos_inscrito();
                        controlador.EditarAnos_inscritoInfante(lector.getAnos_inscrito());
                    } else if (lector.getLectorDeOpcion() == 8) {
                        lector.LectorDeColonias();
                        controlador.EditarColoniasInfante(lector.getColonias());
                    }
                } else if (lector.getLectorDeOpcion() == 2) {
                    controlador.ListarCentros();
                    lector.LectorDeID();
                    controlador.BuscarCentroPorID(lector.getId());
                    controlador.ListarGruposDeCentro();
                    lector.LectorDeID();
                    controlador.BuscarGrupoPorID(lector.getId());
                    controlador.ListarInfantesDeGrupos();
                    lector.LectorDeDNI();
                    controlador.BuscarInfantePorDNI(lector.getDNI());
                    menu.menuEditarMonitor();
                    lector.LectorDeOpcion();
                    if (lector.getLectorDeOpcion() == 1) {
                        lector.LectorDeDNI();
                        controlador.EditarDNImonitor(lector.getDNI());
                    } else if (lector.getLectorDeOpcion() == 2) {
                        lector.LectorDeNombre();
                        controlador.EditarNombreMonitor(lector.getNombre());
                    } else if (lector.getLectorDeOpcion() == 3) {
                        lector.LectorDePrimer_apellido();
                        controlador.EditarPrimer_apellidoMonitor(lector.getPrimer_apellido());
                    } else if (lector.getLectorDeOpcion() == 4) {
                        lector.LectorDeSegundo_apellido();
                        controlador.EditarSegundo_apellidoMonitor(lector.getSegundo_apellido());
                    } else if (lector.getLectorDeOpcion() == 5) {
                        lector.LectorDeEdad();
                        controlador.EditarEdadMonitor(lector.getEdad());
                    } else if (lector.getLectorDeOpcion() == 6) {
                        lector.LectorDeAltura();
                        controlador.EditarAlturaMonitor(lector.getAltura());
                    } else if (lector.getLectorDeOpcion() == 7) {
                        lector.LectorDeAnos_de_experiencia();
                        controlador.EditarAnosDeExperienciaMonitor(lector.getAnos_de_experiencia());
                    } else if (lector.getLectorDeOpcion() == 8) {
                        lector.LectorDeSalario();
                        controlador.EditarSalarioMonitor(lector.getSalario());
                    }
                }
            } else if (lector.getLectorDeOpcion() == 8) {
                controlador.ListarCentros();
                lector.LectorDeID();
                controlador.BuscarCentroPorID(lector.getId());
                controlador.ListarGruposDeCentro();
                lector.LectorDeID();
                controlador.BuscarGrupoPorID(lector.getId());
                menu.menuEditarGrupo();
                lector.LectorDeOpcion();
                if (lector.getLectorDeOpcion() == 1) {
                    lector.LectorDeNombre();
                    controlador.EditarNombreGrupo(lector.getNombre());
                } else if (lector.getLectorDeOpcion() == 2) {
                    lector.LectorDeFecha_de_creacion();
                    controlador.EditarFechaDeCreacionGrupo(lector.getFecha_de_creacion());
                }
            } else if (lector.getLectorDeOpcion() == 9) {
                controlador.ListarCentros();
                lector.LectorDeID();
                controlador.BuscarCentroPorID(lector.getId());
                menu.menuEditarCentro();
                lector.LectorDeOpcion();
                if (lector.getLectorDeOpcion() == 1) {
                    lector.LectorDeBarrio();
                    controlador.EditarBarrioCentro(lector.getBarrio());
                } else if (lector.getLectorDeOpcion() == 2) {
                    lector.LectorDeFecha_de_creacion();
                    controlador.EditarFechaDeCreacionCentro(lector.getFecha_de_creacion());
                }
            } else if (lector.getLectorDeOpcion() == 10) {
                controlador.ListarTodo();
            }else if (lector.getLectorDeOpcion() == 11){
                controlador.guardarDatos();
                System.out.println("Se han guardado los datos con exito");
            }else{
                System.out.println("No has elegido un valor valido");
            }
        }while(lector.getLectorDeOpcion() != 0);System.out.println("Saliendo del programa");
    }
}

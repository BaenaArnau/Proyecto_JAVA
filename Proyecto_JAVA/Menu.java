package Proyecto_JAVA;

public class Menu {
    public static void menu(){
        System.out.println("┌──────────────────────────────┐");
        System.out.println("│             MENU             |");
        System.out.println("├──────────────────────────────┤");
        System.out.println("│  (1)  - Añadir Persona       │");
        System.out.println("│  (2)  - Eliminar Persona     │");
        System.out.println("│  (3)  - Añadir Grupo         │");
        System.out.println("│  (4)  - Eliminar Grupo       │");
        System.out.println("│  (5)  - Añadir Centro        │");
        System.out.println("│  (6)  - Eliminar Centro      │");
        System.out.println("│  (7)  - Editar Persona       │");
        System.out.println("│  (8)  - Editar Grupo         │");
        System.out.println("│  (9)  - Editar Centro        │");
        System.out.println("│ (10)  - Listar               │");
        System.out.println("│ (11)  - Guardar cambios      │");
        System.out.println("│  (0)  - Salir                │");
        System.out.println("└──────────────────────────────┘");
    }
    public static void menuAñadirPersona(){
        System.out.println("┌──────────────────────────────┐");
        System.out.println("│  SELECCIONE TIPO DE PERSONA  │");
        System.out.println("│           A AÑADIR           │");
        System.out.println("├──────────────────────────────┤");
        System.out.println("│  (1)  - Añadir Infante       │");
        System.out.println("│  (2)  - Añadir Monitor       │");
        System.out.println("└──────────────────────────────┘");
    }
    public static void menuEliminarPersona(){
        System.out.println("┌──────────────────────────────┐");
        System.out.println("│  SELECCIONE TIPO DE PERSONA  │");
        System.out.println("│          A ELIMINAR          │");
        System.out.println("├──────────────────────────────┤");
        System.out.println("│  (1)  - Eliminar Infante     │");
        System.out.println("│  (2)  - Eliminar Monitor     │");
        System.out.println("└──────────────────────────────┘");
    }
    public static void menuEditarPersona(){
        System.out.println("┌──────────────────────────────┐");
        System.out.println("│  SELECCIONE TIPO DE PERSONA  │");
        System.out.println("│          A EDITAR            │");
        System.out.println("├──────────────────────────────┤");
        System.out.println("│  (1)  - Infante              │");
        System.out.println("│  (2)  - Monitor              │");
        System.out.println("└──────────────────────────────┘");
    }
    public static void menuEditarInfante(){
        System.out.println("┌──────────────────────────────┐");
        System.out.println("│  DATO A CAMBIAR DE INFANTE   │");
        System.out.println("├──────────────────────────────┤");
        System.out.println("│  (1)  - DNI                  │");
        System.out.println("│  (2)  - Nombre               │");
        System.out.println("│  (3)  - Primer apellido      │");
        System.out.println("│  (4)  - Segundo apellido     │");
        System.out.println("│  (5)  - Edad                 │");
        System.out.println("│  (6)  - Altura               │");
        System.out.println("│  (7)  - Años inscrito        │");
        System.out.println("│  (8)  - Colonias             │");
        System.out.println("└──────────────────────────────┘");
    }
    public static void menuEditarMonitor(){
        System.out.println("┌──────────────────────────────┐");
        System.out.println("│  DATO A CAMBIAR DE MONITOR   │");
        System.out.println("├──────────────────────────────┤");
        System.out.println("│  (1)  - DNI                  │");
        System.out.println("│  (2)  - Nombre               │");
        System.out.println("│  (3)  - Primer apellido      │");
        System.out.println("│  (4)  - Segundo apellido     │");
        System.out.println("│  (5)  - Edad                 │");
        System.out.println("│  (6)  - Altura               │");
        System.out.println("│  (7)  - Años de experiencia  │");
        System.out.println("│  (8)  - Salario              │");
        System.out.println("└──────────────────────────────┘");
    }
    public static void menuEditarGrupo(){
        System.out.println("┌──────────────────────────────┐");
        System.out.println("│    DATO A CAMBIAR DE GRUPO   │");
        System.out.println("├──────────────────────────────┤");
        System.out.println("│  (1)  - Nombre               │");
        System.out.println("│  (2)  - Fecha de creacion    │");
        System.out.println("└──────────────────────────────┘");
    }
    public static void menuEditarCentro(){
        System.out.println("┌──────────────────────────────┐");
        System.out.println("│   DATOS A CAMBIAR DE CENTRO  │");
        System.out.println("├──────────────────────────────┤");
        System.out.println("│  (1)  - Barrio               │");
        System.out.println("│  (2)  - Fecha de creacion    │");
        System.out.println("└──────────────────────────────┘");
    }
}

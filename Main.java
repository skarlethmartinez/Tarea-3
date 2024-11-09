/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
    import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;  

// Clase Empleado  
class Empleado {  
    private String nombre;  
    private int edad;  
    private double salario;  

    // Constructor  
    public Empleado(String nombre, int edad, double salario) {  
        this.nombre = nombre;  
        this.edad = edad;  
        this.salario = salario;  
    }  

    // Métodos públicos para acceder y modificar los atributos  
    public String getNombre() {  
        return nombre;  
    }  

    public void setNombre(String nombre) {  
        this.nombre = nombre;  
    }  

    public int getEdad() {  
        return edad;  
    }  

    public void setEdad(int edad) {  
        this.edad = edad;  
    }  

    public double getSalario() {  
        return salario;  
    }  

    public void setSalario(double salario) {  
        this.salario = salario;  
    }  

    public void imprimirInformacion() {  
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Salario: " + salario);  
    }  
}  

// Clase GestorEmpleados  
class GestorEmpleados {  
    private final List<Empleado> empleados;  

    public GestorEmpleados() {  
        empleados = new ArrayList<>();  
    }  

    public void agregarEmpleado(Empleado empleado) {  
        empleados.add(empleado);  
    }  

    public void mostrarEmpleados() {  
        if (empleados.isEmpty()) {  
            System.out.println("No hay empleados registrados.");  
        } else {  
            for (Empleado empleado : empleados) {  
                empleado.imprimirInformacion();  
            }  
        }  
    }  
}  

// Clase  
public class Main {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        GestorEmpleados gestor = new GestorEmpleados();  

        while (true) {  
            System.out.println("1. Agregar empleado");  
            System.out.println("2. Mostrar empleados");  
            System.out.println("3. Salir");  
            System.out.print("Elige una opción: ");  
            int opcion = scanner.nextInt();  
            scanner.nextLine(); // Limpiar el buffer  

            switch (opcion) {  
                case 1 -> {
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del empleado: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese el salario del empleado: ");
                    double salario = scanner.nextDouble();
                    gestor.agregarEmpleado(new Empleado(nombre, edad, salario));
                }
                case 2 -> gestor.mostrarEmpleados();
                case 3 -> {
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opción inválida. Intente de nuevo.");  
            }  
        }  
    }  
}  

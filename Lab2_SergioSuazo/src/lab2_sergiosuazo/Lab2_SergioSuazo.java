
package lab2_sergiosuazo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2_SergioSuazo {

    static Scanner leer=new Scanner(System.in);
    static Random rand=new Random();
    public static void main(String[] args) {
        int opcion=0;
        ArrayList<Personaje> personajes=new ArrayList<>();
        while (opcion!=6)
        {
            System.out.print("1.Creacion de personajes\n"
                    + "2.Modificar personajes \n"
                    + "3.Ver atributos de un personaje\n"
                    + "4.Eliminar Personajes\n"
                    + "5.Combate\n"
                    + "6.Salir\n"
                    + "Elija una opcion: ");
            opcion=leer.nextInt();
            switch(opcion)             
            {
                case 1:
                {
                    int clase, raza, nacionalidad,estatura,peso,edad;
                    String nombre,descripcion;
                    System.out.print("1.Clerigo\n"
                            + "2.Barbaro\n"
                            + "3.Mago\n"
                            + "4.Picaro\n"
                            + "Seleccione la clase del personaje: ");
                    clase=leer.nextInt();
                    System.out.print("1.Norfair\n"
                            + "2.Brinstar\n"
                            + "3.Maridia\n"
                            + "4.Crateria\n"
                            + "Seleccione la nacinalidad: ");
                    nacionalidad=leer.nextInt();
                    System.out.print("1.Mediano\n"
                            + "2.Enano\n"
                            + "3.Elfo\n"
                            + "4.Humano\n"
                            + "Seleccione la raza: ");
                    raza=leer.nextInt();
                    System.out.print("Elija el nombre del personaje: ");
                    nombre=leer.next();
                    System.out.print("Seleccione la estatura (cm): ");
                    estatura=leer.nextInt();
                    System.out.print("Seleccione el peso: ");
                    peso=leer.nextInt();
                    System.out.print("Seleccione la edad: ");
                    edad=leer.nextInt();
                    System.out.println("Descripcion del personaje: ");
                    descripcion=leer.next();
                    Personaje p=new Personaje(nombre, descripcion, clase, estatura, peso, edad, raza, nacionalidad);
                    System.out.println(p);
                    personajes.add(p);
                    System.out.println("Personaje creado exitosamente!");     
                    break;
                }
                case 2:
                {
                    
                    break;
                }
                case 3:
                {
                    break;
                }
                case 4:
                {
                    break;
                }
                case 5:
                {
                    break;
                }
            }
        }
    }
    
}

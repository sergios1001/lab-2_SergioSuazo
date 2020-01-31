
package lab2_sergiosuazo;

import java.util.Random;
import java.util.Scanner;

public class Lab2_SergioSuazo {

    static Scanner leer=new Scanner(System.in);
    static Random rand=new Random();
    public static void main(String[] args) {
        int opcion=0;
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
                    System.out.print("1.Clerigo\n"
                            + "2.Barbaro\n"
                            + "3.Mago\n"
                            + "4.Picaro\n"
                            + "Seleccione la clase del personaje: ");
                    
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

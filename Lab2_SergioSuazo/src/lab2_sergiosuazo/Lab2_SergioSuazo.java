
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
        Personaje a=new Personaje("Sergio", "...",1, 182, 208, 22, 3, 2);
        Personaje b=new Personaje("Alessandro", "...",2, 176, 180, 19, 2, 5);
        Personaje c=new Personaje("Diego", "El mejor instructor de progra",3, 170, 175, 21, 1, 3);
        Personaje d=new Personaje("Leo", "El otro mejor instructor de progra xd",4, 180, 190, 21, 4, 4);
        personajes.add(a);
        personajes.add(b);
        personajes.add(c);
        personajes.add(d);
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
                            + "4.Zebes\n"
                            + "5.Crateria\n"
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
                    printArrayList(personajes);
                    int i;
                    System.out.print("Selecicone cual desea modificar: ");
                    i=leer.nextInt();
                    int mod;
                    System.out.print("1.Nombre\n"
                            + "2.Descripcion\n"
                            + "3.Estatura\n"
                            + "4.Peso\n"
                            + "5.Edad\n"
                            + "6.Clase\n"
                            + "7.Nacionalidad\n"
                            + "8.Raza\n"
                            + "Seleccione que atributo modificar: ");
                    mod=leer.nextInt();
                    switch(mod)
                    {
                        case 1:
                        {
                            String nombre;
                            System.out.print("Nuevo nombre: ");
                            nombre=leer.next();
                            personajes.get(i).setNombre(nombre);
                            break;
                        }
                        case 2:
                        {
                            String descripcion;
                            System.out.print("Nueva descripcion: ");
                            descripcion=leer.next();
                            personajes.get(i).setDescripcion(descripcion);
                            break;
                        }
                        case 3:
                        {
                            int estatura;
                            System.out.print("Nueva estatura: ");
                            estatura=leer.nextInt();
                            personajes.get(i).setEstatura(estatura);
                            break;
                        }
                        case 4:
                        {
                            int peso;
                            System.out.print("Nuevo peso: ");
                            peso=leer.nextInt();
                            personajes.get(i).setPeso(peso);
                            break;
                        }
                        case 5:
                        {
                            int edad;
                            System.out.print("Nueva edad: ");
                            edad=leer.nextInt();
                            personajes.get(i).setEdad(edad);
                            break;
                        }
                        case 6:
                        {
                            int clase;
                            System.out.print("1.Clerigo\n"
                            + "2.Barbaro\n"
                            + "3.Mago\n"
                            + "4.Picaro\n"
                            + "Seleccione la nueva clase del personaje: ");
                            clase=leer.nextInt();
                            personajes.get(i).setClase(clase);
                            break;
                        }
                        case 7:
                        {
                            int nacionalidad;
                            System.out.print("1.Norfair\n"
                            + "2.Brinstar\n"
                            + "3.Maridia\n"
                            + "4.Zebes\n"
                            + "5.Crateria\n"
                            + "Seleccione la nueva nacionalidad: ");
                            nacionalidad=leer.nextInt();
                            personajes.get(i).setNacionalidad(nacionalidad);
                            break;
                        }
                        case 8:
                        {
                            int raza;
                            System.out.print("1.Mediano\n"
                            + "2.Enano\n"
                            + "3.Elfo\n"
                            + "4.Humano\n"
                            + "Seleccione la nueva raza: ");
                            raza=leer.nextInt();
                            personajes.get(i).setRaza(raza);
                            break;
                        }
                        
                    }
                    System.out.println("Se cambio el atributo correctamente!");
                    break;
                }
                case 3:
                {
                    int i;
                    printArrayList(personajes);
                    System.out.print("Seleccione el personaje del cual desea ver los atributos: ");
                    i=leer.nextInt();
                    System.out.println(personajes.get(i));
                    break;
                }
                case 4:
                {
                    int i;
                    printArrayList(personajes);
                    System.out.print("Seleccione el personaje que desea eliminar: ");
                    i=leer.nextInt();
                    personajes.remove(i);
                    System.out.println("Se elimino exitosamente!");
                    break;
                }
                case 5:
                {
                    int i,j;
                    printArrayList(personajes);
                    System.out.print("Elija su jugador: ");
                    i=leer.nextInt();
                    System.out.print("Elija la maquina: ");
                    j=leer.nextInt();
                    Combate(personajes.get(i), personajes.get(j));
                    break;
                }
            }
        }
    }
    public static void printArrayList(ArrayList<Personaje> a)
    {
        for (int i = 0; i < a.size(); i++) 
        {
            System.out.println(i+". "+a.get(i).getNombre());
        }
    }
    public static void Combate(Personaje a,Personaje b)
    {
        while(a.getHP()>0||b.getHP()>0)
        {
            //Estadisticas
            System.out.print("Tu vida: ");
            System.out.println(a.getHP());
            System.out.print("Tu AC: ");
            System.out.println(a.getAC());
            System.out.print("Vida de la maquina: ");
            System.out.println(b.getHP());
            System.out.print("AC de la maquina: ");
            System.out.println(b.getAC());

            //Jugada del jugador
            int jugada;
            System.out.println("1.Atacar\n"
                    + "2.Defender\n"
                    + "Seleccione su jugada: ");
            jugada=leer.nextInt();
            //Jugada maquina
            int jugada2;
            jugada2=1+rand.nextInt(2);
            //definicion de tu jugada
            if(jugada==1)
            {
                System.out.println("Has atacado");
            }
            else
            {
                System.out.println("Has defendido");
            }
            //Maquina se defendio
            if(jugada2==2)
            {
                b.setAC(b.getAC()+15);
                System.out.println("La maquina se defiende");
                
            }
            //Attaque jugador
            if(jugada==1)
            {
                int att;
                att=1+rand.nextInt(100);
                if(att>b.getAC())
                {
                    if(att>a.getCS())
                    {
                        b.setHP(b.getHP()-(a.getDG()*2));
                        System.out.println("Golpe Critico!");
                        System.out.println("Inflijiste "+ a.getDG()*2+" de daño");
                    }
                    else
                    {
                        b.setHP(b.getHP()-a.getDG());
                        System.out.println("Inflijiste "+ a.getDG()+" de daño");
                    }
                    System.out.println("Tu ataque fue exitoso");
                }
                else
                {
                    System.out.println("Tu ataque fallo!");
                }
            }
            else if(jugada==2)
            {
                a.setAC(a.getAC()+15);
            }
            if(b.getHP()<=0)
            {
                System.out.println("La maquina se quedo sin HP, has ganado!");
                break;
            }
            //Ataque de la maquina
            if(jugada2==1)
            {
                System.out.println("La maquina ataca");
                int att;
                att=1+rand.nextInt(100);
                if(att>a.getAC())
                {
                    if(att>b.getCS())
                    {
                        a.setHP(a.getHP()-(b.getDG()*2));
                        System.out.println("Golpe critico!");
                        System.out.println("Recibiste "+ b.getDG()*2+" de daño");
                    }
                    else
                    {
                        a.setHP(a.getHP()-b.getDG());
                        System.out.println("Recibiste "+ b.getDG()+" de daño");
                    }
                    System.out.println("El ataque de la maquina fue exitoso");
                }
                else
                {
                    System.out.println("El ataque de la maquinan fallo!");
                }
            }
            if(a.getHP()<=0)
            {
                System.out.println("Te quedaste sin HP, has perdido!");
                break;
            }
            if(jugada==2)
            {
                a.setAC(a.getAC()-15);
            }
            if(jugada2==2)
            {
                b.setAC(b.getAC()-15);
            }
        }
    }
}


package lab2_sergiosuazo;

import java.util.Random;

public class Personaje {
    static Random rand=new Random();
    private String nombre,descripcion;
    private int clase,estatura,peso,edad,raza,nacionalidad;
    private int HP,CS,AC,DG;

    public Personaje() {
    }

    public Personaje(String nombre, String descripcion, int clase, int estatura, int peso, int edad, int raza, int nacionalidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.clase = clase;
        this.estatura = estatura;
        this.peso = peso;
        this.edad = edad;
        this.raza = raza;
        this.nacionalidad = nacionalidad;
        switch(clase)
        {
            case 1:
            {
                CS=97;
                AC=40;
                DG=5+rand.nextInt(15);
                break;
            }
            case 2:
            {
                CS=93;
                AC=65;
                DG=15+rand.nextInt(30);
                break;
                
            }
            case 3:
            {
                CS=101;
                AC=20;
                DG=5+rand.nextInt(10);
                break;
            }
            case 4:
            {
                CS=80;
                AC=50;
                DG=15+rand.nextInt(25);
                break;
            }
        }
        switch(raza)
        {
            case 1:
            {
                HP=50+rand.nextInt(60);
            }
            case 2:
            {
                HP=80+rand.nextInt(100);
            }
            case 3:
            {
                HP=50+rand.nextInt(70);
            }
            case 4:
            {
                HP=40+rand.nextInt(75);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    public int getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(int nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getCS() {
        return CS;
    }

    public void setCS(int CS) {
        this.CS = CS;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public int getDG() {
        return DG;
    }

    public void setDG(int DG) {
        this.DG = DG;
    }
    

    @Override
    public String toString() {
        String c="",n="",r="";
        switch(raza)
        {
            case 1:
            {
                r="Mediano";
                break;
            }
            case 2:
            {
                r="Enano";
                break;
            }
            case 3:
            {
                r="Elfo";
                break;
            }
            case 4:
            {
                r="Humano";
                break;
            }
        }
        switch(nacionalidad)
        {
            case 1:
            {
                n="Norfair";
                break;
            }
            case 2:
            {
                n="Brinstar";
                break;
            }
            case 3:
            {
                n="Maridia";
                break;
            }
            case 4:
            {
                n="Zebes";
                break;
            }
            case 5:
            {
                n="Crateria";
                break;
            }
        }
        switch(clase)
        {
            case 1:
            {
                c="Clerigo";
                break;
            }
            case 2:
            {
                c="Barbaro";
                break;
            }
            case 3:
            {
                c="Mago";
                break;
            }
            case 4:
            {
                c="Picaro";
                break;
            }
        }
        return  "nombre=" + nombre + "\ndescripcion=" + descripcion + "\nclase=" + c + "\nestatura=" + estatura + "\npeso=" + peso + "\nedad=" + edad + "\nraza=" + r + "\nnacionalidad=" + n + "\nHP=" + HP + "\nCS=" + CS + "\nAC=" + AC + "\nDG=" + DG ;
    }
    
    
 
}

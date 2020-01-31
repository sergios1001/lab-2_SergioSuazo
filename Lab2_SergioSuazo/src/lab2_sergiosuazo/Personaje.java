
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

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", clase=" + clase + ", estatura=" + estatura + ", peso=" + peso + ", edad=" + edad + ", raza=" + raza + ", nacionalidad=" + nacionalidad + ", HP=" + HP + ", CS=" + CS + ", AC=" + AC + ", DG=" + DG + '}';
    }
    
    
 
}

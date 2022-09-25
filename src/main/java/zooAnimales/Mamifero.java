package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal {
    private Mamifero[] listado;
    public int caballo;
    public int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero() {

    }  
    
    public Mamifero(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona,
            Mamifero[] listado, int caballo, int leones, boolean pelaje, int patas) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.caballo = caballo;
        this.leones = leones;
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public int cantidadMamiferos() {
        return this.caballo + this.leones;
    }
    
    public Mamifero crearCaballo(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona,
            Mamifero[] listado, int caballo, int leones, boolean pelaje, int patas) {
        Mamifero caballo = new Mamifero(totalAnimales, nombre, edad, "pradera", genero, zona, listado, caballo, leones, true, 4);
    }

    public Mamifero crearLeon(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona,
            Mamifero[] listado, int caballo, int leones, boolean pelaje, int patas) {
        Mamifero leon = new Mamifero(totalAnimales, nombre, edad, "selva", genero, zona, listado, caballo, leones, true, 4);
    }
}

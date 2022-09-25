package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal{
    private ArrayList<Pez> listado;
    public int salmones;
    public int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;
    
    public Pez() {

    }  
    
    public Pez(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona,
            ArrayList<Pez> listado, int salmones, int bacalaos, String colorEscamas, int cantidadAletas) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.salmones = salmones;
        this.bacalaos = bacalaos;
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public void crearSalmon(int salmones) {
        this.salmones = salmones;
        new Pez(totalAnimales, nombre, edad, "oceano", genero, zona, listado, salmones, bacalaos, "rojo", 6)
    }

    public void crearBacalao(int bacalaos) {
        this.bacalaos = bacalaos;
        new Pez(totalAnimales, nombre, edad, "oceano", genero, zona, listado, salmones, bacalaos, "gris", 6)
    }

    public int cantidadPeces() {
        return listado.size(); 
    }

    
}

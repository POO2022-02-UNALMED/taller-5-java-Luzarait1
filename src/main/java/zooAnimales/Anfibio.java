package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
    private ArrayList<Anfibio> listado;
    public int ranas;
    public int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio() {

    }  
    
    public Anfibio(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona,
            ArrayList<Anfibio> listado, int ranas, int salamandras, String colorPiel, boolean venenoso) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.ranas = ranas;
        this.salamandras = salamandras;
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public void crearRana(int ranas) {
        this.ranas = ranas;
        new Anfibio(totalAnimales, nombre, edad, "selva", genero, zona, listado, ranas, salamandras, "rojo", true);
    }

    public void crearSalamandra(int salamandras) {
        this.salamandras = salamandras;
        new Anfibio(totalAnimales, nombre, edad, "selva", genero, zona, listado, ranas, salamandras, "negro y amarillo", false);
    }

    
    

}

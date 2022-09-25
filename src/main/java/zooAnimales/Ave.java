package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
    private ArrayList<Ave> listado;
    public int halcones;
    public int aguila;
    private String colorPlumas;

    public Ave() {

    }  
    
    public Ave(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona,
            ArrayList<Ave> listado, int halcones, int aguila, String colorPlumas) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.halcones = halcones;
        this.aguila = aguila;
        this.colorPlumas = colorPlumas;
    }

    
    
    public void crearHalcon(int halcones) {
        this.halcones = halcones;
        new Ave(totalAnimales, nombre, edad, "montanas", genero, zona, listado, halcones, aguila, "cafe glorioso")
    }

    public void crearAguila(int aguila) {
        this.aguila = aguila;
        new Ave(totalAnimales, nombre, edad, "montanas", genero, zona, listado, halcones, aguila, "blanco y amarillo")
    }

    public int cantidadAves() {
        return listado.size(); 
    }


    
}

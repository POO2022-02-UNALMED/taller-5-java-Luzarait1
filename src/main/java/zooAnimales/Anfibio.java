package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
    private ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio() {

    }  
    
    public Anfibio(String nombre, int edad, String habitat, String genero,
            ArrayList<Anfibio> listado, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.listado = listado;
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public void crearRana(int ranas) {
        this.ranas = ranas;
        new Anfibio(nombre, edad, "selva", genero, listado, ranas, salamandras, "rojo", true);
    }

    public void crearSalamandra(int salamandras) {
        this.salamandras = salamandras;
        new Anfibio(nombre, edad, "selva", genero, listado, ranas, salamandras, "negro y amarillo", false);
    }

    public ArrayList<Anfibio> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Anfibio> listado) {
        this.listado = listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }


    
    

}

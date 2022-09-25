package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal{
    private ArrayList <Reptil> listado;
    public int iguanas;
    public int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil() {

    }  
    
    public Reptil(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona,
            ArrayList<Reptil> listado, int iguanas, int serpientes, String colorEscamas, int largoCola) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.iguanas = iguanas;
        this.serpientes = serpientes;
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public void setIguana(int iguanas) {
        this.iguanas = iguanas;
        new Reptil(totalAnimales, nombre, edad, "humedal", genero, zona, listado, iguanas, serpientes, "verde", 3)
    }

    public void crearSerpiente(int serpientes) {
        this.serpientes = serpientes;
        new Reptil(totalAnimales, nombre, edad, "jungla", genero, zona, listado, iguanas, serpientes, "blanco", 1)
    }
    
    public int cantidadReptiles() {
        return listado.size(); 
    }

    
}

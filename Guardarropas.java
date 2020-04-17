package com.mycompany.app;

import java.util.ArrayList;

public class Guardarropas {
    static Guardarropas instance;
    ArrayList<Prenda> prendas = new ArrayList<Prenda>();
    // ArrayList<TipoPrenda> tipos = new ArrayList<TipoPrenda>();
    // ArrayList<Color> colores = new ArrayList<Color>();


    public static Guardarropas getInstance() {
        if(instance == null) instance = new Guardarropas();
        return instance;
    }
    public void addPrenda(Prenda nuevaPrenda){
        prendas.add(nuevaPrenda);
    }
    // public void addTipoPrenda(TipoPrenda nuevoTipo){
    //     tipos.add(nuevoTipo);
    // }


}   
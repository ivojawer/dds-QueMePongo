package com.mycompany.app;

public class SinColor extends Color{
    public SinColor(){
        super("sin color");
    }    
    
    @Override
    public Boolean tieneColor(){
        return false;
    }
}
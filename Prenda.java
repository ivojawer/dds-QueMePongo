package com.mycompany.app;

public class Prenda {
    TipoPrenda tipo;
    Color colorPrimario;
    Color colorSecundario = new SinColor();

    public Prenda(TipoPrenda _tipo, Color _colorPrimario, Material _material) {
        construir(_tipo, _colorPrimario, new SinColor(), _material);
    }

    public Prenda(TipoPrenda _tipo, Color _colorPrimario, Color _colorSecundario, Material _material) {
        construir(_tipo, _colorPrimario, _colorSecundario, _material);
    }

    private void construir(TipoPrenda _tipo,Color _colorPrimario,Color _colorSecundario,Material _material){
        try {
            if(!_colorPrimario.tieneColor()) throw new Exception("Una prenda debe tener color primario");
            
        } catch (Exception e) {
            
        }
        colorPrimario=_colorPrimario;
        colorSecundario=_colorSecundario;
        tipo=_tipo;
    }
}
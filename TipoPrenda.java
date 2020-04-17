package com.mycompany.app;

public class TipoPrenda {
    CategoriaPrenda categoria;

    public TipoPrenda(CategoriaPrenda _categoria){
        categoria = _categoria;
    }

    public CategoriaPrenda getCategoria() {
        return categoria;
    }
}


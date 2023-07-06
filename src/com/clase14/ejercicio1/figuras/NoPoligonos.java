package com.clase14.ejercicio1.figuras;

import com.clase14.ejercicio1.figuras.Figura;

public abstract class NoPoligonos extends Figura {
    protected double radio;
    protected double pi = Math.PI;

    public void datosRadio(double radio) {
        this.radio = radio;
    }
}

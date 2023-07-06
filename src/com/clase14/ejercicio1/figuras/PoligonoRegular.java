package com.clase14.ejercicio1.figuras;

import com.clase14.ejercicio1.figuras.Figura;

public abstract class PoligonoRegular extends Figura {

    protected double base;
    protected double altura;
    protected double[] lados;
    protected int cantidadLados;

    public int getCantidadLados() {
        return cantidadLados;
    }
    public void datosArea(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }
    public void datosPerimetro(double... lados) {
        this.lados = lados;
    }

}

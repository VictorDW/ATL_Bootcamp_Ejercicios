package com.clase14.ejercicio1.figuras;

import com.clase14.ejercicio1.figuras.PoligonoRegular;

public class Triangulo extends PoligonoRegular {

   public Triangulo() {
       cantidadLados = 3;
   }
    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        return lados[0] + lados[1] + lados[2];
    }
}

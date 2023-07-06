package com.clase14.ejercicio1;

import com.clase14.ejercicio1.figuras.Figura;

public class MostrarFuncionalidad {
    public void mostrarArea(Figura figura, String tipoFigura) {

        System.out.printf("El area del " + tipoFigura + " es: %.1f \n", figura.area());
    }

    public void mostrarPerimetro(Figura figura, String tipoFigura) {

        System.out.printf("El perimetro del " + tipoFigura + " es: %.1f \n", figura.perimetro());
    }
}

package com.clase14.ejercicio1;

import com.clase14.ejercicio1.figuras.NoPoligonos;
import com.clase14.ejercicio1.figuras.PoligonoRegular;

import java.util.Map;
import java.util.Scanner;

public class GestionFiguras {
    private final Scanner teclado = new Scanner(System.in);
    private final Map <String, PoligonoRegular> poligonoRegularMap;
    private final Map <String, NoPoligonos> noPoligonoMap;
    private final MostrarFuncionalidad mostrarFuncionalidad = new MostrarFuncionalidad();

   public GestionFiguras(){

       CrearFiguras crearFiguras = new CrearFiguras();

       this.poligonoRegularMap = crearFiguras.crearPoligonosRegulares();
        this.noPoligonoMap = crearFiguras.crearNoPoligonos();
    }

    public void consultarAreaRegular(String tipoFigura){

       double base, altura;
       PoligonoRegular poligonoRegular;
       poligonoRegular = poligonoRegularMap.get(tipoFigura.toLowerCase());

        System.out.println("Escribe la base en cm");
        base = teclado.nextDouble();
        System.out.println("Escribe la altura en cm");
        altura = teclado.nextDouble();

       poligonoRegular.datosArea(base,altura);
       mostrarFuncionalidad.mostrarArea(poligonoRegular,tipoFigura);
    }

    public void consultarPerimetroRegular(String tipoFigura) {

         PoligonoRegular poligonoRegular;
         poligonoRegular = poligonoRegularMap.get(tipoFigura.toLowerCase());

         int cantidadLados = poligonoRegular.getCantidadLados();
         double[] lados = new double[cantidadLados];

           for(int index = 0; index < cantidadLados; index++) {
                 System.out.println("Escribe el valor el lado "+(index+1)+ " en cm");
                 lados[index] = teclado.nextDouble();
           }

           poligonoRegular.datosPerimetro(lados);
           mostrarFuncionalidad.mostrarPerimetro(poligonoRegular,tipoFigura);
    }

    public NoPoligonos consultarNoPoligonos(String tipoFigura) {

       double radio;
       NoPoligonos noPoligono;
       noPoligono = noPoligonoMap.get(tipoFigura.toLowerCase());

        System.out.println("Escribe el radio en cm");
        radio = teclado.nextDouble();

        noPoligono.datosRadio(radio);
        return noPoligono;
    }

    public  void  areaNoPoligono(String tipoFigura) {

        mostrarFuncionalidad.mostrarArea(consultarNoPoligonos(tipoFigura), tipoFigura);
    }
    public  void  perimetroNoPoligono(String tipoFigura) {

        mostrarFuncionalidad.mostrarPerimetro(consultarNoPoligonos(tipoFigura), tipoFigura);
    }

}

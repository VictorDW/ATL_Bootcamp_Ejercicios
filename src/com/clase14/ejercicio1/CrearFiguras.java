package com.clase14.ejercicio1;

import com.clase14.ejercicio1.figuras.*;

import java.util.HashMap;
import java.util.Map;

public class CrearFiguras {
    private Map<String, PoligonoRegular> poligonoRegularMap = new HashMap<>();
    private Map<String, NoPoligonos> noPoligonoMap = new HashMap<>();

    public Map<String, PoligonoRegular> crearPoligonosRegulares() {
        this.poligonoRegularMap.put("rectangulo", new Rectangulo());
        this.poligonoRegularMap.put("triangulo", new Triangulo());

        return poligonoRegularMap;
    }
    public Map<String, NoPoligonos> crearNoPoligonos() {
        this.noPoligonoMap.put("circulo", new Circulo());

        return noPoligonoMap;
    }
}

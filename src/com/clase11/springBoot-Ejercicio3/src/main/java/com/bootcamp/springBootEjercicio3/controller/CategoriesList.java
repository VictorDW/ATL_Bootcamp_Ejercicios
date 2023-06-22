package com.bootcamp.springBootEjercicio3.controller;


import com.bootcamp.springBootEjercicio3.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoriesList {

    private  final List<Category> categories = new ArrayList<>();


   private void addCategoryList() {

        Category category1 = new Category();
        category1.setCategory("Historia");
        category1.setDescription("Esta categoría abarca eventos, personajes y hechos importantes de la historia mundial. Pueden incluir preguntas sobre guerras, descubrimientos, revoluciones, líderes políticos y hitos históricos");

        Category category2 = new Category();
        category2.setCategory("Ciencia");
        category2.setDescription("En esta categoría, encontrarás preguntas relacionadas con los avances científicos, los principios fundamentales de la física, la química, la biología y la tecnología. También puede incluir temas como la exploración espacial, la informática y los inventos destacados.");

        Category category3 = new Category();
        category3.setCategory("Geografia");
        category3.setDescription("Aquí encontrarás preguntas relacionadas con los países, las capitales, los continentes, las montañas, los ríos y otros elementos geográficos del mundo. También puede incluir preguntas sobre maravillas naturales, monumentos famosos y características geográficas distintivas.");

        Category category4 = new Category();
        category4.setCategory("Cine");
        category4.setDescription("Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.");

        Category category5 = new Category();
        category5.setCategory("Arte");
        category5.setDescription("Esta categoría cubre el arte, la literatura, la música clásica, la pintura, la escultura y los movimientos artísticos importantes. Pueden incluir preguntas sobre pintores famosos, escritores célebres, obras literarias y términos artísticos.");

        Category category6 = new Category();
        category6.setCategory("Deportes");
        category6.setDescription("En esta categoría, se abordan preguntas relacionadas con una amplia variedad de deportes, como fútbol, baloncesto, tenis, béisbol, atletismo y muchos más. Pueden incluir preguntas sobre equipos, jugadores destacados, récords deportivos y eventos históricos del mundo deportivo.");


        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        categories.add(category4);
        categories.add(category5);
        categories.add(category6);

    }
    public  List<Category> getCategoriesList() {

        addCategoryList();

        return categories;
    }
}

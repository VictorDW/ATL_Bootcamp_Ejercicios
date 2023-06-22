package com.bootcamp.springBootEjercicio3.controller;

import com.bootcamp.springBootEjercicio3.entities.Question;

import java.util.*;

public class QuestionsList {

    private List<Question> questions = new ArrayList<>();

    private void addQuestionList(){

        Question question1 = new Question();
        question1.setCategory("Historia");
        question1.setQuestion("¿En qué año ocurrió la Revolución Francesa?");
        question1.setOptions("1776","1789","1812");
        question1.setAnswer(1);
        question1.setExplanation("La Revolución Francesa ocurrió en 1789, marcando el inicio de un periodo de cambios políticos y sociales en Francia y Europa.");

        Question question2 = new Question();
        question2.setCategory("Historia");
        question2.setQuestion("¿En qué año se firmó la Declaración de Independencia de los Estados Unidos?");
        question2.setOptions("1776", "1789", "1812");
        question2.setAnswer(0);
        question2.setExplanation("La Declaración de Independencia de los Estados Unidos fue firmada en 1776, proclamando la separación de las trece colonias americanas del dominio británico.");

        Question question3 = new Question();
        question3.setCategory("Historia");
        question3.setQuestion("¿En qué año se llevó a cabo la Revolución Rusa?");
        question3.setOptions("1776", "1789", "1917");
        question3.setAnswer(2);
        question3.setExplanation("La Revolución Rusa tuvo lugar en 1917, marcando el derrocamiento del régimen zarista y el ascenso del poder soviético liderado por los bolcheviques.");


        Question question4 = new Question();
        question4.setCategory("Ciencia");
        question4.setQuestion("¿Cuál es la distancia promedio entre la Tierra y el Sol?");
        question4.setOptions("92.96 millones de millas", "8.7 millones de millas", "150 millones de kilómetros");
        question4.setAnswer(0);
        question4.setExplanation("La distancia promedio entre la Tierra y el Sol es de aproximadamente 92.96 millones de millas, o 149.6 millones de kilómetros. Esta distancia se conoce como una unidad astronómica (UA).");

        Question question5 = new Question();
        question5.setCategory("Ciencia");
        question5.setQuestion("¿Cuál es el metal más ligero?");
        question5.setOptions("Oro", "Plata", "Aluminio");
        question5.setAnswer(2);
        question5.setExplanation("El aluminio es el metal más ligero en la tabla periódica. Tiene una densidad baja y es ampliamente utilizado en aplicaciones industriales y de construcción debido a su resistencia y ligereza.");


        Question question6 = new Question();
        question6.setCategory("Ciencia");
        question6.setQuestion("¿Cuál es la fórmula química del agua?");
        question6.setOptions("H2SO4", "NaCl", "H2O");
        question6.setAnswer(2);
        question6.setExplanation("La fórmula química del agua es H2O. Esto significa que una molécula de agua está compuesta por dos átomos de hidrógeno (H) y uno de oxígeno (O). El agua es esencial para la vida en la Tierra y es conocida por su importancia en los procesos biológicos.");

        Question question7 = new Question();
        question7.setCategory("Geografia");
        question7.setQuestion("¿Cuál es el país más grande del mundo en términos de superficie?");
        question7.setOptions("Rusia", "Canadá", "Estados Unidos");
        question7.setAnswer(0);
        question7.setExplanation("La respuesta correcta es Rusia. Con una superficie de aproximadamente 17.1 millones de kilómetros cuadrados, Rusia es el país más grande del mundo.");

        Question question8 = new Question();
        question8.setCategory("Geografia");
        question8.setQuestion("¿Cuál es el río más largo del mundo?");
        question8.setOptions("Amazonas", "Nilo", "Misisipi");
        question8.setAnswer(1);
        question8.setExplanation("La respuesta correcta es el Nilo. Con una longitud de aproximadamente 6,650 kilómetros, el Nilo es considerado el río más largo del mundo.");

        Question question9 = new Question();
        question9.setCategory("Geografia");
        question9.setQuestion("¿Cuál es la capital de Australia?");
        question9.setOptions("Melbourne", "Sídney", "Canberra");
        question9.setAnswer(2);
        question9.setExplanation("La respuesta correcta es Canberra. Aunque Melbourne y Sídney son ciudades importantes en Australia, Canberra es la capital del país y alberga las instituciones gubernamentales.");

        Question question10 = new Question();
        question10.setCategory("Cine");
        question10.setQuestion("¿Qué director dirigió la trilogía del El Padrino?");
        question10.setOptions("Martin Scorsese", "Francis Ford Coppola", "Steven Spielberg");
        question10.setAnswer(1);
        question10.setExplanation("La respuesta correcta es Francis Ford Coppola. Él fue el director de la trilogía del El Padrino, una de las obras maestras del cine.");

        Question question11 = new Question();
        question11.setCategory("Cine");
        question11.setQuestion("¿Cuál de las siguientes películas fue dirigida por Christopher Nolan?");
        question11.setOptions("Pulp Fiction", "Inception", "The Avengers");
        question11.setAnswer(1);
        question11.setExplanation("La respuesta correcta es Inception. Christopher Nolan fue el director de esta aclamada película de ciencia ficción que se caracteriza por su compleja trama y sorprendentes efectos visuales.");

        Question question12 = new Question();
        question12.setCategory("Cine");
        question12.setQuestion("¿Quién interpretó el papel de Tony Stark / Iron Man en el Universo Cinematográfico de Marvel?");
        question12.setOptions("Robert Downey Jr.", "Chris Evans", "Chris Hemsworth");
        question12.setAnswer(0);
        question12.setExplanation("La respuesta correcta es Robert Downey Jr. Él interpretó el icónico papel de Tony Stark / Iron Man en el Universo Cinematográfico de Marvel, ganándose el cariño del público con su carismático y carismático desempeño.");

        Question question13 = new Question();
        question13.setCategory("Arte");
        question13.setQuestion("¿Quién pintó la famosa obra 'La Mona Lisa'?");
        question13.setOptions("Pablo Picasso", "Leonardo da Vinci", "Vincent van Gogh");
        question13.setAnswer(1);
        question13.setExplanation("La Mona Lisa fue pintada por Leonardo da Vinci. Es una de las pinturas más reconocidas en la historia del arte y se encuentra en el Museo del Louvre en París, Francia.");

        Question question14 = new Question();
        question14.setCategory("Arte");
        question14.setQuestion("¿Cuál de los siguientes artistas es conocido por sus esculturas en mármol blanco?");
        question14.setOptions("Michelangelo", "Salvador Dalí", "Frida Kahlo");
        question14.setAnswer(0);
        question14.setExplanation("Michelangelo es conocido por sus esculturas en mármol blanco, como el famoso David y La Piedad. Sus obras maestras se destacan por su detalle y realismo.");

        Question question15 = new Question();
        question15.setCategory("Arte");
        question15.setQuestion("¿Cuál de las siguientes corrientes artísticas se caracteriza por el uso de formas geométricas y líneas rectas?");
        question15.setOptions("Impresionismo", "Renacimiento", "Cubismo");
        question15.setAnswer(2);
        question15.setExplanation("El cubismo se caracteriza por el uso de formas geométricas y líneas rectas que representan objetos desde múltiples perspectivas. Pablo Picasso y Georges Braque son reconocidos como los principales exponentes del cubismo.");

        Question question16 = new Question();
        question16.setCategory("Deportes");
        question16.setQuestion("¿En qué año se celebraron los primeros Juegos Olímpicos modernos?");
        question16.setOptions("1896", "1904", "1920");
        question16.setAnswer(0);
        question16.setExplanation("Los primeros Juegos Olímpicos modernos se celebraron en el año 1896 en Atenas, Grecia.");

        Question question17 = new Question();
        question17.setCategory("Deportes");
        question17.setQuestion("¿Cuál es el deporte más popular en Estados Unidos?");
        question17.setOptions( "Béisbol", "Baloncesto","Fútbol americano");
        question17.setAnswer(2);
        question17.setExplanation("El fútbol americano es considerado el deporte más popular en Estados Unidos en términos de espectadores, audiencia y participación.");

        Question question18 = new Question();
        question18.setCategory("Deportes");
        question18.setQuestion("¿Cuál es el máximo goleador en la historia de la Copa del Mundo de la FIFA?");
        question18.setOptions( "Lionel Messi", "Ronaldo Nazário", "Pelé");
        question18.setAnswer(2);
        question18.setExplanation("Pelé es el máximo goleador en la historia de la Copa del Mundo de la FIFA, habiendo marcado un total de 77 goles en su carrera en torneos de la Copa del Mundo.");


        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);
        questions.add(question9);
        questions.add(question10);
        questions.add(question11);
        questions.add(question12);
        questions.add(question13);
        questions.add(question14);
        questions.add(question15);
        questions.add(question16);
        questions.add(question17);
        questions.add(question18);

    }

    public List<Question> getQuestionsList(){

        addQuestionList();

        return questions;
    }
}

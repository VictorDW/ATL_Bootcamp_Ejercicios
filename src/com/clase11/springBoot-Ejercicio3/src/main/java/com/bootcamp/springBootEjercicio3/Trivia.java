package com.bootcamp.springBootEjercicio3;

import com.bootcamp.springBootEjercicio3.controller.CategoriesList;
import com.bootcamp.springBootEjercicio3.controller.QuestionsList;
import com.bootcamp.springBootEjercicio3.entities.Category;
import com.bootcamp.springBootEjercicio3.entities.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class Trivia {


    @GetMapping("/categories")
    public List<Category> getCategories(){

        CategoriesList categoriesList = new CategoriesList();

        return categoriesList.getCategoriesList();
    }

    @GetMapping("/question/{category}")
    public Question getQuestions(@PathVariable String category){

        QuestionsList questionsList = new QuestionsList();
        List<Question>questionFilter = new ArrayList<>();
        Random random = new Random();
        int numRandom;

        for (Question question: questionsList.getQuestionsList()) {

            if (question.getCategory().equals(category)) {
                questionFilter.add(question);
            }
        }

        if(questionFilter.size() > 0) {
            numRandom = random.nextInt(questionFilter.size());
           return questionFilter.get(numRandom);
        }else{
            numRandom = random.nextInt(questionsList.getQuestionsList().size());
            return questionsList.getQuestionsList().get(numRandom);
        }

    }
}

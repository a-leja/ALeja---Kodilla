package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.reference.Styles;

import com.kodilla.stream.book.BookDirectory;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);


        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);



        PoemBeautifier poemBeautifier = new PoemBeautifier();

        //lambdas
        poemBeautifier.beautify("First sample text", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Second sample text", text -> text.toUpperCase());
        poemBeautifier.beautify("Fourth sample text", text -> text + " - the sixth letter of the text is: " + text.charAt(6));
        poemBeautifier.beautify("Fifth sample text", text -> "The length of the text: " + text + " is: " + text.length());
        poemBeautifier.beautify("Sixth sample text", text -> text.toLowerCase());

        //method references
        poemBeautifier.beautify("First sample text", Styles::addABCToTheString);
        poemBeautifier.beautify("Second sample text", Styles::convertTheStringToCapitalLetters);
        poemBeautifier.beautify("Fourth sample text", Styles::convertTheStringToChar);
        poemBeautifier.beautify("Fifth sample text", Styles::checkTextLength);
        poemBeautifier.beautify("Sixth sample text", Styles::convertTheStringToLowerCaseLetters);


        //Stream sample exercise
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);



        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);



        //Kaskadowe łączenie operacji na Stream
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);



        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);




        //ForumUser exercise 7.3
        Forum forum = new Forum();

        Map<Integer, ForumUser> MapOfForumUsers = forum.getUserList().stream()
            .filter(f -> f.getSex() == 'M')
                .filter(f -> f.getDateOfBirth().isAfter(LocalDate.of(1992, 2, 19)))
            .filter(f -> f.getPosts() >=1)
            .collect(Collectors.toMap(v -> v.getPosts(), v-> v));



        System.out.println("# elements in the Map: " + MapOfForumUsers.size());
        MapOfForumUsers.entrySet().stream()
            .map(entry -> entry.getKey() + ": " + entry.getValue())
            .forEach(System.out::println);
    }

}

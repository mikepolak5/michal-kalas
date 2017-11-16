package com.kodilla.stream;

import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        String base = "ABC:";
        String f = "efg";
        String o = "ijk";
        String a = "lol";
        String v = "ZUREK Z KIELBASA";

/*        poemBeautifier.beutify(base, f, (s, d) -> base + f);
        poemBeautifier.beutify(base, o, (s, d) -> base + o);
        poemBeautifier.beutify(f, base, (s, d) -> f + base);
        poemBeautifier.beutify(o, base, (s, d) -> o + base);

        poemBeautifier.toUpperCase(a, o, (s, d) -> a + o);
        poemBeautifier.toUpperCase(a, "", (s, d) -> a);

        poemBeautifier.toLowerCase(base, v, (s, d) -> base + v);
        poemBeautifier.toLowerCase("", v, (s, d) -> v);

        poemBeautifier.spaceBetweenLetters(v, "", (s, d) -> v);*/

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        poemBeautifier.beautify("hello", s -> "ABC" + s);
        poemBeautifier.beautify("hello", s -> "ABC" + s.substring(0,2).toUpperCase());
        poemBeautifier.beautify("hello", s -> {
            for( int n = 0; n < 10; n++) {
                s = s + n;
            }
            return s;
        });
        poemBeautifier.beautify("ZUREK", s -> s.toLowerCase());
        poemBeautifier.beautify("ZUREK", s -> s.replace("", " ").trim());
    }
}
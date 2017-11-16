package com.kodilla.stream.beautifier;


public class PoemBeautifier {
/*    public String beutify(String s, String d, PoemDecorator poemDecorator) {
        poemDecorator.decorate(s, d);
        System.out.println("Prefix/Suffix ABC has been added: " + s + d);
        return s + d;
    }
    public String toUpperCase(String s, String d, PoemDecorator poemDecorator) {
        poemDecorator.decorate(s.toUpperCase(), d.toUpperCase());
        System.out.println("Upper Case added: " + s.toUpperCase() + d.toUpperCase());
        return s.toUpperCase() + d.toUpperCase();
    }
    public String toLowerCase(String s, String d, PoemDecorator poemDecorator) {
        poemDecorator.decorate(s.toLowerCase(), d.toLowerCase());
        System.out.println("Lower Case added: " + s.toLowerCase() + d.toLowerCase());
        return s.toLowerCase() + d.toLowerCase();
    }
    public void spaceBetweenLetters(String s, String d, PoemDecorator poemDecorator) {
        poemDecorator.decorate(s, d);
        System.out.println("Spaces between letters added: " + s.replace("", " ").trim() +
                d.replace("", " ").trim());

    }*/
    public void beautify(String s, PoemDecorator poemDecorator) {
        System.out.println(poemDecorator.decorate1(s));
    }
}

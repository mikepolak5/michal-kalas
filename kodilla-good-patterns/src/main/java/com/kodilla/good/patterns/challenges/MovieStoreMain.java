package com.kodilla.good.patterns.challenges;


public class MovieStoreMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .map(entry -> entry.getValue() +"!")
                .forEach(System.out::print);
    }
}

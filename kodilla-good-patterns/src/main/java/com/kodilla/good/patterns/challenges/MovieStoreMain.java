package com.kodilla.good.patterns.challenges;


import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String result = movieStore.getMovies().entrySet().stream()
                .map(entry -> entry.getValue() + "")
                .collect(Collectors.joining("!"));
        System.out.print(result);

    }
}

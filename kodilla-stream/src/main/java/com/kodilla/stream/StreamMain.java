package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
/*        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/

        Forum theForum = new Forum();
/*        List <ForumUser> theResultListOfForumUsers = theForum.getForumUsers().stream()
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() > 1997)
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser -> forumUser.getPostsNumber() > 1)
                .collect(Collectors.toList());*/

        Map<Integer, ForumUser> theResultMapOfForum = theForum.getForumUsers().stream()
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() <= 1997)
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser -> forumUser.getPostsNumber() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("# users: " + theResultMapOfForum.size());
        theResultMapOfForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
/*
        System.out.println("# elements: " + theResultListOfForumUsers.size());
        theResultListOfForumUsers.stream()
                .forEach(System.out::println);

        System.out.println(theResultListOfForumUsers);*/

/*        World world = new World();
        Continent continent = new Continent();
        Country country = new Country("Poland", new BigDecimal("38000000"));
        world.addContinent(continent);
        continent.addCountry(country);*/

    }
}
package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1, "terry", 'm', 1990, 6,
                14, 10));
        forumUsers.add(new ForumUser(2, "madeline", 'f', 2000, 11,
                11, 50));
        forumUsers.add(new ForumUser(3, "yolo", 'm', 1967, 9,
                28, 0));
        forumUsers.add(new ForumUser(4, "super23", 'f', 1983, 12,
                9, 3));
        forumUsers.add(new ForumUser(5, "greedyMan", 'm', 2002, 2,
                2, 0));
    }

    public List<ForumUser> getForumUsers() {
        return new ArrayList<>(forumUsers);
    }
}

package com.kodilla.patterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);

        //When
        javaHelpForum.addPost("Hi everyone! Could you help me with for loop?");
        javaHelpForum.addPost("Better try to use while loop in this case.");
        javaToolsForum.addPost("Help pls, my MySQL db doesn't want to work :(");
        javaHelpForum.addPost("Why while? Is it better?");
        javaToolsForum.addPost("When I try to log in I got 'bad credentials' message.");

        //Then
        Assert.assertEquals(3, johnSmith.getUpdateCount());
        Assert.assertEquals(2, ivoneEscobar.getUpdateCount());
        Assert.assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
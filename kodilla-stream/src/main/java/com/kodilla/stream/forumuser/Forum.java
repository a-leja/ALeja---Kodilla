package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Forum {
    private final List<ForumUser> ListOfForumUsers = new ArrayList<>();

    public Forum() {
        ListOfForumUsers.add(new ForumUser(001, "Michael S.", 'M', LocalDate.of(1985, 6, 21),231));
        ListOfForumUsers.add(new ForumUser(002, "Sarah M.", 'F', LocalDate.of(1985, 6, 21),11));
        ListOfForumUsers.add(new ForumUser(003, "Peter L.", 'M', LocalDate.of(1985, 6, 21),402));
        ListOfForumUsers.add(new ForumUser(004, "Olivia K.", 'F', LocalDate.of(1985, 6, 21),0));
        ListOfForumUsers.add(new ForumUser(005, "Magdalena G.", 'F', LocalDate.of(1985, 6, 21),106));
        ListOfForumUsers.add(new ForumUser(006, "Chris K.", 'M', LocalDate.of(1985, 6, 21),2));
    }


    public List<ForumUser> getUserList() {
        return new ArrayList<>(ListOfForumUsers);
    }
}

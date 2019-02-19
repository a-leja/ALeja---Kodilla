package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;


public class Forum {
    private final List<ForumUser> ListOfForumUsers = new ArrayList<>();

    public Forum() {
        ListOfForumUsers.add(new ForumUser(001, "Michael S.", 'M', 1985-6-21,231));
        ListOfForumUsers.add(new ForumUser(002, "Sarah M.", 'F', 1995-4-11,11));
        ListOfForumUsers.add(new ForumUser(003, "Peter L.", 'M', 1999-12-23,402));
        ListOfForumUsers.add(new ForumUser(004, "Olivia K.", 'F', 1971-11-11,0));
        ListOfForumUsers.add(new ForumUser(005, "Magdalena G.", 'F', 1982-8-16,106));
        ListOfForumUsers.add(new ForumUser(006, "Chris K.", 'M', 1992-3-29,2));
    }


    public List<ForumUser> getUserList() {
        return new ArrayList<>(ListOfForumUsers);
    }
}

package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int identificator;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int posts;

    public ForumUser(int identificator, String userName, char sex, LocalDate dateOfBirth, int posts) {
        this.identificator = identificator;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.posts = posts;
    }


    public int getIdentificator() {
        return identificator;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPosts() {
        return posts;
    }


    @Override
    public String toString() {
        return "ForumUser{" +
                "identificator=" + identificator +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", posts=" + posts +
                '}';
    }
}

package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private int userId;
    private String userName;
    private char sex;
    private LocalDate birthdate;
    private int postsNumber;

    public ForumUser(int userId, String userName, char sex, LocalDate birthdate, int postsNumber) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthdate = birthdate;
        this.postsNumber = postsNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "Forumuser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
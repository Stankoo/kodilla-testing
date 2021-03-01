package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1, "patryk12", 'M',
                LocalDate.of(1998, 10, 24), 23));
        theForumUserList.add(new ForumUser(2, "marta86", 'F',
                LocalDate.of(1986, 1, 2), 153));
        theForumUserList.add(new ForumUser(3, "łysy123", 'M',
                LocalDate.of(2002, 8, 15), 54));
        theForumUserList.add(new ForumUser(4, "patrycja_122", 'F',
                LocalDate.of(1998, 4, 11), 12));
        theForumUserList.add(new ForumUser(5, "gruby1", 'M',
                LocalDate.of(1994, 12, 12), 0));
        theForumUserList.add(new ForumUser(6, "piotr0", 'M',
                LocalDate.of(1989, 7, 13), 142));
        theForumUserList.add(new ForumUser(7, "maciej53", 'M',
                LocalDate.of(1998, 10, 25), 23));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
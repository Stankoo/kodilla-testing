package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

import static java.time.LocalDate.now;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("poem", poem -> "ABC" + poem + "ABC");
        poemBeautifier.beautify("poem", String::toUpperCase);
        PoemDecorator poemDotter = poem -> {
            if ( !poem.endsWith(".") ) {
                poem = poem + ".";
            }
            return  poem;
        };
        poemBeautifier.beautify("poem", poemDotter);
        poemBeautifier.beautify("poem", poem -> "Beginning: " + poem);




    Forum forum = new Forum();
        Map<Integer, ForumUser> theResultUserList = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthdate().isBefore(now().minusYears(20)))
                .filter(forumUser -> forumUser.getPostsNumber() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        theResultUserList.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
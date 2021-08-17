package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {

        double avgNumberOfPostUsersOver40 = UsersRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("average number of posts by users of age 40 or older: " + avgNumberOfPostUsersOver40);

        double avgNumberOfPostUsersUnder40 = UsersRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("average number of posts by users under the age of 40: " + avgNumberOfPostUsersUnder40);
    }
}
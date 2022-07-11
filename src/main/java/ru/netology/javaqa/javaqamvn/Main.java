package ru.netology.javaqa.javaqamvn;

import ru.netology.javaqa.javaqamvn.FormDate;

public class Main {

    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passportNumber = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;

        post.birthday = new FormDate();

        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }
}

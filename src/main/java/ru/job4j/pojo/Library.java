package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book("The Complete Coding Interview Guide in Java", 788);
        Book bookTwo = new Book("Структуры данных и алгоритмы в Java", 704);
        Book bookThree = new Book("Spring Boot по-быстрому", 352);
        Book bookFour = new Book("Clean code", 464);
        Book[] librarys = new Book[4];
        librarys[0] = bookOne;
        librarys[1] = bookTwo;
        librarys[2] = bookThree;
        librarys[3] = bookFour;
        for (int index = 0; index < librarys.length; index++) {
            Book library = librarys[index];
            System.out.println(library.getName() + " - " + library.getCount());
        }
        librarys[0] = bookFour;
        librarys[3] = bookOne;
        for (int index = 0; index < librarys.length; index++) {
            Book library = librarys[index];
            System.out.println(library.getName() + " - " + library.getCount());
        }
        for (int index = 0; index < librarys.length; index++) {
            Book library = librarys[index];
            if (library.getName().equals("Clean code")) {
                System.out.println(library.getName() + " - " + library.getCount());
            }
        }
    }
}
